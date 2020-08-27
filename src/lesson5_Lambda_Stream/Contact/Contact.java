package lesson5_Lambda_Stream.Contact;

import java.util.Arrays;
import java.util.LinkedList;

public class Contact {
    private int id;
    private String name;
    private String surname;
    private String email;
    private Company company;
    private Department department;


    public Contact() {
    }

    public Contact(int id, String name, String surname, String email, Company company, Department department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.company = company;
        this.department = department;
    }

    public static class DAO {
        LinkedList<Contact> contacts = new LinkedList<>();

        public DAO() {
        }

        public LinkedList<Contact> createEmptyList() {
            return new LinkedList<>();
        }
        public void addContactToList(Contact contact, LinkedList<Contact> list) {
            list.add(contact);
        }
        public void removeContactFromList(Contact contact, LinkedList<Contact> list) {
            list.remove(contact);
        }

        public LinkedList<Contact> addContact(Contact contact ) {
            this.contacts.add(contact);
            return contacts;
        }
        public LinkedList<Contact> addContactsArray(Contact[] contactArr) {
            this.contacts.addAll(Arrays.asList(contactArr));
            return contacts;
        }
        public LinkedList<Contact> addContactWithValuesToList(int id, String name, String surname, String email, Company company, Department department) {
            this.contacts.add(new Contact(id, name, surname, email, company, department));
            return contacts;
        }
        public LinkedList<Contact> removeContact(Contact contact) {
            this.contacts.remove(contact);
            return this.contacts;
        }
        public void clearList() {
            this.contacts.clear();
        }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", company=" + company +
                ", department=" + department +
                '}';
    }
}
