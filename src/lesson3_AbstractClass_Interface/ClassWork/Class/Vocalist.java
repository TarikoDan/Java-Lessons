package lesson3_AbstractClass_Interface.ClassWork.Class;

import lesson3_AbstractClass_Interface.ClassWork.Class.Singer;

public class Vocalist implements Singer {
    private String name;

    public Vocalist() {
    }

    public Vocalist(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Vocalist{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void sing() {
        System.out.println("Lalalalalal");
    }
}
