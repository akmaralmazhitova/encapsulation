package com.company;

public class Student {
    private String name;
    private int age;
    private String group;
    private Leptop[] leptops;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name.matches("^[a-zA-Z]*$"))
        {this.name = name;}
        else System.out.println("name should be letters only");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age>28)
            this.age = age;
        else System.out.println("leptop jok");


    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Leptop[] getLeptops() {
        return leptops;
    }

    public void setLeptops(Leptop[] leptops) {
        this.leptops = leptops;
    }

    void getInfoOfStudent(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGroup());

        for (Leptop res: getLeptops()) {
            res.getInfoOfLeptops();
        }
    }
}
