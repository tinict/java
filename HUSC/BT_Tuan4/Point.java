package Tuan_04;

public class Point {
	private int x,y;
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point (" + x + "," + y + ")";
	}
	public int[] getXY(){
		int[] arr = new int[2];
		arr[0] = x;
		arr[1] = y;
		return arr;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow((x - this.x),2) + Math.pow((y - this.y),2));
	}
	public double distance(Point another) {
		return Math.sqrt(Math.pow(another.getX() - this.x,2) + Math.pow(another.getY() - this.y,2));
	}
	public double distance(){
		return  Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
	}
}
