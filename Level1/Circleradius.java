class Circleradius{
    private double radius; 
    Circleradius(){ // default constructor 
        this(3.0);// this keyword calling the Circleradius

    } 
    Circleradius(double radius){// the double radius is calling the
        this.radius=radius;
    } 
    public void displayArea(){// calculate the area of circle
        System.out.println(3.14*radius*radius);
    }
    public static void main(String[] args) {
        Circleradius c=new Circleradius();  
        c.displayArea();

    }
}