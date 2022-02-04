package com.company;

public class Main {

    public static void main(String[] args) {

        Leptop lp = new Leptop();
        lp.setName("hp");
        lp.setMemory(8);
        lp.setColor("gray");
        lp.setCPU("intel core i5");

        Leptop lp1 = new Leptop();
        lp1.setName("Macbook");
        lp1.setColor("white");
        lp1.setMemory(128);
        lp1.setCPU("m1");

        Leptop lp2 = new Leptop();
        lp2.setName("acer");
        lp2.setColor("red");
        lp2.setMemory(512);
        lp2.setCPU("core i3");


        Leptop[] leptops = {lp, lp1, lp2};


        Student st = new Student();
        st.setName("Akmaral");
        st.setAge(39);
        st.setGroup("Java5");
        st.setLeptops(leptops);

//        Student st2 = new Student();
//        st2.setName("Azamat");
//        st2.setAge(35);
//        st2.setGroup("Javacript");
//        st2.setLeptops(leptops);
//
//
//        st2.getInfoOfStudent();
        st.getInfoOfStudent();





    }

}
