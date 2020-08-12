package lesson1_Intro;

public class Prince {
    private String name = "Prince";
    private String skin = "white";
    private int age = 26;
    private double weight = 52;
    private int bust = 3;

    public Prince() {
    }

    public String getName() {
        return name;
    }

    public String getSkin() {
        return skin;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getBust() {
        return bust;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "name='" + name + '\'' +
                ", skin='" + skin + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", bust=" + bust +
                '}';
    }
}
