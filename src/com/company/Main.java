package com.company;

public class Main {

    public static void main(String[] args) {
        Person person=new Person("Meerim "," beautiful");
        System.out.println(person);
        person.walk();
        person.learn();
        person.eat();

        Programmer programmer=new Programmer("Meri","smart ","Peaksoft");
        System.out.println(programmer);
        programmer.walk();
        programmer.learn();
        programmer.eat();
        programmer.coding();

        Dancer dancer=new Dancer("Meka","slender","MM");
        System.out.println(dancer);
        dancer.walk();
        dancer.learn();
        dancer.eat();
        dancer.dancing();

        Singer singer=new Singer("MM1","nice","Meku");
        System.out.println(singer);
        singer.walk();
        singer.learn();
        singer.eat();
        singer.singing();
        singer.playGitar();


    }
}
