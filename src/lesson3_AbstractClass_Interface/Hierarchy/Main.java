package lesson3_AbstractClass_Interface.Hierarchy;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        WildAnimal wildAnimal = new WildAnimal();
        int age = wildAnimal.age;
        Wolf wolfy = new Wolf(5, "wolfy");
        System.out.println(wolfy);
        Animal wolfik = new Wolf(2,"wolfik");
        System.out.println(wolfik);
    }
}
