package UserPackage;

public abstract class User implements UserInterface {
    private String name;
    private String lastName;
    private String email;
    private String phone;



    protected User(String name, String lastName, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }


}
