package prob6;

public class Rectangle extends Shape implements Resizable{
	
	public Rectangle(double w, double h) {
		setWidth(w);
		setHeight(h);
	}
	
	public void resize(double s) {
		setWidth(getWidth()*s);
		setHeight(getHeight()*s);
	}
	
	public double getArea() {
		
		return getWidth()*getHeight();
		
	}
	
	public double getPerimeter() {
		
		return (getHeight()+getWidth())*2;
	
		
	}

}
