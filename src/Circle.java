
public class Circle {
	
	double radius;
	
	public double area() {
		return radius * radius * Math.PI;
	}
	
	public double circumference() {
		return (radius * 2) * Math.PI;
	}
	
	public Circle() {
		
	}
	
	public Circle (double radius) {
		this.radius = radius;
	}
}
