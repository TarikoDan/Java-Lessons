package lesson1_Intro;

import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private double weight;
    String[] skills = {"js", "java"};
    char nick = ' ';
    boolean status;

    public User() {
    }

    public User(int id, String name, double weight, String[] skills, char nick, boolean status) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.skills = skills;
        this.nick = nick;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", skills=" + Arrays.toString(skills) +
                ", nick=" + nick +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
