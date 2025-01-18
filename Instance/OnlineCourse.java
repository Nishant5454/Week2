public class OnlineCourse{//class name should be same as file name
    private static String courseName;//private access modifier
    private static int duration;
    private static int fee; 
    private static String instituteName="Technocrats Institute of Technology"; 
    public OnlineCourse(String courseName,int duration,int fee){//constructor
        this.courseName=courseName; 
        this.duration=duration;
        this.fee=fee;
    }
    public void displayDetails(){//method
        System.out.println("The  name of the course is "+courseName);
        System.out.println("The duration of the course is "+duration);
        System.out.println("The fee of the course is "+fee);
        System.out.println("The institute name is "+instituteName);

    }
    public static void updateInstitueName(String instituteName){//static method
        OnlineCourse.instituteName=instituteName;
    } 
    public static void main(String[] args) {//main method
        OnlineCourse course1=new OnlineCourse("Java", 3, 5000);
        course1.displayDetails();
        OnlineCourse course2=new OnlineCourse("Python", 2, 4000);
        course2.displayDetails();
        OnlineCourse.updateInstitueName("Technocrats Institute of Technology");
        course1.displayDetails();
        course2.displayDetails();
        
    }
}