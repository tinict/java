package SystemPark;

import java.util.ArrayList;

public class Test_SystemPark {

	public static void main(String[] args) {
		ArrayList<ThongTinXe> inf = new ArrayList<ThongTinXe>();
		ThongTinXe[] arr = new ThongTinXe[3];
		ThongTinXe a = new XeDap(0, "Not Available", "1014", "14:15 07/11/2015", "Not Available");
		inf.add(a);
		ThongTinXe b = new Xe4Banh(4, "35A-365.12", "Not Available", "11:30 07/11/2015", "Binh Thuong");
		inf.add(b);
		ThongTinXe c = new XeGanMay(2, "38H1-4536", "Not Available", "17:10 07/11/2015", "Not Available");
		inf.add(c);
		System.out.println(inf.get(0));
		System.out.println(inf.get(1));
		System.out.println(inf.get(2));
	}

}
