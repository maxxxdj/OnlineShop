package UserPackage;

import Containers.ReviewsContainer;

public class Client extends User {

    private Address address;
    private String phone;

    public Client(String username, String password) {
        super(username, password);
    }


    //User Methods
    @Override
    public void changePassword(String password) {
        super.changePassword(password);
    }

    @Override
    public void changeUsername(String username) {
        super.changeUsername(username);
    }


    //Getters and setters

    public String getUsername(){
        return super.getUsername();
    }


    public String getPhone() {
        return this.phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    protected void setAddress(Address address) {
        this.address = address;
    }
}

