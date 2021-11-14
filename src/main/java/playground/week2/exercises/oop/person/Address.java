package playground.week2.exercises.oop.person;

public class Address {
    private String street;
    private String city;
    private String country;
    private int flatNo;
    private int homeNo;

    public Address(String street, String city, String country, int homeNo, int flatNo) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getHomeNo() {
        return homeNo;
    }

    public int getFlatNo() {
        return flatNo;
    }
}
