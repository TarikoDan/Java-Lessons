package lesson1_Intro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1);
        User user2 = new User(2, "John", 75.5, new String[]{"react", "angular"}, '#', true);
        System.out.println(user2);
        System.out.println("Enter new Name for user2");
        String newName = new Scanner(System.in).nextLine();
        user2.setName(newName);
        System.out.println(user2);

        Girl Alex = new Girl("Alex", "white", 22, 45, 2);
        Girl Sher = new Girl("Sher", "white", 26, 54, 4);
        Girl Colin = new Girl("Colin", "black", 21, 66, 5);
        Girl August = new Girl("August", "black", 19, 49, 1);
        Girl Neil = new Girl("Neil", "white", 33, 52, 3);
        Girl Flower = new Girl("Flower", "white", 24, 44, 0);
        Girl Beast = new Girl("Beast", "red", 33, 57, 3);
        Girl Zoe = new Girl("Zoe", "white", 26, 69, 2);
        Girl Niki = new Girl("Niki", "black", 31, 76, 4);
        Girl Sia = new Girl("Sia", "yellow", 21, 41, 1);

        Girl[] redLamp = {Alex, Sher, Colin, August, Neil, Flower, Beast, Zoe, Niki, Sia};
        System.out.println(Arrays.toString(redLamp));

        Prince prince = new Prince();

        System.out.println("Choose an option: 'age', 'weight' or 'bust' ..");
        String option = new Scanner(System.in).nextLine();
        switch (option) {
            case "age":
                int wantedAge = prince.getAge();
                for (Girl girl : redLamp) {
                    if (girl.age == wantedAge) {
                        System.out.println("Your Girl: "+ girl);
                    }
                }
                break;
            case "weight":
                double wantedWeight = prince.getWeight();
                for (Girl girl : redLamp) {
                    if (girl.weight == wantedWeight) {
                        System.out.println("Your Girl: "+ girl);
                    }
                }
                break;
            case "bust":
                int wantedBust = prince.getBust();
                System.out.println("Enter range of values:");
                System.out.print("from ");
                int minBust = Integer.parseInt(new Scanner(System.in).nextLine());
                System.out.print("  to ");
                int maxBust = Integer.parseInt(new Scanner(System.in).nextLine());
                for (Girl girl : redLamp) {
                    if (girl.bust >= minBust && girl.bust <= maxBust) {
                        System.out.println("Your Girl: "+ girl);
                    }
                }
                break;

            default:
                System.out.println("bad option...");
        }
    }
}
