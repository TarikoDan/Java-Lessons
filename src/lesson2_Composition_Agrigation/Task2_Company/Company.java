package lesson2_Composition_Agrigation.Task2_Company;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company() {
    }

    public Company(String name, ArrayList<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
