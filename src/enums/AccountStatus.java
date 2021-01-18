package enums;

public enum AccountStatus {
    ACTIVE("Active!"),
    BLOCKED("Blocked!");




    private String caption;
    AccountStatus(String caption){
        this.caption = caption;
    }
    public String getCaption(){
        return this.caption;
    }
    @Override
    public String toString() {
        return String.format("This account is: %s",getCaption());
    }
}
