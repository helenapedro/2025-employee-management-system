import data.*;
import model.*;
import services.*;

import java.util.*;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> data = EmployeeData.getEmployeeData();

        //data.sort(Comparator.comparingDouble(Employee::getPayment));
        System.out.println(findSalaryList(data, 8000));
    }

    public static List<Employee> findSalaryList (List<Employee> empArray, double salary) {
        // Return an array of Employees whose getPayment() < salary.
        if (empArray == null) {
            throw new IllegalArgumentException("The array should not be empty");
        }

        List<Employee> temp = new ArrayList<Employee>();

        for (Employee e : empArray) {
            if (e != null && e.getPayment() < salary) {
                temp.add(e);
            }
        }
        return temp;
    }
}
