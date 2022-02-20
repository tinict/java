package SystemPark;

import java.util.Scanner;

public class RunSystemPark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kích Thước: ");
		int Size = sc.nextInt();
		ListManagerPark List = new ListManagerPark(Size);
		List.InputVehicle();
		List.ShowVehicle();
		sc.close();
	}

}
