package enums;

public enum Gender {
    MALE("//label[@for='gender-radio-1']"),
    Female("//label[@for='gender-radio-2']"),
    Other("//label[@for='gender-radio-3']");

    private String locator;

    Gender(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}
