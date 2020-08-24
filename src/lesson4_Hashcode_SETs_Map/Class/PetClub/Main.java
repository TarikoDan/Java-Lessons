package lesson4_Hashcode_SETs_Map.Class.PetClub;

public class Main {

    public static void main(String[] args) {
        Pet dogJymmi = new Pet(PetsKind.DOG, "Jymmi", 4);
        Pet dogLessi = new Pet(PetsKind.DOG, "Lessi", 2);
        Pet dogBox = new Pet(PetsKind.DOG, "Box", 9);
        Pet catREX = new Pet(PetsKind.CAT, "REX", 11);
        Person Andrew = new Person("Andrew", "Rowak", 33);
        PetClub petClub = new PetClub();

        petClub.addPerson(Andrew);
        System.out.println(petClub);

        petClub.addPetToPerson(Andrew,dogJymmi);
        petClub.addPetToPerson(Andrew,dogLessi);
        System.out.println(petClub);

        petClub.removePetFromPerson(Andrew, dogJymmi);
        System.out.println(petClub);

        Person Ann = new Person("Ann", "Ruut", 74);
        petClub.addPerson(Ann);
        petClub.addPetToPerson(Ann, catREX);
        petClub.addPetToPerson(Ann, dogBox);
        System.out.println(petClub);
        petClub.addPetToPerson(Andrew, dogBox);
        System.out.println(petClub);
        petClub.removeSomePetFromAllPersons(dogBox);
        System.out.println(petClub);

        petClub.removePerson(Andrew);

    }

}
