package lesson3_AbstractClass_Interface.ClassWork.Class;

import lesson3_AbstractClass_Interface.ClassWork.Class.Figure;

public class Quadrat implements Figure {
    private int side;

    public Quadrat() {
    }

    public Quadrat(int side) {
        this.side = side;
    }

    @Override
    public double square() {
        double res = side*side;
        System.out.println(res);
        return res;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "side=" + side +
                '}';
    }
}
