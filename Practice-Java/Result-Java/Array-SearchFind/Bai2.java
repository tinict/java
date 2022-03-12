package Array_SearchSort;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {
	public static int[] ArrayNumberRandom() {
		Random random =  new Random();
		int Array[] = new int[100];
		for(int i = 0; i < 100; i++)
		{
			int radom_Number = random.nextInt(101);
			Array[i] = radom_Number;
		}
		return Array;
	}
	
	public static int[] SearchArray(int[] Array, int N)
	{
		int Temp[] = new int[100];
		Temp = Array;
		int VT[] = new int[100];
		int size = 0;
		for(int i = 0; i < Array.length; i++)
			if(N == Temp[i])
				VT[size++] = i;
		return VT;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int Temp[] = new int[100];
		Temp = ArrayNumberRandom();
		for(int i: Temp)
			System.out.print(i + " ");
		System.out.println();
		if(SearchArray(Temp, num) != null) {
			for(int i = 0; i < SearchArray(Temp, num).length; i++)
				System.out.println(SearchArray(Temp, num)[i] + " ");
		}
		sc.close();
	}

}
