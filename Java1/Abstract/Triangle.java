package Abstract;

public abstract class Triangle extends Shape {
	private int base, height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double)(base * height) / 2;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + " " + super.toString() + "]";
	}
}
