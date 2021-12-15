package com.company;


public class Main {
    public static void main(String[] args) {
    Zhulio zhulio = new Zhulio("Жулио");
    Neznaika neznaika = new Neznaika("Незнайка");
    Fix fix = new Fix("Фикс");
    Kozlikom kozlikom = new Kozlikom("Козликом");
    Miga miga = new Miga("Мига");
    Car car = new Car();
    zhulio.zhulioCar();
    car.fixAndCarMove(Action.STOPPED);
    car.fixAndCarMove(Action.LEFT);
    car.weapon(Items.FLASHLIGHTS);
    car.weapon(Items.BATONS);
    zhulio.fakePoliceman();
    miga.cameup(Action.CAMEUP);
    miga.watched(Action.WATCHED);
    miga.noticed(Action.NOTICED);
    miga.knocked(Action.KNOCKED);
    fix.weapon(Items.GUN);
    fix.fixAndCarMove(Action.SLAPPED);
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
