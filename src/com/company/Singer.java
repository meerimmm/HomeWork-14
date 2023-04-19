package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer(String bandName,String designation,String name) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer() {

    }
    public void singing(){
        System.out.println("Поет");
    }
    public void playGitar(){
        System.out.println("Играет на гитаре");
    }


    @Override
    public String toString() {
        return "Singer{" +
                " name= "+ getName()+
                " designatoin= "+ getDesignation()+
                " bandName= '" +  bandName + '\'' +
                '}';
    }
}
