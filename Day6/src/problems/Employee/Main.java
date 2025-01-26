package problems.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main   {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee to the list
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, "Saurabh", 50000, 70000);
        fullTimeEmp.assignDepartment("Engineering");
        employees.add(fullTimeEmp);

        // Add PartTimeEmployee to the list
        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, "Pankj", 20000, 50, 120);
        partTimeEmp.assignDepartment("Finance");
        employees.add(partTimeEmp);

        // Display details of all employees
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("--------------------------------");
        }
    }
}