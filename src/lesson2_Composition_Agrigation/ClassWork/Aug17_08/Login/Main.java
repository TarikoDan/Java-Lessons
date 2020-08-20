package lesson2_Composition_Agrigation.ClassWork.Aug17_08.Login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person vaysa = new Person(1,"vaysa",32);
        Person petya = new Person(2, "petya", 31);
        Person kolya = new Person(3, "kolya", 30);
        Person anya = new Person(4, "anya", 29);
        Person masha = new Person(5, "masha", 28);
        Person andriy = new Person(6, "andriy", 30);
        Person maxim = new Person(7, "maxim", 31);
        Person vadym = new Person(8, "vadym", 32);
        Person taras = new Person(9, "taras", 33);

        Auth auth5 = new Auth(5, "login5", "password5");
        Auth auth2 = new Auth(2, "login2", "password2");
        Auth auth1 = new Auth(1, "login1", "password1");
        Auth auth7 = new Auth(7, "login7", "password7");
        Auth auth3 = new Auth(3, "login3", "password3");
        Auth auth4 = new Auth(4, "login4", "password4");
        Auth auth8 = new Auth(8, "login8", "password8");
        Auth auth6 = new Auth(6, "login6", "password6");
        Auth auth9 = new Auth(9, "login9", "password9");

        ArrayList<Person> personsList = new ArrayList<>(Arrays.asList(vaysa,
                petya,
                kolya,
                anya,
                masha,
                andriy,
                maxim,
                vadym,
                taras));
        List<Auth> auths = Arrays.asList(auth5,
                auth2,
                auth1,
                auth7,
                auth3,
                auth4,
                auth8,
                auth6,
                auth9);
        ArrayList<Auth> authsList = new ArrayList<>(auths);

        ArrayList<Client> clients = new ArrayList<>();

        for (Person person : personsList) {
            for (Auth auth : authsList) {
                if (person.getId() == auth.getId()) {
                    clients.add(new Client(person.getId(),person.getName(),person.getAge(),auth.getLogin(),auth.getPassword()));
                    System.out.println(new Client(person.getId(),person.getName(),person.getAge(),auth.getLogin(),auth.getPassword()));
                }
            }
        }
        System.out.println(clients);

    }

    public static void summ(String[] args) {

    }
}
