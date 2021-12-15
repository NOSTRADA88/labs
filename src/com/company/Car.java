package com.company;

public class Car  implements ToolsAndAction{
    @Override
    public void fixAndCarMove(Action act) {
        System.out.print(act.getValue());
    }
    public void weapon(Items itm) {
        System.out.println(itm.getValue());
    }


}
