package lesson1_Intro;

public class Girl {
    private String name;
    String skin;
    int age;
    double weight;
    int bust;

    public Girl(String name, String skin, int age, double weight, int bust) {
        this.name = name;
        this.skin = skin;
        this.age = age;
        this.weight = weight;
        this.bust = bust;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", skin='" + skin + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", bust=" + bust +
                '}';
    }
}
