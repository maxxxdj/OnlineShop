package Containers;
import UserPackage.User;

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


    public static void addReview(User user, String review){
        reviews.put(user.getUsername(),review);
    }
}
