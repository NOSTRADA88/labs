package com.company;

public class Fix extends Human implements ToolsAndAction{
    public Fix (String name) {
        Name = name;
    }

    @Override
    public void weapon(Items itm) {
        System.out.print("Через некоторое время дверь в доме открылась, из нее вышел " + Name + itm.getValue());
    }
    @Override
    public void fixAndCarMove(Action act) {
        System.out.println("и" + act.getValue());
    }
}
