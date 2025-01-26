package problems.Employee;

class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String departmentName;

    // Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    // Implement calculateSalary method
    @Override
    public double calculateSalary() {
        return fixedSalary;
    }

    // Implement Department methods
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
