package com.company;


public class Main {
    public static void main(String[] args) {
    Zhulio zhulio = new Zhulio("Жулио");
    Neznaika neznaika = new Neznaika("Незнайка");
    Fix fix = new Fix("Фикс");
    Kozlikom kozlikom = new Kozlikom("Козликом");
    Miga miga = new Miga("Мига");
    Car car = new Car();
    zhulio.ZhulioCar();
    car.fixMove(Action.Action6);
    car.fixMove(Action.Action7);
    car.weapon(Items.TOOL1);
    car.weapon(Items.TOOL2);
    zhulio.FakePoliceman();
    miga.Act1(Action.ACTION1);
    miga.Act2(Action.ACTION2);
    miga.Act3(Action.ACTION3);
    miga.Act4(Action.ACTION4);
    fix.weapon(Items.WEAPON);
    fix.fixMove(Action.Action5);
    }
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}
