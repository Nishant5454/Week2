public class AreaCircle{ 
	int radius; 
	AreaCircle(int radius){
		
		
		
		
		this.radius=radius;
	} 
	public double Circumfrence() {
		return 2*3.14*radius;
	} 
	public double Area() {
		return 3.14*radius*radius;
	}
	public static void main(String[]args) {
		AreaCircle Ac=new AreaCircle(3); 
		System.out.println(Ac.Circumfrence()); 
		System.out.println(Ac.Area()); 
		
	}
}