package Tuan_05;

public class Ractangle2 implements Shape2{
	private double length;
	private double width;
	@Override
	public double getArea() {
		return length * width;
	}
	@Override
	public String toString() {
		return "Ractangle2 [length=" + length + ", width=" + width + "]";
	}
	
}
