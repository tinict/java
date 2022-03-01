package Abstract;

public class Ractangle extends Shape{
	private int length, width;
	
	public Ractangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	@Override
	public double getArea() {
		return length * width;
	}
	@Override
	public String toString() {
		return "Ractangle [length=" + length + ", width=" + width + " " + super.toString() + "]";
	}
	
}
