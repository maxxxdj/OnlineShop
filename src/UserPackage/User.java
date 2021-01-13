package UserPackage;

import Containers.ReviewsContainer;
import enums.CustomerStatus;

public abstract class User implements UserInterface {
    private String username;
    private String password;
    private String name;
    private String lastName;
    private String email;
    private CustomerStatus status;

    protected User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    //Functional Methods
    @Override
    public void changeUsername(String username) {
        this.username = username;
    }

    @Override
    public void changePassword(String password) {
        this.password = password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void writeReview(String review){
        ReviewsContainer.addReview(getUsername(),review);
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
}
