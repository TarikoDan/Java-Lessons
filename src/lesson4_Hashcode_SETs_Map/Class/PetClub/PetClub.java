package lesson4_Hashcode_SETs_Map.Class.PetClub;

import java.util.*;

public class PetClub {
    private Map<Person, List<Pet>> club;

    public PetClub() {this.club = new HashMap<>(); }

    public PetClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public void addPerson(Person person) {
        this.club.put(person, new ArrayList<>());
    }

    public void removePerson(Person person) {
        this.club.remove(person);
    }

    public void addPetToPerson(Person person, Pet pet) {
        List<Pet> pets = this.club.get(person);
        pets.add(pet);
        this.club.replace(person,pets);
    }

    public void removePetFromPerson(Person person, Pet pet) {
        List<Pet> pets = this.club.get(person);
        pets.remove(pet);
        this.club.replace(person,pets);
    }
    public void removeSomePetFromAllPersons(Pet pet) {
        for (Person person : this.club.keySet()) {
            List<Pet> pets = this.club.get(person);
            if (pets.contains(pet)) {
                pets.remove(pet);
                this.club.replace(person, pets);
            }
        }
    }

    @Override
    public String toString() {
        return "PetClub{" +
                "club=" + club +
                '}';
    }
}
