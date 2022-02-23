package Tuan_03;

public class ChuyenXeNgoaiThanh {
	private String MaSC, HoTenTX, SoXe, NoiDen;
	int SoNgayDiDươc;
	private double SoKm, DoanhThu;
	public ChuyenXeNgoaiThanh() {
		MaSC = null;
		HoTenTX = null;
		SoXe = null;
		NoiDen = null;
		SoNgayDiDươc = 0;
		SoKm = 0;
		DoanhThu = 0;
	}
	public ChuyenXeNgoaiThanh(String maSC, String hoTenTX, String soXe, String noiDen, int soNgayDiDươc, double soKm, double doanhThu) {
		MaSC = maSC;
		HoTenTX = hoTenTX;
		SoXe = soXe;
		NoiDen = noiDen;
		SoNgayDiDươc = soNgayDiDươc;
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
	public String getNoiDen() {
		return NoiDen;
	}
	public void setNoiDen(String noiDen) {
		NoiDen = noiDen;
	}
	public int getSoNgayDiDươc() {
		return SoNgayDiDươc;
	}
	public void setSoNgayDiDươc(int soNgayDiDươc) {
		SoNgayDiDươc = soNgayDiDươc;
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
		System.out.println(MaSC + " " + HoTenTX + " " + SoXe + " " + NoiDen + " " + SoNgayDiDươc + " " + SoKm + " " + DoanhThu);
	}
}
