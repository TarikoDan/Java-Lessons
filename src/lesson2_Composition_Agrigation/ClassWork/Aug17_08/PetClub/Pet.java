package lesson2_Composition_Agrigation.ClassWork.Aug17_08.PetClub;

public class Pet {
    private String kind;
    private String alias;
    private int age;

    public Pet() {
    }

    public Pet(String kind, String alias, int age) {
        this.kind = kind;
        this.alias = alias;
        this.age = age;
    }

    public String getAlias() {
        return alias;
    }

    public String getKind() {
        return kind;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice() {
        if (this.kind.equals("dog")) {
            System.out.println(this.alias + ": - 'Wow - wow-wowww!!!'");
        }else if (this.kind.equals("cat")) {
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
        return kind + "{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
}
