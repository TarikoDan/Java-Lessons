package lesson3_AbstractClass_Interface.ClassWork.Atelier;

public class Tie extends Wear implements MensWear {
    public Tie() {
    }

    public Tie(Sizes size, String colour, double price) {
        super(size, colour, price);
    }

    @Override
    public void putOnMAN() {
        System.out.println("Put on this Tie, MAN");
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
