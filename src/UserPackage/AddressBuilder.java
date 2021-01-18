package UserPackage;

public class AddressBuilder extends Address {
    private Address address;

    public AddressBuilder() {
        this.address = new Address();
    }

    public AddressBuilder withCountry(String country) {
        this.address.setCountry(country);
        return this;
    }
    public AddressBuilder withCity(String city){
        this.address.setCity(city);
        return this;
    }
    public AddressBuilder withZipCode(int zipCode){
        this.address.setZipcode(zipCode);
        return this;
    }
    public AddressBuilder withStreet(String street){
        this.address.setStreet(street);
        return this;
    }
    public AddressBuilder withPhone(String phone){
        this.address.setPhone(phone);
        return this;
    }
    public Address build(){
        return this.address;
    }
}
