package lesson2_Composition_Agrigation.Task1_Person;

public class Main {
    public static void main(String[] args) {
        Pet burry = new Pet("dog", "Burry", 4);
        Person max = new Person("Max", "Cool", 33, burry);
        max.register("www.c.com","max", "111");
        max.logIn("m", "1");
        System.out.println(max);
        max.logIn("max", "111");
        max.callPet();
    }
}
