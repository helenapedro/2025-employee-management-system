package src.main.java;

import src.main.java.data.EmployeeData;
import src.main.java.model.Employee;
import src.main.java.services.NameComparator;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] data = EmployeeData.getEmployeeData();
        Arrays.sort(data, new NameComparator());
        System.out.println(Arrays.toString(findSalaryList(data, 8000)));
    }

    public static Employee[] findSalaryList (Employee[] empArray, double salary) {
        // Return an array of Employees whose getPayment() < salary.
        if (empArray == null) {
            throw new IllegalArgumentException("The array should not be empty");
        }

        int count = 0;
        Employee[] temp = new Employee[empArray.length];

        for (Employee e : empArray) {
            if (e != null && e.getPayment() < salary) {
                temp[count++] = e;
            }
        }
        return Arrays.copyOf(temp, count);
    }
}
