package lesson4_Hashcode_SETs_Map.Class.Cars;

import java.util.Objects;

public class Wheel {
    WheelManufacturer manufacturer;
    int diameter;

    public Wheel() {
    }

    public Wheel(WheelManufacturer manufacturer, int diameter) {
        this.manufacturer = manufacturer;
        this.diameter = diameter;
    }

    public WheelManufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(WheelManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter &&
                manufacturer == wheel.manufacturer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, diameter);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "manufacturer=" + manufacturer +
                ", diameter=" + diameter +
                '}';
    }
}
