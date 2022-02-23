package Tuan_04;

public class Circle {
	protected double radius;
	protected String Color;
	public Circle() {
		
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		Color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String toString() {
		return "Circle [radius=" + radius + ", Color=" + Color + "]";
	}
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI; 
	}
}
