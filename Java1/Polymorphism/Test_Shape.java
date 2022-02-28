package Polymorphism;

public class Test_Shape {
	public static void main(String[] args) {
		Shape hcn = new Rectangle("Vàng", 1, 2);
		System.out.println("Diện tích hình chữ nhật: " + hcn.getArea());
		System.out.println(hcn.toString());
		Shape htg = new Triangle("Xanh", 1, 2);
		System.out.println("Diện tích hình tam giác: " + htg.getArea());
		System.out.println(htg.toString());
	}
}	
