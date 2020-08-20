package lesson3_AbstractClass_Interface.ClassWork.Class;

import lesson3_AbstractClass_Interface.ClassWork.Class.Runner;

public class Sportsman implements Runner {
    private String name;
    private double time;

    public Sportsman() {
    }

    public Sportsman(String name, double time) {
        this.name = name;
        this.time = time;
    }


    @Override
    public double run() {
        return CircleLength / time ;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                '}';
    }
}
