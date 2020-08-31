package lesson5_Lambda_Stream.Contact;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Contact.DAO dao = new Contact.DAO();
        LinkedList<Contact> list = dao.createEmptyList();
        System.out.println(list);
        Contact max = new Contact(1, "Max", "Sol", "max@sol", Company.INTEL, Department.FACTORY);
        System.out.println(max);
        dao.addContactToList(max, list);
        System.out.println(list);
        dao.removeContactFromList(max,list);
        System.out.println(list);


        List<Contact> contacts = dao.addContactWithValuesToList(2, "Vasya", "Ber", "a@g", Company.APPLE, Department.FACTORY);
        System.out.println(contacts);
        dao.addContactWithValuesToList(3, "Petya", "Corzh", "a@g", Company.INTEL, Department.SUPPORT);
        System.out.println(contacts);
        dao.clearList();
        System.out.println(contacts);
        Contact rex = new Contact(4, "Rex", "Monk", "rex@sol", Company.APPLE, Department.TECH);
        Contact ann = new Contact(5, "Ann", "Laut", "ann@sol", Company.APPLE, Department.TECH);
        Contact suzi = new Contact(12, "Suzi", "Tao", "su@sol", Company.APPLE, Department.FACTORY);
        Contact majia = new Contact(13, "Majia", "Kraft", "maj@sol", Company.APPLE, Department.FACTORY);
        Contact[] appleTech = {rex, ann, suzi, majia};
        dao.addContactsArray(appleTech);
        Contact serhij = new Contact(6, "Serhij", "Duk", "se@sol", Company.MICROSOFT, Department.SUPPORT);
        Contact stepan = new Contact(7, "Stepan", "Golub", "step@sol", Company.MICROSOFT, Department.SUPPORT);
        Contact ivan = new Contact(10, "Ivan", "Sok", "iv@sol", Company.MICROSOFT, Department.TECH);
        Contact bogdan = new Contact(11, "Bogdan", "Buk", "bogd@sol", Company.MICROSOFT, Department.TECH);
        Contact[] microsoft = {serhij, stepan, ivan, bogdan};
        dao.addContactsArray(microsoft);
        Contact jeff = new Contact(8, "Jeffry", "Man", "jaf@sol", Company.INTEL, Department.TECH);
        Contact leo = new Contact(9, "Leonardo", "Capri", "leo@sol", Company.INTEL, Department.FACTORY);
        Contact[] intel = {max, leo, jeff, max};
        dao.addContactsArray(intel);

        System.out.println(contacts);
        dao.printList();

        List<Contact> distinktContacts = contacts.stream().distinct().collect(Collectors.toList());
        dao.printList(distinktContacts);

        List<Contact> factoryContactsList = contacts
                .stream().distinct()
                .filter(contact -> contact.getDepartment() == Department.FACTORY)
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
        dao.printList(factoryContactsList);

        List<Contact> sortedContaktsByCompany = contacts
                .stream()
                .sorted((o1, o2) -> o1.getCompany().compareTo(o2.getCompany()))
                .distinct()
                .collect(Collectors.toList());
        dao.printList(sortedContaktsByCompany);

    }
}
