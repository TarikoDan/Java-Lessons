package lesson2_Composition_Agrigation.Task3_Request;

import java.lang.reflect.Array;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Client {
    private String name;
    private String surname;
    private int[] birthDate;
    private Passport passport;

    public Client() {
    }

    public Client(String name, String surname, int bDD, int bMM, int bYYYY, String pSeries, int pNumber, String pServiceIssues) {
        this.name = name;
        this.surname = surname;
        this.birthDate = new int[3];
        birthDate[0] = bDD;
        birthDate[1] = bMM;
        birthDate[2] = bYYYY;
        this.passport = new Passport(pSeries, pNumber, pServiceIssues);
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

    public int[] getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int[] birthDate) {
        this.birthDate = birthDate;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + Arrays.toString(birthDate) +
                ", passport=" + passport +
                '}';
    }
}
