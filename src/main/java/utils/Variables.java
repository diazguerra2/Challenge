package utils;

public enum Variables {
    PRICE("priceListed");

    private String value;

    private Variables(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
