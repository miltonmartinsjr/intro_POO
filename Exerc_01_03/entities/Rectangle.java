package entities;

public class Rectangle {
	
	public Double width;
	public Double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width + width + height + height;
	}
	
	public double diagonal() {
		double diag = Math.pow(width, 2.0) + Math.pow(height, 2.0);
		return diag = Math.sqrt(diag);
	}

}
