package BT_TUAN_01;

import java.util.Scanner;

public class BT04 {

	public static void main(String[] args) {
		// [a,b]
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int tong = 0;
		// [1,10]
		for(int i = a; i <= b; i++)
			tong = tong + i;
//		0 + 1 => tong = 1;
//		1 + 1 => tong = 2;
//		2 + 2 => tong = 4;
//		3 + 4 => tong = 7;
//		..
		//tong += i;
		System.out.println(tong);
	}

}
