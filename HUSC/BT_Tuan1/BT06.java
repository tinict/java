package BT_TUAN_01;

import java.util.Scanner;

public class BT06 {
	public static int FIBO(int n)
	{
		if(n == 1 || n == 2) return 1;
		else if(n > 2) return FIBO(n - 1) + FIBO(n - 2); // Đệ quy
		return n;
	}
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++)
			System.out.print(FIBO(i) + " ");
	}

}
