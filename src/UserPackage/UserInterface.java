package UserPackage;

public interface UserInterface {

    void changeUsername(String username, String password);
    void changePassword (String oldPassword,String newPassword);
    void writeReview(String review);
    String getUsername();


}
