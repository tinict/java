package BT_TUAN_01;

import java.util.Scanner;

public class BT3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tiền thu nhập cá nhân: ");
		double tien = sc.nextDouble();
		if(tien <= 10 * Math.pow(10,6)) 
			System.out.println(0);
		else if(tien > 10 * Math.pow(10,6) && tien <= 30 * Math.pow(10,6)) 
			System.out.println(((tien - 10) * 0.1) * Math.pow(10,6));
		else if(tien > 30 * Math.pow(10,6) && tien <= 50 * Math.pow(10,6)) 
			System.out.println((20 * 0.1 + (tien - 30) * 0.2) * Math.pow(10,6));
		else 
			System.out.println((20 * 0.1 + 20 * 0.2 + (tien - 50) * 0.3) * Math.pow(10,6));
	}

}
