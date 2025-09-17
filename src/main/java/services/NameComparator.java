package services;

import model.*;
import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
//    public int compare(Employee e1, Employee e2) {
//        return e2.getLastName().compareTo(e1.getLastName());
//    }


    public int compare(Employee e1, Employee e2) {
        if(e1.getFirstName().compareTo(e2.getFirstName()) != 0 &&
        e1.getLastName().compareTo(e2.getLastName()) != 0) {
            return e1.getFirstName().compareTo(e2.getFirstName());
        }
        return e1.getSocialSecurityNumber().compareTo(e2.getSocialSecurityNumber());
    }
}
