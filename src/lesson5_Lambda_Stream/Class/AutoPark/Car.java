package lesson5_Lambda_Stream.Class.AutoPark;

public class Car {
    private CarBrand carBrand;
    private int power;
    private double price;
    private int year;
    private Driver driver;

    public Car() {
    }

    public Car(CarBrand carBrand, int power, double price, int year, Driver driver) {
        this.carBrand = carBrand;
        this.power = power;
        this.price = price;
        this.year = year;
        this.driver = driver;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void engineBoost() {
        this.power = (int) (this.power*1.1);
    }

    public void priceInc() {
        this.price = (int) (this.price*1.05);
    }

    public void driverExperienceAdvance() {
        this.driver.experienceAdvance();
    }

    public void changeDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand=" + carBrand +
                ", power=" + power +
                ", price=" + price +
                ", year=" + year +
                ", driver=" + driver +
                '}';
    }
}
