import Cart.Product;
import Containers.ReviewsContainer;
import UserPackage.Admin;
import UserPackage.Client;
import UserPackage.User;
import UserPackage.UserBuilder;
import enums.AccountStatus;
import enums.AccountType;
import enums.ProductType;

public class Main {
    public static void main(String[] args) {

        ReviewsContainer.getInstance();


        //Client creation and testing functions;
        User client = new UserBuilder(AccountType.USER,"Mitko123","Mita4eto123").build();

        Product hairDryer = new Product(ProductType.HAIRDRYER,79,"750W","Rowenta");
        client.addToCart(hairDryer);
        System.out.printf("Your total bill is %.2fBGN.%n",client.checkout().getSum());
        client.writeReview("Mnogo hubav seshoar!");

        //Admin creation and banning;
        Admin admin = (Admin) new UserBuilder(AccountType.ADMIN,"SuperMARIO","Admin123").build();
        admin.setAccountStatus(client, AccountStatus.BLOCKED);
        System.out.println(client.getStatus());
    }
}
