package Tuan_04;

public class Cylinder extends Circle{
	protected double height;
	public Cylinder() {
		
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}

	public Cylinder(double height, double radius)
	{
		 super(radius);
		 this.height = height;
	}
	public Cylinder(double height, double radius, String color)
	{
		super(radius,color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "Cylinder [height=" + height + " " + "Color: " + Color + "]";
	}
	
	public double getVolume() {
		return height * getArea();
	}
}
