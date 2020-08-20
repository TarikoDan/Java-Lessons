package lesson3_AbstractClass_Interface.Hierarchy;

public class Wolf extends WildAnimal {
    String name;
    public void roar() {};

    public Wolf() {
    }

    public Wolf(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void habitat() {
        super.habitat();
    }

    public Wolf(int lifetime) {
        super(lifetime);
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
        return "Wolf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lifetime=" + lifetime +
                '}';
    }
}
