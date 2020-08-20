package lesson3_AbstractClass_Interface.ClassWork.Atelier;

public class TShirt extends Wear implements MensWear, WomenWear {
    public TShirt(Sizes size, String colour, double price) {
        super(size, colour, price);
    }

    @Override
    public void putOnMAN() {
        System.out.println("Put on this T-Shirt, MAN");
    }
    @Override
    public void putOnWoman() {System.out.println("Put on this T-Shirt, My Dear");}

    @Override
    public String toString() {
        return "TShirt{" +
                "size=" + size +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
