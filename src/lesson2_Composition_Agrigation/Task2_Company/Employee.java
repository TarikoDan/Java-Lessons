package lesson2_Composition_Agrigation.Task2_Company;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private int experience;

    public Employee() {
    }

    public Employee(String name, String surname, String position, int experience) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", experience=" + experience +
                '}';
    }
}
