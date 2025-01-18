class Person{
    private String name;
    private int age;
    private String Gender; 

    public Person(String name,int age,String Gender) {// this is parameterised constructor
        this.name=name;
        this.age=age; 
        this.Gender=Gender;
    } 
    public Person(Person anotherPerson){// this is doing nothing but copying all the value of the parameterised constructor
        this.name=anotherPerson.name; 
        this.age=anotherPerson.age;
        this.Gender=anotherPerson.Gender;
    }
    public void displayDetail(){
        System.out.println("The name of the person is "+name);
        System.out.println("The age of the Person is "+age);
        System.out.println("The Gender of the Person is "+Gender);
    }
    public static void main(String[] args) {
        Person p=new Person("Nishant",20,"Male"); 
        Person newPerson=new Person(p); 
        p.displayDetail(); 
        System.out.println("************************************");
        newPerson.displayDetail(); 

    }
    
}