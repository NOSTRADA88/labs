package com.company;

public class Miga extends Human implements Actions{
    Miga (String name) {
        Name = name;
    }

    @Override
    public void Act1(Action act) {
        System.out.print(Name + act.GetValue() + "к воротам, ");
    }
    public void Act2(Action act) {
        System.out.print( act.GetValue() + "в щель и, ");
    }
    public void Act3(Action act) {
        System.out.print( act.GetValue() + "свет в окнах дома, ");
    }
    public void Act4(Action act) {
        System.out.println( act.GetValue() + "дубинкой в калитку.");
    }

}
