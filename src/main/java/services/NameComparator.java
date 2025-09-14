package src.main.java.services;

import src.main.java.model.Employee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.getLastName().compareTo(e1.getLastName());
    }
}
