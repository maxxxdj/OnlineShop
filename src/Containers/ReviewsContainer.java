package Containers;

import UserPackage.User;

import java.util.HashMap;
import java.util.Map;

public class ReviewsContainer {
    private Map<String, String> reviews;



    public void addReview(String username, String string){
        reviews.put(username,string);
    }

}
