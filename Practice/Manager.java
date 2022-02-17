package OOP_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager{
	protected int sluong;
	ArrayList<ThongTinSanPham> list = new ArrayList<ThongTinSanPham>();
	Scanner sc = new Scanner(System.in);
	public Manager(int sluong) {
		this.sluong = sluong;
	}
	
	public void Input_Info()
	{
		for(int i = 0; i < sluong; i++)
		{
			String mdm = sc.next(), tdm = sc.next(), msp = sc.next(), tsp = sc.next(), xx = sc.next();
			double gc = sc.nextDouble();
			ThongTinSanPham info = new ThongTinSanPham(mdm, tdm, msp, tsp, gc, xx);
			list.add(info);
		}
	}
	public void Show_Info(String str)
	{
		for(int i = 0; i < sluong; i++)
			if((list.get(i).TenDanhMuc).equals(str) == true)
				(list.get(i)).Show_SanPham();
	}
	public Boolean Check_MaSanPham(String str)
	{
		int j = 0;
		for(int i = 0; i < sluong; i++)
			if((list.get(i).MaSanPham).equals(str) == true)
				j++;
		if(j == sluong) return false;
		else return true;
	}
	public void Update_SP(String str) {
		for(int i = 0; i < sluong; i++)
		{
			if((list.get(i).MaSanPham).equals(str) == true)
			{
				String new_MDM = sc.next(), new_TDM = sc.next(), new_MSP = sc.next(), new_TSP = sc.next(), new_XX = sc.next();
				double new_GC = sc.nextDouble();
				ThongTinSanPham new_SP = new ThongTinSanPham(new_MDM, new_TDM, new_MSP, new_TSP, new_GC, new_XX);
				list.set(i, new_SP);
			}
		}
	}
	public void delete_SP(String str) {
		for(int i = 0; i < sluong; i++)
		{
			if((list.get(i).MaSanPham).equals(str) == true)
				list.remove(i);
		}
	}
	public void GiaTriMH() {
		for(int i = 0; i < sluong; i++)
			System.out.println("[ Tên sản phẩm = " + list.get(i).getTenSanPham() + "Giá cả = " + list.get(i).getGiaCa());
	}
	public void List_SP() {
		for(int i = 0; i < sluong; i++)
			if((list.get(i).XuatXu).equals("Chinna") == true)
				list.get(i).Show_SanPham();
	}
}
