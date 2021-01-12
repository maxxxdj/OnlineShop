package UserPackage;

import Containers.ReviewsContainer;

public class Client extends User {

    private String username;
    private String password;
    private Address address;


    protected Client(String name, String lastName, String email, String phone
            , String username, String password, Address address) {
        super(name, lastName, email, phone);
        this.username = username;
        this.password = password;
        this.address = address;
    }

    @Override
    public void changePassword(String password) {
        this.password = password;
    }

    @Override
    public void changeUsername(String username) {
        this.username = username;
    }


    public void changeAddress(Address address) {
        this.address = address;
    }

    void writeReview(String string, String review){
            ReviewsContainer container = new ReviewsContainer();
            container.addReview(this.username,review);
    }



}

