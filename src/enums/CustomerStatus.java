package enums;

public enum CustomerStatus {
    ACTIVE("Active!"),
    BLOCKED("Blocked!");




    private String caption;
    CustomerStatus(String caption){
        this.caption = caption;
    }
    public String getCaption(){
        return this.caption;
    }
    @Override
    public String toString() {
        return String.format("Your account status is: %s",getCaption());
    }
}
