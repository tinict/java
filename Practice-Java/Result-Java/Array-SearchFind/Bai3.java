package Array_SearchSort;

import java.util.Random;

public class Bai3 {
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
	
	public static void print_Array(int[] array) {
		for(int i: array)
			System.out.print(i + " ");
	}
	
	public static void SortRaise(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int Temp = array[i];
					array[i] = array[j];
					array[j] = Temp;
				}
			}
		}
	}
	
	public static void SortDecrease(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] < array[j]) {
					int Temp = array[i];
					array[i] = array[j];
					array[j] = Temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int Temp[] = new int[100];
		Temp = ArrayNumberRandom();
		SortRaise(Temp);
		print_Array(Temp);
	}

}
