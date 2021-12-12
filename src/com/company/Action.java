package com.company;

public enum Action {
    ACTION1(" подошел "),
    ACTION2("посмотрел "),
    ACTION3("заметив "),
    ACTION4("принялся громко стучать "),
    Action5( " зашлепал в своих шлепанцах по дорожке."),
    Action6("Автомобиль остановился, "),
    Action7("из него вышли четверо полицеских");
    private String value;
    Action (String val) {
        value = val;
    }
    public String GetValue() {
        return value;
    }
}
