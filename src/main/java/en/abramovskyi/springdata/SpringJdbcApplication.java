package en.abramovskyi.springdata;

import en.abramovskyi.springdata.pojo.Person;
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

        Person person4 = new Person(2, "Alex", "Ivanov", "Boston");
//        Person person5 = new Person(5, "Nick", "Jonson", "Chicago");
//        Person person6 = new Person(6, "Josh", "Nelson", "Washington");
//        Person person7 = new Person(7, "Ross", "Galaher", "New York");
//        Person person8 = new Person(8, "Monika", "Galaher", "New York");
//        Person person9 = new Person(9, "Chandler", "Bing", "New York");

        personJdbcDao.insert(person4);
//        personJdbcDao.insert(person2);
//        personJdbcDao.insert(person3);

//        System.out.println(personJdbcDao.findAll());

//        System.out.println("*********************************************************************");
//        System.out.println(personJdbcDao.findPeopleByCity("Boston"));
//        System.out.println("*********************************************************************");
//        System.out.println(personJdbcDao.delete(2));


    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);


    }

}
