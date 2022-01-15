package BT_TUAN_01;

import java.util.Scanner;

public class BT05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), Max_MAU = (n - 1) / 2;
		double tong  = 0;
		for(int i = 0; i <= Max_MAU; i++)
			tong = tong + Math.pow(-1,i) / (2 * i + 1);
		System.out.println(4 * tong);
	}

}
