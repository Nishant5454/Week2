package problems.Employee;

class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate;
    private int workHours;
    private String departmentName;

    // Constructor
    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, int workHours) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    // Implement calculateSalary method
    @Override
    public double calculateSalary() {
        return hourlyRate * workHours;
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
