package lesson4_Hashcode_SETs_Map.Class.PetClub;

import lesson2_Composition_Agrigation.Task1_Person.Email;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Email email;

    public Person() {
    }

    public Person(String name,
                  String surname,
                  int age
    ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
//        this.email = new Email(eSite, eLogin, ePassword);
//        this.pet = pet;
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

    public void register(String eSite, String login, String password) {
        this.email = new Email(eSite, login, password);
        System.out.println("You are registered on " + eSite + "  with: ");
        System.out.println("login: " + login);
        System.out.println("password: " + password);
    }

    public void logIn(String login, String password) {
        this.email.logIn(login, password);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
//                ", email=" + email +
                '}';
    }
}
