package com.company;

public enum Action {
    CAMEUP(" подошел "),
    WATCHED("посмотрел "),
    NOTICED("заметив "),
    KNOCKED("принялся громко стучать "),
    SLAPPED( " зашлепал в своих шлепанцах по дорожке."),
    STOPPED("Автомобиль остановился, "),
    LEFT("из него вышли четверо полицеских");
    private String value;
    Action (String val) {
        value = val;
    }
    public String getValue() {
        return value;
    }
}
