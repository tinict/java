package OOP_04;

import java.util.Scanner;

public class Test_QLBH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sl = sc.nextInt();
		Manager ql = new Manager(sl);
		ql.Input_Info();
		System.out.println("Tên danh mục: ");
		String name_DM = sc.next();
		ql.Show_Info(name_DM);
		ql.Update_SP(name_DM);
		ql.Show_Info("2");
		sc.close();
//		ThongTinSanPham sp = new ThongTinSanPham(null, null, null, null, 0, null);
//		sp.Show_SanPham();
	}

}
