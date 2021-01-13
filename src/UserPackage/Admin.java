package UserPackage;

import enums.CustomerStatus;

public class Admin extends User {


    protected Admin(String username, String password) {
        super(username, password);
    }

    private void setStatus(Client client, CustomerStatus status){
        client.setStatus(status);
    }

}
