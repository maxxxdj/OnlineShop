package UserPackage;

import Containers.ReviewsContainer;
import enums.AccountStatus;

public class User implements UserInterface {
    private String username;
    private String password;
    private String name;
    private String lastName;
    private String email;
    private AccountStatus status;

    protected User() {
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected String getPassword() {
        return this.password;
    }

    protected void setName(String name) {
        this.name = name;
    }
    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected void setEmail(String email) {
        this.email = email;
    }


    protected void setAccountStatus(AccountStatus status) {
        this.status = status;
    }

    //Functional Methods
    @Override
    public void changeUsername(String username,String password) {
        if (password.equals(this.password)) {
            this.username = username;
        }
    }
    protected void changeUsername(String username) {
            this.username = username;
        }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        if(oldPassword.equals(this.password)) {
            this.password = password;
        }
    }
    public void changePassword(String newPassword) {
            this.password = newPassword;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void writeReview(String review) {
        ReviewsContainer.addReview(this, review);
    }

    public AccountStatus getStatus() {
        return status;
    }
}
