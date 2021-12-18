package com.company;

public class Car implements CarMoves{
    String name;
    public Car(String color, Zhulio owner) {
        name = color + " автомобиль " + owner;
    }
    @Override
    public void appear(Streets s) {
        System.out.println(name + " появился " + s.getValue());
    }
    public void rush(Streets s) {
        System.out.println(name + " помчался " + s.getValue()); // мчался
    }
    public void stop() {
        System.out.println(name + " остановился на этой же улице, у дома №70"); // остановился
    }
    public void whoIsThis(){
        System.out.println("Из машины вышли 4 незнакомца с потайными фонариками и резиновыми электрическими дубинками в руках. Но это были наши герои:");
    }
    public String toString() {
        return this.name;
    }
}
