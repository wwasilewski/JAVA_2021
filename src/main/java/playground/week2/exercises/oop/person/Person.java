package playground.week2.exercises.oop.person;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;

    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void introduce() {
        System.out.println("name: " + name + " surname: " + surname);
    }

    public void showAddress() {
        System.out.println(address.getCountry() + " " + address.getCity() + " " +
                address.getStreet() + " " + address.getHomeNo() + "/" + address.getFlatNo());
    }
}
