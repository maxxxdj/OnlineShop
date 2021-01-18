import Cart.Product;
import Containers.ReviewsContainer;
import UserPackage.*;


import static enums.AccountStatus.BLOCKED;
import static enums.AccountType.ADMIN;
import static enums.AccountType.USER;
import static enums.ProductType.HAIRDRYER;

public class Main {
    public static void main(String[] args) {

        ReviewsContainer.getInstance();


        //Client creation and testing functions;
        User client = new UserBuilder(USER, "Mitko123", "Mita4eto123")
                        .withAddress(new AddressBuilder().withStreet("Nishava 2"))
                        .withEmail("mitko@abv.bg").build();

        Product hairDryer = new Product(HAIRDRYER, 79, "750W", "Rowenta");
        client.addToCart(hairDryer);
        System.out.printf("Your total bill is %.2fBGN.%n", client.checkout().getSum());
        client.writeReview("Mnogo hubav seshoar!");

        //Admin creation and banning;
        Admin admin = (Admin) new UserBuilder(ADMIN, "SuperMARIO", "Admin123").build();
        System.out.println(client.getStatus());
        admin.setAccountStatus(client, BLOCKED);
        System.out.println(client.getStatus());
    }
}
