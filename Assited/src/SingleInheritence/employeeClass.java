import javax.swing.plaf.PanelUI;

/*
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.

 */
class Employee{// Employee class
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){// constructor of employee class
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    //System.out.println("Employee");
    public void displayDetails(){// method for the Employee
       // System.out.println("Employee");
        System.out.println("name :"+this.name);
        System.out.println("id :"+this.id);
        System.out.println("salary:"+this.salary);
    }
}
class Manager extends Employee{// manager class that inherit the Base class
    int teamsize;
    Manager(String name,int id,int salary,int teamsize){
        super(name,id,salary);
        this.teamsize=teamsize;
    }
    @Override
    public void displayDetails(){
        System.out.println("Manager");
        super.displayDetails();
        System.out.println("team size is "+this.teamsize);

    }
}
class Developer extends Employee {// Another class that is extending the base class
    String programming_language;

    Developer(String name, int id, int salary, String programming_language) {
        super(name, id, salary);
        this.programming_language = programming_language;
    }

    @Override
    public void displayDetails() {// Details for the Developer class
        System.out.println("Developer");
        super.displayDetails();
        System.out.println("programming knowledge is "+this.programming_language);
    }
}
class Intern extends Employee{// Intern class that is extending the Base class
    int experience;
    Intern(String name,int id,int salary,int experience){
        super(name,id,salary);
        this.experience=experience;

    }
    @Override
    public void displayDetails(){
        System.out.println("Intern");
        super.displayDetails();
        System.out.println("Experince is "+this.experience);
    }

}
public class employeeClass {// main class
    public static void main(String[] args) {
        Employee e = new Employee("Nishant", 93, 45000);// creating the object of Employee
        Manager manager = new Manager("Amol nagose", 56, 500000, 20);
        Developer developer = new Developer("Saurav", 56, 30000, "Scala");
        Intern intern = new Intern("Uday", 67, 25000, 0);
        e.displayDetails();
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();


    }
}