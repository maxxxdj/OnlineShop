package UserPackage;

public class Admin extends User {
    private String username;
    private String password;

    protected Admin(String name, String lastName, String email, String phone) {
        super(name, lastName, email, phone);
    }

    @Override
    public void changeUsername(String username) {
        this.username = username;
    }

    @Override
    public void changePassword(String password) {
        this.password = password;
    }


}
