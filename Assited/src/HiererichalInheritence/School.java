package Hierarichal;
class Person{//super class For Person Having name and age
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void displayRole(){
        System.out.println("This is the Person who may be Student or Staff");
    }
}
class Teacher extends Person{//subclass for Teacher For Teacher having name,age and Level
    String Level;//instance variable
    Teacher(String name,int age,String Level){
        super(name,age);
        this.Level=Level;
    }
    @Override//overriding the method of the super class
    public void displayRole(){//    method for displaying the role of the teacher
        System.out.println("This is the Role of Teacher");
    }
}
class Student extends Person{
    String section;
    Student(String name,int age,String section){
        super(name,age);//calling the constructor of the super class
        this.section=section;
    }
    @Override
    public void displayRole(){
        System.out.println("This the Role of Student");
    }
}
class Staff extends Person{//subclass for Staff having name,age and department
    String department;
    Staff(String name,int age,String department){
        super(name,age);
        this.department=department;
    }
    @Override
    public void displayRole(){//method for displaying the role of the staff
        System.out.println("This is role of Department whose Department is  "+this.department);
    }
}
public class School {//main class for testing the classes
    public static void main(String[] args) {//main method for testing the classes
        Staff s=new Staff("Vaibhav",20,"HR");
        s.displayRole();
        Student st=new Student("Nishant",20,"12th");
        st.displayRole();
        Teacher teacher=new Teacher("Vishnu Sir",20,"L1");
        teacher.displayRole();

    }
}
