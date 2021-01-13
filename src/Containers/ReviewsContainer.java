package Containers;
import java.util.HashMap;

public class ReviewsContainer {
    private static ReviewsContainer instance;
    private static HashMap<String, String> reviews;


    private ReviewsContainer(){
        reviews = new HashMap<>();
    }

    public static ReviewsContainer getInstance(){

        if(instance != null){
            return instance;
        }
        return instance = new ReviewsContainer();
    }

    public static void addReview(String username, String string){
        reviews.put(username,string);
    }

}
