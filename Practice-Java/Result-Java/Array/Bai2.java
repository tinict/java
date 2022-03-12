package Array;

import java.util.Random;

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
	
	public static double averageNumber(int[] array) {
		double sum = 0;
		for(int i: array)
			sum += i;
		return sum/array.length;
	}
	
	public static void main(String[] args) {
		int Temp[] = new int[100];
		Temp = ArrayNumberRandom();
		System.out.println(averageNumber(Temp));
	}
}
