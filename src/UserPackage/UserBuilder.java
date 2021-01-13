package UserPackage;

public class UserBuilder {
    private User client;

    //private String name;
    //    private String lastName;
    //    private String email;
    //    private String phone;
    //    private Address address;
    public UserBuilder(Client client){

    }

    public UserBuilder withName(String name){
        client.setName(name);
        return this;
    }
    public UserBuilder withLastName(String lastName){
        client.setLastName(lastName);
        return this;
    }
    public UserBuilder withEmail(String email){
        client.setEmail(email);
        return this;
    }

}
