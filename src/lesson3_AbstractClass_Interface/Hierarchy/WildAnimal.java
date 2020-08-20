package lesson3_AbstractClass_Interface.Hierarchy;

public class WildAnimal extends Animal {
    public int age;

    public WildAnimal() {
    }

    public WildAnimal(int age) {
        this.age = age;
    }

    public void run() {};

    @Override
    public void habitat() {
        super.habitat();
    }

    @Override
    public int getLifetime() {
        return super.getLifetime();
    }

    @Override
    public void setLifetime(int lifetime) {
        super.setLifetime(lifetime);
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "age=" + age +
                ", lifetime=" + lifetime +
                '}';
    }
}
