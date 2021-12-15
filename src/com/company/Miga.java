package com.company;

public class Miga extends Human implements Actions{
    Miga (String name) {
        Name = name;
    }

    @Override
    public void cameup(Action act) {
        System.out.print(Name + act.getValue() + "к воротам, ");
    }
    public void watched(Action act) {
        System.out.print( act.getValue() + "в щель и, ");
    }
    public void noticed(Action act) {
        System.out.print( act.getValue() + "свет в окнах дома, ");
    }
    public void knocked(Action act) {
        System.out.println( act.getValue() + "дубинкой в калитку.");
    }

}
