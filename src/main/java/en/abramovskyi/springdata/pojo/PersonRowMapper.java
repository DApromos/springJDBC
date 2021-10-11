package en.abramovskyi.springdata.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {



    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        String name = resultSet.getString("first_name") + resultSet.getString("last_name");
        return new Person(name);
    }
}
