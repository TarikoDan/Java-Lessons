package lesson2_Composition_Agrigation.Task1_Person;

import lesson2_Composition_Agrigation.Task1_Person.Email;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Email email;
    private Pet pet;

    public Person() {
    }

    public Person(String name,
                  String surname,
                  int age,
//                  String eSite, String eLogin, String ePassword,
                  Pet pet) {
        this.name = name;
        this.surname = surname;
        this.age = age;
//        this.email = new Email(eSite, eLogin, ePassword);
        this.pet = pet;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void register(String eSite, String login, String password) {
        this.email = new Email(eSite, login, password);
        System.out.println("You are registered on " + eSite + "  with: ");
        System.out.println("login: " + login);
        System.out.println("password: " + password);
    }

    public void logIn(String login, String password) {
        this.email.logIn(login, password);
    }

    public void feedPet() {
        this.pet.voice();
    }

    public void callPet() {
        this.pet.piss();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email=" + email +
                ", pet=" + pet +
                '}';
    }
}
