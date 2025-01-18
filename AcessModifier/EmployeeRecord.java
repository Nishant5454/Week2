public class EmployeeRecord {
    public int employeeID; 
    protected  String department; 
    private  int salary;

    public EmployeeRecord(int employeeID,String department,int salary) { 
        this.employeeID=employeeID; 
        this.department=department; 
        this.salary=salary;
    } 
    public int getSalary(){
        return salary;
    } 
    public void setSalary(int updatedSalary){
        this.salary=updatedSalary;
    } 
    static class EmployeeData extends EmployeeRecord{

        public EmployeeData(int employeeID,String department,int salary) { 
            super(employeeID, department, salary);
        }
        public void showDetails(){ 
            System.out.println("The employeeID is "+employeeID);
            System.out.println("The department of the Employee is "+department);
            System.out.println("The salary of the Employee is "+getSalary());
        }
        
    } 
    public static void main(String[] args) {
        EmployeeData ed=new EmployeeData(20202, "Finance", 200000); 
        ed.showDetails();
    }
    
    
}
