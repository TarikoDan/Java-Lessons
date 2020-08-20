package lesson3_AbstractClass_Interface.ClassWork.Atelier;

public class Pents extends Wear implements MensWear, WomenWear {
    public Pents() {
    }

    public Pents(Sizes size, String colour, double price) {
        super(size, colour, price);
    }

    @Override
    public void putOnMAN() {
        System.out.println("Put on this Pents, MAN");
    }

    @Override
    public void putOnWoman() {
        System.out.println("Put on this Pents, My Dear");
    }

    @Override
    public String toString() {
        return "Pents{" +
                "size=" + size +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
