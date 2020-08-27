package lesson4_Hashcode_SETs_Map.Class.Cars;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Wheel pirelliR18 = new Wheel(WheelManufacturer.PIRELLI, 18);
        Wheel pirelliR16 = new Wheel(WheelManufacturer.PIRELLI, 16);
        Wheel goodyearR16 = new Wheel(WheelManufacturer.GOODYEAR, 16);
        Wheel goodyearR18 = new Wheel(WheelManufacturer.GOODYEAR, 18);
        Wheel goodyearR20 = new Wheel(WheelManufacturer.GOODYEAR, 20);
        Wheel continentalR20 = new Wheel(WheelManufacturer.CONTINENTAL, 20);
        Wheel continentalR19 = new Wheel(WheelManufacturer.CONTINENTAL, 19);
        Wheel continentalR18 = new Wheel(WheelManufacturer.CONTINENTAL, 18);
        Wheel continentalR17 = new Wheel(WheelManufacturer.CONTINENTAL, 17);
        Wheel nokianR17 = new Wheel(WheelManufacturer.NOKIAN, 17);
        Wheel nokianR16 = new Wheel(WheelManufacturer.NOKIAN, 16);
        Wheel nokianR15 = new Wheel(WheelManufacturer.NOKIAN, 15);

        Engine ea20 = new Engine("EA20", 2000, 105);
        Engine ea25 = new Engine("EA25", 2500, 150);
        Engine ea30 = new Engine("EA30", 3000, 200);
        Engine ea40 = new Engine("EA40", 4000, 250);
        Engine ea50 = new Engine("EA50", 5000, 350);
        Engine d18 = new Engine("TD18", 1800, 80);
        Engine tdi18 = new Engine("TDI18", 1800, 95);
        Engine tdi20 = new Engine("TDI20", 2000, 115);
        Engine tdi25 = new Engine("TDI25", 2500, 150);
        Engine tdi30 = new Engine("TDI30", 3000, 220);
        Engine tdi30biturbo = new Engine("TDI30B", 3000, 280);

        Car bmw1996 = new Car("BMW", 1996, "AA7711II", "black", ea20, nokianR16);
        Car bmw2016 = new Car("BMW", 2016, "AA5885EE", "black", tdi30, continentalR17);
        Car bmw2019 = new Car("BMW", 2019, "AA4444EE", "white", ea50, continentalR20);
        Car bmw2020 = new Car("BMW", 2020, "AA0011EE", "white", tdi30biturbo, continentalR20);
        Car audiA62020 = new Car("Audi", 2020, "AA0014EE", "black", tdi30biturbo, goodyearR20);
        Car audiA32020 = new Car("Audi", 2020, "BC0114EE", "red", tdi18, goodyearR16);
        Car audiA62018 = new Car("Audi", 2018, "BC1234EE", "grey", ea40, goodyearR18);
        Car audiA32018 = new Car("Audi", 2018, "BC5678EE", "yellow", tdi18, goodyearR16);
        Car toyotaCamry1999 = new Car("Toyota", 1999, "AM1234TT", "black", ea25, pirelliR16);
        Car toyotaCamry2018 = new Car("Toyota", 2018, "AM0567TT", "white", ea30, pirelliR18);
        Car mercedes2018 = new Car("Mercedes", 2018, "BP0011", "black", tdi25, continentalR18);
        Car mercedes2019 = new Car("Mercedes", 2019, "BP0012", "black", ea40, continentalR19);
        Car mercedes2015 = new Car("Mercedes", 2015, "AM1441AA", "green", tdi20, nokianR17);
        Car vaz = new Car("BullShit", 2000, "AH8456OP", "orange", d18, nokianR15);

        List<Car> cars1 = new ArrayList<>(Arrays.asList(audiA32018,audiA32020,audiA62018,audiA62020,bmw1996,bmw2016,bmw2019,bmw2020,mercedes2015,mercedes2018,mercedes2019,toyotaCamry1999,toyotaCamry2018,vaz));
        System.out.println(cars1);

        for (Car car1 : cars1) {
            System.out.println(car1.year);
        }
        System.out.println("-----------1st-way---------");
        Stream<Car> sortedCars1 = cars1.stream().sorted((o1, o2) -> o1.year - o2.year);
        sortedCars1.forEach(car -> System.out.println(car.year));
        System.out.println("----------2nd-way------------");
        cars1.sort((o1, o2) -> o1.year - o2.year);
        cars1.forEach(car -> System.out.println(car.year));
        System.out.println("----------3d-way------------");
        List<Car> cars2 = new ArrayList<>(Arrays.asList(audiA32018,audiA32020,audiA62018,audiA62020,bmw1996,bmw2016,bmw2019,bmw2020,mercedes2015,mercedes2018,mercedes2019,toyotaCamry1999,toyotaCamry2018,vaz));
        Set<Car> setCars= new TreeSet<>(cars2);
        setCars.forEach(car -> System.out.println(car.year));
        System.out.println("----------Edit------------");
        cars1.forEach(car -> System.out.println(car.year + " " + car.colour + " " + car.wheel.diameter));
        System.out.println("----------Edit------------");
        for (Car car : cars1) {
            if (car.year < 2000) {
                car.wheel.diameter = car.wheel.diameter - 1;
            }else if (car.year > 2000) {
                car.colour = "greenn";
            }
        }
        cars1.forEach(car -> System.out.println(car.year + " " + car.colour + " " + car.wheel.diameter));
        System.out.println("----------New Lists------------");

        List<Car> cars3 = new ArrayList<>(Arrays.asList(audiA32018,audiA32020,audiA62018,audiA62020,bmw1996,bmw2016,bmw2019,bmw2020,mercedes2015,mercedes2018,mercedes2019,toyotaCamry1999,toyotaCamry2018,vaz));
        cars3.sort((o1, o2) -> o1.year - o2.year);

        List<Car> carsLess2000 = new LinkedList<>();
        List<Car> carsAbove2000 = new LinkedList<>();
        for (Car car : cars3) {
            if (car.year > 2000) {
                carsAbove2000.add(car);
            } else {
                carsLess2000.add(car);
            }
        }
        System.out.println("----------carsAbove2000------------");

        for (Car car : carsAbove2000) {
            System.out.println(car.year);
        }
        System.out.println("----------carsLess2000------------");
        for (Car car : carsLess2000) {
            System.out.println(car.year);
        }
        System.out.println("----------newListCsrs------------");

        List<Car> newListCsrs = new ArrayList<>(carsLess2000);
        newListCsrs.addAll(carsAbove2000);
        for (Car car : newListCsrs) {
            System.out.println(car.year);
        }

    }
}
