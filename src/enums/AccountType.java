package enums;

public enum AccountType {
    ADMIN("Administrator"),
    MODERATOR("Moderator"),
    USER("User"),
    GUEST("Guest User");

    private String type;

    AccountType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
