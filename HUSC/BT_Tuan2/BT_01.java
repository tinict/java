package BT_Tuan_2;

import java.util.Scanner;

public class BT_01 {
	public static Boolean Check_ChuoiNhiPhan(String str) // Kiểm tra chuỗi đó có phải chuỗi nhị phân không 
	{
		int j = 0;
		for(int i = 0; i < str.length(); i++) // Dùng vòng for để đếm số phần tử có 0 vs 1 nếu chuỗi mà xuất hiện 1 ký tự đặc biệt thì độ dài hơn so với độ dài ban đầu
			if(str.charAt(i) == '1' || str.charAt(i) == '0')
				j++;
		if(j == str.length()) return true; // nếu bằng độ dài ban đầu là trả về true
		return false; // nếu nhỏ hơn đồ dài ban đầu là trả về false
	}
	public static long Convert_Hex(String str) // chuyển từ hệ 10 sang hệ nhị phân
	{
		int sum = 0, j = str.length() - 1;
		for(int i =  0; i < str.length(); i++)
		{
			int num = Integer.parseInt((str.charAt(i)+"")); // chuyển từ kiểu ký tự sang kiểu số
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
