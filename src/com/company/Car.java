package com.company;

public class Car  implements Weapones{
    @Override
    public void fixMove(Action act) {
        System.out.print(act.GetValue());
    }
    public void weapon(Items itm) {
        System.out.println(itm.GetValue());
    }


}
