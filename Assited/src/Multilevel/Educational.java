package Multilevel;
class Course{//super class For Course Having courseName and duration
    String courseName;
    String duration;
    Course(String courseName,String duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    public void courseDetail(){//method for displaying the details
        System.out.println("Course Details :");
        System.out.println("courseName is "+this.courseName);
        System.out.println("courseDuration is "+this.duration);
    }
}
class OnlineCourse extends  Course{//subclass for OnlineCourse having platform and isRecorded
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName,String duration,String platform,boolean isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;

    }
    @Override
    public void courseDetail(){//overriding the method of the super class
        super.courseDetail();
        System.out.println("Online Platform will be "+this.platform);
        System.out.println("is the Course Will be Recorded ?"+this.isRecorded);
    }

}
class PaidOnlineCoure extends OnlineCourse{//subclass for PaidOnlineCourse having fee and discount
    int fee;
    int discount_in_percentage;
    PaidOnlineCoure(String courseName,String duration,String platform,boolean isRecorded,int fee,int discount_in_percentage){
        super(courseName,duration,platform,isRecorded);
        this.fee=fee;
        this.discount_in_percentage=discount_in_percentage;
    }
   int value=0;
    public int getDiscount_in_percentage(int discount){
        value=(fee*discount)/100;
        return value;

    }
    public int totalfeeAfterDiscount(int fee,int value){
        return fee-value;
    }
    @Override
    public void courseDetail(){

        //totalfeeAfterDiscount()
        super.courseDetail();
        System.out.println("Fee of the Course will be "+this.fee);
        System.out.println("Total discount given in Percentage "+this.discount_in_percentage);
        System.out.println("Total fee have to pay"+totalfeeAfterDiscount( fee, value));
    }
}

public class Educational {//main class for testing the classes
    public static void main(String[] args) {
//        Course course = new Course("Java Full Stack", "4 Months");

        PaidOnlineCoure paidOnlineCoure = new PaidOnlineCoure("Java Full Stack", "4 Months", "Zoom", true, 40000, 10);
paidOnlineCoure.courseDetail();

    }
}
/*
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.

 */
