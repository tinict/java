package Tuan_04;

public class Line {
	private Point begin, end;
	public Line(int x1, int y1, int x2, int y2) {
		begin = new Point(x1, y1);
		end = new Point(x2, y2);
	}
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}
	public Point getBegin() {
		return begin;
	}
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	public int getBeginX() {
		return begin.getX();
	}
	public void setBeginX(int x){
		begin.setX(x);
	}
	public int getBeginY() {
		return begin.getY();
	}
	public void setBeginY(int y)
	{
		begin.setY(y);
	}
	public int[] getBeginXY() {
		int[] arr = new int[2];
		arr[0] = begin.getX();
		arr[1] = begin.getY();
		return arr;
	}
	public void setBeginXY(int x, int y) {
		begin = new Point(x, y);
	}
	public int getEndX() {
		return end.getX();
	}
	public void setEndX(int x) {
		end.setX(x);
	}
	public int getEndY() {
		return end.getY();
	}
	public void setEndY(int y) {
		end.setY(y);
	}
	public int[] getEndXY() {
		int[] arr = new int[2];
		arr[0] = end.getX();
		arr[1] = end.getY();
		return arr;
	}
	public void setEndXY(int x, int y) {
		end = new Point(x, y);
	}
	public String toString() {
		return "Line[begin=("+begin.getX() + "," + begin.getY() + "),end=(" + end.getX()+ "," +end.getY() + ")]";
	}
	public double getLength() {
		return begin.distance(end);
	}
}
