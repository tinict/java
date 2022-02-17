package OOP_04;

public class ThongTinSanPham extends DanhMuc{
	protected String MaSanPham, TenSanPham;
	protected double GiaCa;
	protected String XuatXu;

	public ThongTinSanPham() {
		super();
		MaSanPham = null;
		TenSanPham = null;
		GiaCa = 0;
		XuatXu = null;
	}
	public ThongTinSanPham(String madanhmuc,String tendanhmuc,String maSanPham, String tenSanPham, double giaCa, String xuatXu) {
		super(madanhmuc, tendanhmuc);
		MaSanPham = maSanPham;
		TenSanPham = tenSanPham;
		GiaCa = giaCa;
		XuatXu = xuatXu;
	}
	public String getMaSanPham() {
		return MaSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		MaSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return TenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		TenSanPham = tenSanPham;
	}
	public double getGiaCa() {
		return GiaCa;
	}
	public void setGiaCa(double giaCa) {
		GiaCa = giaCa;
	}
	public String getXuatXu() {
		return XuatXu;
	}
	public void setXuatXu(String xuatXu) {
		XuatXu = xuatXu;
	}
	
	@Override
	public String toString() {
		return "ThongTinSanPham [MaDanhMuc=" + MaDanhMuc + ", TenDanhMuc=" + TenDanhMuc + ", MaSanPham=" + MaSanPham + ", TenSanPham=" + TenSanPham + ", GiaCa=" + GiaCa
				+ ", XuatXu=" + XuatXu + "]";
	}
	
	void Show_SanPham()
	{
		System.out.println(toString());
	}
}
