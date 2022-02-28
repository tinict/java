package Polymorphism;

public class Rectangle extends Shape{
	private int length, width;
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + " " + super.toString() + "]";
	}
	
}
