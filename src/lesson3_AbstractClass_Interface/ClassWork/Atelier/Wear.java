package lesson3_AbstractClass_Interface.ClassWork.Atelier;

public abstract class Wear {
    Sizes size;
    String colour;
    double price;

    public Wear() {
    }

    public Wear(Sizes size, String colour, double price) {
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wear{" +
                "size=" + size +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
