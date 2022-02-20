package SystemPark;

import java.util.ArrayList;
import java.util.Scanner;

public class ListManagerPark {
	protected int Size;
//	protected ThongTinXe[] Vehicle = new ThongTinXe[Size];
	protected ArrayList<ThongTinXe> Vehicle = new ArrayList<ThongTinXe>();
	public ListManagerPark()
	{
		this.Size = 0;
	}
	public ListManagerPark(int Size)
	{
		this.Size = Size;
	}
	public void InputVehicle()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < Size; i++)
		{
//			System.out.println("Loại Xe: ");
			int type = sc.nextInt();
			System.out.println("Biển Số Xe: ");
			String BSX = sc.next();
			System.out.println("Vé Xe: ");
			String VeXe = sc.next();
			System.out.println("Thời Gian Vào Bãi: ");
			String TimeInPark = sc.next();
			System.out.println("Tình Trạng Xe Lúc Vào Bãi: ");
			String TTXLVB = sc.next();
			if(type == 0)
			{
				ThongTinXe Vehicle_XeDap = new XeDap(type, BSX, VeXe, TimeInPark, TTXLVB);
				Vehicle.add(Vehicle_XeDap);
			}
			else if(type == 2)
			{
				ThongTinXe Vehicle_XeGanMay = new XeGanMay(type, BSX, VeXe, TimeInPark, TTXLVB);
				Vehicle.add(Vehicle_XeGanMay);
			}
			else if(type == 4)
			{
				ThongTinXe Vehicle_Xe4Banh = new Xe4Banh(type, BSX, VeXe, TimeInPark, TTXLVB);
				Vehicle.add(Vehicle_Xe4Banh);
			}
			sc.close();
		}
	}
	public void ShowVehicle()
	{
		for(int i = 0; i < Size; i++)
			System.out.println(Vehicle.toString());
	}
}
