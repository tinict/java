package BT_Tuan_2;

import java.util.Scanner;

public class BT_03 {
	public static void bubblesort(int[] array)
	{
		for(int i = 0; i < array.length - 1; i++)
		{
			for(int j = i + 1; j < array.length; j++)
			{
				if(array[i] > array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		bubblesort(array);
		for(int i = 0; i < n; i++)
			System.out.print(array[i] + " ");
	}
}
