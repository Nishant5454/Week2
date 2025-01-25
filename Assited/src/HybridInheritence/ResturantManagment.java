package HybridInheritence;//package name
class Person{//super class For Person Having name and age
    String name;//instance variable
    int id;
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void displayDetail(){//method for displaying the details
        System.out.println("The name of the Person is "+this.name+"and the id of person is "+this.id);
    }
}
interface Worker{//interface having method performDuties
    void performDuties();

}
class Chef extends Person implements Worker{
    //String Chef_name;
 //   String Chef_id;
    public Chef(String name,int id){//constructor for Chef
        super(name,id);
    }
    @Override
    public void performDuties(){//overriding the method of the interface
       // System.out.println("Chef "+this.Chef_name+" whose Chef id is "+this.Chef_id+" is Cooking food");
        System.out.println("Chef is Performing Duties");

    }

}
class Waiter extends Person implements Worker{//subclass for Waiter
    public Waiter(String name,int id) {
        super(name, id);
    }
    @Override
    public void performDuties(){
        System.out.println("Worker is performing Duties");
    }
}


public class ResturantManagment {//main class for testing the classes
    public static void main() {
        Chef ch = new Chef("Nishant", 101);
        ch.performDuties();
        Waiter wt=new Waiter("Suraj",102);
        wt.performDuties();

    }
}
/*
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same object
 */