package Abstract;

public abstract class Shape {
	private String color;
	public Shape(String color) {
		super();
		this.color = color;
	}
	public abstract double getArea();
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
}
