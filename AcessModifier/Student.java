public class Student{
    public int rollNumber; 
    protected  String name; 
    private int CGPA; 
    public Student(int rollNumber, String name, int CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    // get the CGPA using Getters and Setters; 
    public void getCGPA(){
        System.out.println("CGPA: " + CGPA);
    }
    public void setCGPA(int CGPA){
        this.CGPA = CGPA;
    } 
    public void displayDetails(){
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
    class Postgraduate extends Student{
        private String specialization;
        public Postgraduate(int rollNumber, String name, int CGPA, String specialization){
            super(rollNumber, name, CGPA);// super keyword is used to call the constructor of the parent class
            this.specialization = specialization;// set the specialization of the Parent class
        }
        public void displayDetails(){
            super.displayDetails();
            System.out.println("Specialization: " + specialization);
        }
    }
    public static void main(String[] args){// main class
        Student student = new Student(1, "John", 8);// call the Parameterised Constructor
        student.displayDetails();//
        student.getCGPA();
        student.setCGPA(9);
        student.getCGPA();
        Student.Postgraduate postgraduate = student.new Postgraduate(2, "Jane", 9, "Computer Science");
        postgraduate.displayDetails();
    }

}