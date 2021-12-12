package com.company;

public class Fix extends Human implements Weapones{
    public Fix (String name) {
        Name = name;
    }

    @Override
    public void weapon(Items itm) {
        System.out.print("Через некоторое время дверь в доме открылась, из нее вышел " + Name + itm.GetValue());
    }
    @Override
    public void fixMove(Action act) {
        System.out.println("и" + act.GetValue());
    }
}
