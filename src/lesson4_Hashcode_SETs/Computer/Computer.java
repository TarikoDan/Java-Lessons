package lesson4_Hashcode_SETs.Computer;


import java.util.Objects;

public class Computer implements Comparable<Computer>{
    String model;
    int year;
    int ram;
    double price;
    HardDrive hardDrive;
    Processor processor;

    public Computer() {
    }

    public Computer(String model, int year, int ram, double price, HardDrive hardDrive, Processor processor) {
        this.model = model;
        this.year = year;
        this.ram = ram;
        this.price = price;
        this.hardDrive = hardDrive;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return year == computer.year &&
                ram == computer.ram &&
                Double.compare(computer.price, price) == 0 &&
                Objects.equals(model, computer.model) &&
                Objects.equals(hardDrive, computer.hardDrive) &&
                Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, ram, price, hardDrive, processor);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", ram=" + ram +
                ", price=" + price +
                ", hardDrive=" + hardDrive +
                ", processor=" + processor +
                '}';
    }

    @Override
    public int compareTo(Computer o) {
        return (int) (this.price - o.price);
    }
}
