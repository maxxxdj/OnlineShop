import Containers.ReviewsContainer;
import UserPackage.Client;
import UserPackage.User;

public class Main {
    public static void main(String[] args) {

        ReviewsContainer.getInstance();


        User client = new Client("Mitko1234","Mita4eto123");

        client.writeReview("Mnogo hubav seshoar!");
        System.out.println();
    }
}
