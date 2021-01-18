package UserPackage;

import enums.AccountStatus;
import enums.AccountType;

public class UserBuilder {
    private User user;


    public UserBuilder(AccountType type,String username, String password){
        switch(type){
            case ADMIN, MODERATOR -> this.user = new Admin();
            case USER -> this.user = new Client();
        }
        assert this.user != null;
        this.user.setUsername(username);
        this.user.setPassword(password);
        this.user.setStatus(AccountStatus.ACTIVE);
    }


    public UserBuilder withName(String name){
        this.user.setName(name);
        return this;
    }
    public UserBuilder withLastName(String lastName){
        this.user.setLastName(lastName);
        return this;
    }
    public UserBuilder withPhone(String phone){
        this.user.setPhone(phone);
        return this;
    }
    public UserBuilder withAddress(AddressBuilder address){
        this.user.setAddress(address.build());
        return this;
    }
    public UserBuilder withEmail(String email){
        this.user.setEmail(email);
        return this;
    }

    public User build(){
        return this.user;
    }

}
