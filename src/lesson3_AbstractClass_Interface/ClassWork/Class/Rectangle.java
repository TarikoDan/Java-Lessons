package lesson3_AbstractClass_Interface.ClassWork.Class;

import lesson3_AbstractClass_Interface.ClassWork.Class.Figure;

public class Rectangle implements Figure {
    int sideA;
    int sideB;

    public Rectangle() {
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double square() {
        double res = sideA*sideB;
        System.out.println(res);
        return res;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
