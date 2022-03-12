package Array;

import java.util.Random;

public class Bai4 {
	
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
	
	public static void OutputLeftArray(int[] array) {
		for(int i: array)
			System.out.print(i + " ");
	}
	
	public static void OutputRightArray(int[] array) {
		for(int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
	}
	
	public static void main(String[] args) {
		int Temp[] = new int[100];
		Temp = ArrayNumberRandom();
		OutputLeftArray(Temp);
		System.out.println();
		OutputRightArray(Temp);
	}

}
