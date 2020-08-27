package lesson5_Lambda_Stream.Class.AutoPark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Driver max = new Driver("Max",24, 3);
        Driver jhon = new Driver("Jhon",26, 2);
        Driver michael = new Driver("Michael",33, 7);
        Driver stan = new Driver("Stan",54, 17);
        Driver maria = new Driver("Maria",41, 1);
        Driver edd = new Driver("Eddy",39, 19);
        Driver peter = new Driver("Peter",21, 7);
        Driver ron = new Driver("Ronald",27, 6);
        Driver nelly = new Driver("Nelly",25, 4);

        Car audi2016 = new Car(CarBrand.AUDI, 200, 24500, 2016, max);
        Car bmw2017 = new Car(CarBrand.BMW, 250, 39800, 2017, michael);
        Car bmw2019 = new Car(CarBrand.BMW, 150, 31000, 2019, nelly);
        Car merc2016 = new Car(CarBrand.MERCEDES, 180, 16000, 2016, stan);
        Car merc2017 = new Car(CarBrand.MERCEDES, 220, 24000, 2017, jhon);
        Car merc2020 = new Car(CarBrand.MERCEDES, 350, 64000, 2020, ron);
        Car mitsub2018 = new Car(CarBrand.MITSUBISHI, 110, 18000, 2018, maria);
        Car subaru = new Car(CarBrand.SUBARU, 220, 30000, 2018, edd);
        Car vw = new Car(CarBrand.VW, 140, 24000, 2018, edd);
        Car toyota = new Car(CarBrand.TOYOTA, 150, 27000, 2018, peter);

        List<Car> listCars = Arrays.asList(audi2016, bmw2017,toyota,bmw2019,merc2016,merc2017,merc2020,mitsub2018,subaru,vw);
        ArrayList<Car> cars = new ArrayList<>(listCars);
        double totalSumm = 0;
        System.out.println("--------------All Cars--------------");

        for (Car car : cars) {
            System.out.println(car);
            totalSumm+=car.getPrice();
        }
        System.out.println("Total Sum for All Cars = " + totalSumm);

        System.out.println("--------------EVEN Car-engineBoost-priceInc--------------");
        for (int i = 0; i < cars.size(); i+=2) {
            Car car = cars.get(i);
            car.engineBoost();
            car.priceInc();
            System.out.println(car);
        }
        System.out.println("---------------driverExperienceAdvance----------------");
        for (Car car : cars) {
            int experience = car.getDriver().getExperience();
            int age = car.getDriver().getAge();
            if (experience < 5 && age > 25) {
                car.driverExperienceAdvance();
            }
        }
        cars.forEach(car -> System.out.println(car));

    }
}
