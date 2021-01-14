import Cart.Product;
import Containers.ReviewsContainer;
import UserPackage.Admin;
import UserPackage.Client;
import UserPackage.User;
import enums.CustomerStatus;
import enums.ProductType;

public class Main {
    public static void main(String[] args) {

        ReviewsContainer.getInstance();


        //Client creation and testing functions;
        Client client = new Client("Mitko1234","Mita4eto123");

        Product hairDryer = new Product(ProductType.HAIRDRYER,79,"750W","Rowenta");
        client.addToCart(hairDryer);
        System.out.println(client.checkout().getSum());
        client.writeReview("Mnogo hubav seshoar!");

        //Admin creation and banning;
        Admin admin = new Admin("Admin","Admin123");
        admin.setAccountStatus(client, CustomerStatus.BLOCKED);
        System.out.println(client.getStatus());
    }
}
