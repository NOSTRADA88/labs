package com.company;

public class Zhulio extends Human implements ZhulioActions{
    public Zhulio(String name) {
        Name = name;
    }

    @Override
    public void zhulioCar() {
        System.out.println("Вскоре желтый автомобиль господина " + Name + " можно было увидеть в Змеином переулке, с наступлением темноты он уже мчался по Большой Собачьей улице.");
    }
    public void fakePoliceman() {
        System.out.println("Это были не настоящие полицейские, а переодетые в полицейскую форму Жулио, Мига и Незнайка с Козликом");
    }
}
