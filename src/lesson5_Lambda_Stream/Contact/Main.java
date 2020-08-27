package lesson5_Lambda_Stream.Contact;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Contact.DAO dao = new Contact.DAO();
        LinkedList<Contact> list = dao.createEmptyList();
        System.out.println(list);
        Contact max = new Contact(1, "Max", "Sol", "max@sol", Company.APPLE, Department.FACTORY);
        System.out.println(max);
        dao.addContactToList(max, list);
        System.out.println(list);
        dao.removeContactFromList(max,list);
        System.out.println(list);


        LinkedList<Contact> contacts = dao.addContactWithValuesToList(2, "Vasya", "Ber", "a@g", Company.APPLE, Department.FACTORY);
        System.out.println(contacts);
        dao.addContactWithValuesToList(3, "Petya", "Corzh", "a@g", Company.INTEL, Department.SUPPORT);
        System.out.println(contacts);
        dao.clearList();
        System.out.println(contacts);
        Contact rex = new Contact(4, "Rex", "Cort", "rex@sol", Company.APPLE, Department.TECH);
        Contact ann = new Contact(5, "Ann", "Cort", "ann@sol", Company.APPLE, Department.TECH);
        Contact[] appleTech = {rex, ann};
        dao.addContactsArray(appleTech);
        System.out.println(contacts);



    }
}
