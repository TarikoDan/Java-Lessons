package lesson3_AbstractClass_Interface.ClassWork.Atelier;

import java.util.ArrayList;
import java.util.Arrays;

public class Atelier {
    Wear[] wears;

    public Atelier() {
    }

    public Atelier(Wear[] wears) {
        this.wears = wears;
    }

    public Wear[] getWears() {
        return wears;
    }

    public void setWears(Wear[] wears) {
        this.wears = wears;
    }

    ArrayList<Wear> optionMAN() {
        ArrayList<Wear> mensWear= new ArrayList<Wear>();
        for (Wear wear : wears) {
            System.out.println(wear instanceof MensWear);
            if (wear instanceof MensWear) {
                mensWear.add(wear);
            }
        }
        return mensWear;
    }
    ArrayList<Wear> optionWOMAN() {
        ArrayList<Wear> womenWear= new ArrayList<Wear>();
        for (Wear wear : wears) {
            if (wear instanceof WomenWear) {
                womenWear.add(wear);
            }
        }
        return womenWear;
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "wears=" + Arrays.toString(wears) +
                '}';
    }
}
