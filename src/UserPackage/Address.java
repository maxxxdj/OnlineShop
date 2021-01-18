package UserPackage;

public class Address {
    private String country;
    private String city;
    private int zipcode;
    private String street;
    private String phone;

    public Address() {
    }

    public String getCountry() {
        return country;
    }
    protected void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    protected void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    protected void setStreet(String street) {
        this.street = street;
    }

    public String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }
}
