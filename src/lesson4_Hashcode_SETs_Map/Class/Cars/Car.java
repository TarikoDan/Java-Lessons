package lesson4_Hashcode_SETs_Map.Class.Cars;

import java.util.Objects;

public class Car implements Comparable{
    String model;
    int year;
    String number;
    String colour;
    Engine engine;
    Wheel wheel;

    public Car() {
    }

    public Car(String model, int year, String number, String colour, Engine engine, Wheel wheel) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.colour = colour;
        this.engine = engine;
        this.wheel = wheel;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(model, car.model) &&
                Objects.equals(number, car.number) &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, number, colour, engine, wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number='" + number + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;
        return  car.year - this.year;
    }
}
