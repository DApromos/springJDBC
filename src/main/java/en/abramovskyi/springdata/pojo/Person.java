package en.abramovskyi.springdata.pojo;


public class Person {

    private int id;
    private String name;
//    private String lastName;
    private String address;

    public Person() {
    }

    public Person(String firstName) {

        this.name = firstName;

    }

    public Person(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.name = firstName;

        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getLastName() {
//        return lastName;
//    }

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", firstName='" + name + '\'' +
//                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
