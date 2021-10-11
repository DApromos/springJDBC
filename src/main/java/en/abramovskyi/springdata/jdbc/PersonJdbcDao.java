package en.abramovskyi.springdata.jdbc;

import en.abramovskyi.springdata.pojo.Person;
import en.abramovskyi.springdata.pojo.PersonRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonJdbcDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;



    public List<Person> findAll(){
        List<Person> people = jdbcTemplate.query("select * from jpa.person",
                new PersonRowMapper());
        return people;
    }


    public List<Person> findPeopleByCity(String city){
        List<Person> people = jdbcTemplate.query("select * from jpa.person " +
                        "where address=\'" + city + "\' order by id",
                new BeanPropertyRowMapper<>(Person.class));
        return people;
    }

    public int insert(Person person){
        return jdbcTemplate.update("insert into jpa.person " +
                "(id, first_name, last_name, address) " +
                "values (?, ?, ?, ?)",
                person.getId(), person.getName(), " select 1 ", person.getAddress());

    }

    public int delete(int personID){
        return jdbcTemplate.update("delete from jpa.person where id=" + personID);
    }

}
