package Tuan_05;

public class Test_Shape {

	public static void main(String[] args) {
		Shape hinh1 = new Circle(3, "Red", true);
		Shape hinh2 = new Rectangle(2, 3, "blue", false);
		System.out.println(hinh1.toString());
		System.out.println(hinh2.toString());
	}

}
