/*
Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.

 */
class Animal{//SuperClass
    String name;
    int age;
    Animal(String name,int age){//Constructor
        this.name=name;
        this.age=age;
    }
    public  void makeSound(){
        System.out.println("Animal is making Sound");
    }
}
class Dog extends Animal{//SubClass
    String color;
    Dog(String name,int age,String color){
        super(name,age);
        this.color=color;
    }

    @Override
    public void makeSound() {//Method Overriding
        System.out.println("Dog is Barking");
    }
}
class Cat extends Animal{
    String breed;
    Cat(String name,int age,String color){
        super(name,age);
        this.breed=breed;
    }
    @Override
    public void makeSound(){//Method Overriding
        System.out.println("Cat is doing Meow Meow");
    }
}
class Bird extends Animal{
    String feathure;
    Bird(String name,String color,int age) {//Constructor
        super(name,age);
        this.feathure = feathure;
    }
    public void makeSound(){
        System.out.println("Birds are Screaming");
    }
}
public class animalHirarchy{//Main Class
    public static void main(String[] args) {
        Bird bird=new Bird("Peacock","Black",20);//Object Creation
        bird.makeSound();
        Cat cat=new Cat("Car",10,"White");//Object Creation
        cat.makeSound();
        Dog dog=new Dog("Pitbull",15,"Brown");//Object Creation
        dog.makeSound();//Method Calling



    }

}