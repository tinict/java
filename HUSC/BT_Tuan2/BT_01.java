package BT_Tuan_2;

import java.util.Scanner;

public class BT_01 {
	public static Boolean Check_ChuoiNhiPhan(String str)
	{
		int j = 0;
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == '1' || str.charAt(i) == '0')
				j++;
		if(j == str.length()) return true;
		return false;
	}
	public static long Convert_Hex(String str)
	{
		int sum = 0, j = str.length() - 1;
		for(int i =  0; i < str.length(); i++)
		{
			int num = Integer.parseInt((str.charAt(i)+""));
			if(num == 1)
					sum += Math.pow(2,j) * num;
			if(num == 0)
				sum += Math.pow(2,j) * num;
			j--;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(Check_ChuoiNhiPhan(str) == true)
			System.out.println(Convert_Hex(str));
		
	}

}
