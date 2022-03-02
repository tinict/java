package Tuan_05;

public class Triangle implements Shape2{
	protected double base;
	protected double height;
	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	
}
