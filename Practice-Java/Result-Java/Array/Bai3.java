package Array;

import java.util.Random;

public class Bai3 {
	public static int[] ArrayFloatRandom() {
		Random random =  new Random();
		int Array[] = new int[100];
		for(int i = 0; i < 100; i++)
		{
			int radom_Number = random.nextInt(101);
			Array[i] = radom_Number;
		}
		return Array;
	}
	
	public static double[] ArrayNumberRandom() {
		Random random =  new Random();
		double Array[] = new double[100];
		for(int i = 0; i < 100; i++)
		{
			double radom_Number = random.nextDouble(1);
			Array[i] = radom_Number;
		}
		return Array;
	}
	
	public static double tbts(int[] a, int[] b, int N) {
		int sum = 0;
		for(int i = 1; i <= N; i++)
			sum += a[i] * b[i];
		return sum/N;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 50; i++)
			System.out.println(ArrayNumberRandom()[i] + " ");
	}
}
