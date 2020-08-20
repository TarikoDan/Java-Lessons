package lesson3_AbstractClass_Interface.Hierarchy;

public class Animal {
    public int lifetime = 10;
    public void habitat() {}

    public Animal() {
    }

    public Animal(int lifetime) {
        this.lifetime = lifetime;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "lifetime=" + lifetime +
                '}';
    }
}
