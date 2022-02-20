package SystemPark;

public class XeGanMay extends Xe{
	public XeGanMay(int Type, String BienSoXe, String VeXe, String TimeInPark, String TinhTrangLucVaoBai)
	{
		super(Type, BienSoXe, VeXe, TimeInPark, TinhTrangLucVaoBai);
	}

	@Override
	public String toString() {
		return "XeGanMay [TinhTrangVaoBai=" + TinhTrangVaoBai + ", TimeInPark=" + TimeInPark + ", Type=" + Type
				+ ", VeXe=" + VeXe + ", BienSoXe=" + BienSoXe + "]";
	}
	
}
