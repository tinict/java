package Tuan_03;

public class ChuyenXeNoiThanh {
	private String MaSC, HoTenTX, SoXe;
	private int SoTuyen;
	private double SoKm, DoanhThu;
	public ChuyenXeNoiThanh() {
		MaSC = null;
		HoTenTX = null;
		SoXe = null;
		SoTuyen = 0;
		SoKm = 0;
		DoanhThu = 0;
	}
	public ChuyenXeNoiThanh(String maSC, String hoTenTX, String soXe, int soTuyen, double soKm, double doanhThu) {
		MaSC = maSC;
		HoTenTX = hoTenTX;
		SoXe = soXe;
		SoTuyen = soTuyen;
		SoKm = soKm;
		DoanhThu = doanhThu;
	}
	public String getMaSC() {
		return MaSC;
	}
	public void setMaSC(String maSC) {
		MaSC = maSC;
	}
	public String getHoTenTX() {
		return HoTenTX;
	}
	public void setHoTenTX(String hoTenTX) {
		HoTenTX = hoTenTX;
	}
	public String getSoXe() {
		return SoXe;
	}
	public void setSoXe(String soXe) {
		SoXe = soXe;
	}
	public int getSoTuyen() {
		return SoTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		SoTuyen = soTuyen;
	}
	public double getSoKm() {
		return SoKm;
	}
	public void setSoKm(double soKm) {
		SoKm = soKm;
	}
	public double getDoanhThu() {
		return DoanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		DoanhThu = doanhThu;
	}
	public void Show()
	{
		System.out.println(MaSC + " " + HoTenTX + " " + SoXe + " " + SoTuyen + " " + SoKm + " " + DoanhThu);
	}
}
