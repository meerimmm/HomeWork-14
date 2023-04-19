package com.company;

public class Dancer extends Person  {
    private String groupName;



    public Dancer(String name, String designation, String groupName) {
        super(name,designation);
        this.groupName = groupName;
    }

    public Dancer() {

    }

    public void dancing(){
        System.out.println("Танцует");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                " name= "+ getName()+
                " designation= "+ getDesignation()+
                " groupName= '" +  groupName + '\'' +
                '}';
    }
}
