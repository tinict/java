package Tuan_04;

public class Test_Line {

	public static void main(String[] args) {
		Line test1 = new Line(7, 8, 5, 6);
		System.out.println("Test 1: " + test1.toString());
		Point begin = new Point(1, 2), end = new Point(3, 4);
		System.out.println("Khoảng cách giữa điểm bắt đầu và điểm kết thúc: " + begin.distance(end));
		System.out.println("Khoảng cách giữa 1 điểm tới gốc tọa độ: " + begin.distance());
		System.out.println("Khoảng cách giữa 1 điểm đến 1 điểm được nhập từ bàn phím: "  + end.distance(7,6));
		Line test2 = new Line(begin, end);
		System.out.println("Điểm bắt đầu: " + test2.getBegin());
		System.out.println("Điểm kết thúc: " + test2.getEnd());
		begin.setXY(8,5);
		test2.setBegin(begin);
		end.setXY(18,8);
		test2.setEnd(end);
		System.out.println("Điểm bắt đầu và điểm kết thúc sau khi set: ");
		System.out.println("Điểm bắt đầu: " + test2.getBegin());
		System.out.println("Điểm kết thúc: " + test2.getEnd());
		System.out.println("Điểm bắt đầu arr: "+ "x = " + test2.getBeginXY()[0] + " ; " + "y = " + test2.getBeginXY()[1]);
		System.out.println("Điểm kết thúc arr: "+ "x = " + test2.getEndXY()[0] + " ; " + "y = " + test2.getEndXY()[1]);
		System.out.println(test2.toString());
		System.out.println("Khoảng cách giữa 2 điểm bắt đầu và điểm kết thúc: " + test2.getLength());
	}

}
