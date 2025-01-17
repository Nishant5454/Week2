 public class classEmployeeDetail{ 

    String name; 
    int id; 
    int salary;  // create the atrributes of the code
   classEmployeeDetail(String name,int id,int salary){// create the constructor of the class
        this.name=name; // this keyword refers to current object of the class
        this.id=id;
        this.salary=salary;
    } 
    public void displayresult(){// display function to display the result
        System.out.println("The name of the Employee is "+name); 
        System.out.println("The id of the employee is "+id); 
        System.out.println("The Salary of the Employee is "+salary);
    }
    public static void main(String[] args) {// main functiono of the code 
        classEmployeeDetail ce=new classEmployeeDetail("Nishant",202323,200000); // object of the  classEmployeeDetain
        ce.displayresult();// display the reuslt

    }


}