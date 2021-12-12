package com.company;

public enum Items {

    TOOL1(" c потайными фонариками "),
    TOOL2("и c резиновыми электрическими дубинками в руках."),
    WEAPON(" c ружъём в руках ");

    private String value;
    Items (String val) {
        value = val;
    }
    public String GetValue() {
        return value;
    }
}
