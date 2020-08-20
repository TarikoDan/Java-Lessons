package lesson3_AbstractClass_Interface.ClassWork.Atelier;

public class Dress extends Wear implements WomenWear {
    public Dress() {
    }

    public Dress(Sizes size, String colour, double price) {
        super(size, colour, price);
    }

    @Override
    public void putOnWoman() {
        System.out.println("Put on this Dress, My Dear");
    }

    @Override
    public String toString() {
        return "Dress{" +
                "size=" + size +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
