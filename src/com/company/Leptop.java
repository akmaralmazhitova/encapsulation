package com.company;

public class Leptop {

    private String name;
    private int memory;
    private String color;
    private String CPU;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    void getInfoOfLeptops(){
        System.out.println(getName());
        System.out.println(getColor());
        System.out.println(getMemory());
        System.out.println(getCPU());
    }

}
