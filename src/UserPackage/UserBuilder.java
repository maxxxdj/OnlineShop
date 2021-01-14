package UserPackage;

public class UserBuilder {
    private User user;


    private UserBuilder(Client client){
    }

    public UserBuilder withName(String name){
        user.setName(name);
        return this;
    }
    public UserBuilder withLastName(String lastName){
        user.setLastName(lastName);
        return this;
    }
    public UserBuilder withEmail(String email){
        user.setEmail(email);
        return this;
    }

}
