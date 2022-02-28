package Polymorphism;

public class Shape {
	private String color;
	public Shape(String color) {
		this.color = color;
	}
	public double getArea() {
		return 0;
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
}
