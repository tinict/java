package SystemPark;

public class Xe extends ThongTinXe{
	protected String TinhTrangVaoBai, TinhTrangRaBai;
	protected String TimeInPark, TimeOutPark;
	protected int Type;;
	protected String VeXe;
	public Xe(int Type, String BienSoXe, String VeXe, String TimeInPark, String TinhTrangLucVaoBai)
	{
		this.Type = Type;
		this.BienSoXe = BienSoXe;
		this.VeXe = VeXe;
		this.TimeInPark = TimeInPark;
		this.TinhTrangVaoBai = TinhTrangLucVaoBai;
	}
	public String getTinhTrangVaoBai() {
		return TinhTrangVaoBai;
	}
	public void setTinhTrangVaoBai(String tinhTrangVaoBai) {
		TinhTrangVaoBai = tinhTrangVaoBai;
	}
	public String getTinhTrangRaBai() {
		return TinhTrangRaBai;
	}
	public void setTinhTrangRaBai(String tinhTrangRaBai) {
		TinhTrangRaBai = tinhTrangRaBai;
	}
	public String getTimeInPark() {
		return TimeInPark;
	}
	public void setTimeInPark(String timeInPark) {
		TimeInPark = timeInPark;
	}
	public String getTimeOutPark() {
		return TimeOutPark;
	}
	public void setTimeOutPark(String timeOutPark) {
		TimeOutPark = timeOutPark;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	public String getVeXe() {
		return VeXe;
	}
	public void setVeXe(String veXe) {
		VeXe = veXe;
	}
	@Override
	public String toString() {
		return "Xe [Type=" + Type + ", TinhTrangVaoBai=" + TinhTrangVaoBai + ", TinhTrangRaBai=" + TinhTrangRaBai + ", TimeInPark="
				+ TimeInPark + ", TimeOutPark=" + TimeOutPark + ", VeXe=" + VeXe + "]";
	}
}
