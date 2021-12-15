package com.company;

public enum Items {

    FLASHLIGHTS(" c потайными фонариками "),
    BATONS("и c резиновыми электрическими дубинками в руках."),
    GUN(" c ружъём в руках ");

    private String value;
    Items (String val) {
        value = val;
    }
    public String getValue() {
        return value;
    }
}
