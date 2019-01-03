package prob6;

public class RectTriangle extends Shape{
	
	public RectTriangle(double w, double h) {
		setWidth(w);
		setHeight(h);
	}
	
	public double getArea() {
		
		return getWidth()*getHeight()/2;
		
	}
	
	public double getPerimeter() {
		double a = Math.pow(getWidth(), 2);
		double b = Math.pow(getHeight(), 2);
		double c = Math.sqrt(a+b);
		
		return getHeight()+getWidth()+c;
	
		
	}
	
	

}
