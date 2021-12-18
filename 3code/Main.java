package com.company;
public class Main {
    public static void main(String[] args) {
    Zhulio zhulio = new Zhulio("Жулио");
    Neznaika neznaika = new Neznaika("Незнайка");
    Fix fix = new Fix("Фикс");
    Kozlikom kozlikom = new Kozlikom("Козлик");
    Miga miga = new Miga("Мига");
    Car car = new Car("Жёлтый", zhulio);
    car.appear(Streets.SNAKESTREET);
    car.rush(Streets.DOGSTREET);
    car.stop();
    car.whoIsThis();
    miga.policemenOut();
    kozlikom.policemenOut();
    neznaika.policemenOut();
    zhulio.policemenOut();
    miga.cameUp(House.GATES);
    miga.watched(House.GAP);
    miga.noticed(House.LIGHTS);
    miga.knocked(House.GATE);
    fix.opened(House.DOOR);
    fix.slapped(House.PATH);
    }

}
