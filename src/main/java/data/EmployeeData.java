package src.main.java.data;

import src.main.java.model.*;

public class EmployeeData {
    public static Employee[] getEmployeeData() {
        return new Employee[]{
                new CommissionEmployee("Alice", "Johnson", "111-22-3333",
                        10000, 0.10), // 10% of 10,000 → 1000

                new BasePlusCommissionEmployee("Bob", "Smith", "222-33-4444",
                        5000, 0.08, 300), // 300 + (5000 * 0.08) → 700

                new HourlyEmployee("Carol", "Davis", "333-44-5555",
                        20, 40), // 20 * 40 → 800

                new SalariedEmployee("David", "Wilson", "444-55-6666",
                        1200), // fixed weekly salary

                new CommissionEmployee("Eva", "Brown", "555-66-7777",
                        15000, 0.12) // 12% of 15,000 → 1800
        };
    }
}
