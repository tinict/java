package SystemPark;

public class ThongTinXe {
	protected String BienSoXe, CMND, HoTen, MaSoCanHo, HangSanXuat, MauSon;
	protected int Sex;
	
	public ThongTinXe() {
		BienSoXe = null;
		CMND = null;
		HoTen = null;
		MaSoCanHo = null;
		HangSanXuat = null;
		MauSon = null;
		Sex = 0;
	}

	public ThongTinXe(String bienSoXe, String cMND, String hoTen, String maSoCanHo, String hangSanXuat, String mauSon,
			int sex) {
		super();
		BienSoXe = bienSoXe;
		CMND = cMND;
		HoTen = hoTen;
		MaSoCanHo = maSoCanHo;
		HangSanXuat = hangSanXuat;
		MauSon = mauSon;
		Sex = sex;
	}

	public String getBienSoXe() {
		return BienSoXe;
	}

	public void setBienSoXe(String bienSoXe) {
		BienSoXe = bienSoXe;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getMaSoCanHo() {
		return MaSoCanHo;
	}

	public void setMaSoCanHo(String maSoCanHo) {
		MaSoCanHo = maSoCanHo;
	}

	public String getHangSanXuat() {
		return HangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		HangSanXuat = hangSanXuat;
	}

	public String getMauSon() {
		return MauSon;
	}

	public void setMauSon(String mauSon) {
		MauSon = mauSon;
	}

	public int getSex() {
		return Sex;
	}

	public void setSex(int sex) {
		Sex = sex;
	}

	@Override
	public String toString() {
		return "ThongTinXe [BienSoXe=" + BienSoXe + ", CMND=" + CMND + ", HoTen=" + HoTen + ", MaSoCanHo=" + MaSoCanHo
				+ ", HangSanXuat=" + HangSanXuat + ", MauSon=" + MauSon + ", Sex=" + Sex + "]";
	}
}
