package en.abramovskyi.springdata;

import en.abramovskyi.springdata.entity.Person;
import en.abramovskyi.springdata.jdbc.PersonJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

    @Autowired
    PersonJdbcDao personJdbcDao;

    @Override
    public void run(String... args) throws Exception {

        Person person1 = new Person(1, "John", "Smith", "Boston");
        Person person2 = new Person(2, "Anna", "Jonson", "Chicago");
        Person person3 = new Person(3, "Patrick", "Nelson", "Washington");

        personJdbcDao.insert(person1);
        personJdbcDao.insert(person2);
        personJdbcDao.insert(person3);

        System.out.println(personJdbcDao.findAll());

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);


    }

}
