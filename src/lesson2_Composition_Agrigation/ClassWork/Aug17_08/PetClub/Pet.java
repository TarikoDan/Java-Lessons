package lesson2_Composition_Agrigation.ClassWork.Aug17_08.PetClub;

public class Pet {
    private PetsKind petsKind;
    private String alias;
    private int age;

    public Pet() {
    }

    public Pet(PetsKind petsKind, String alias, int age) {
        this.petsKind = petsKind;
        this.alias = alias;
        this.age = age;
    }

    public String getAlias() {
        return alias;
    }

    public PetsKind getKind() {
        return petsKind;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setKind(PetsKind petsKind) {
        this.petsKind = petsKind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice() {
        if (this.petsKind.equals("dog")) {
            System.out.println(this.alias + ": - 'Wow - wow-wowww!!!'");
        }else if (this.petsKind.equals("cat")) {
            System.out.println("Mew- miaow-mrrrrrr...");
        }else {
            System.out.println("Shhhhhhhhhhhhhhhhhhhh");
        }
    }

    public void piss() {
        this.voice();
        System.out.println(this.alias + ": - 'i'm pissed, sorry((('");
    }

    @Override
    public String toString() {
        return petsKind + "{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
