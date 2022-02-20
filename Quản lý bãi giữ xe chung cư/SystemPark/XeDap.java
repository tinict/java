package SystemPark;

public class XeDap extends Xe{
	public XeDap(int Type, String BienSoXe, String VeXe, String TimeInPark, String TinhTrangLucVaoBai)
	{
		super(Type, BienSoXe, VeXe, TimeInPark, TinhTrangLucVaoBai);
	}

	@Override
	public String toString() {
		return "XeDap [TinhTrangVaoBai=" + TinhTrangVaoBai + ", TimeInPark=" + TimeInPark + ", Type=" + Type + ", VeXe="
				+ VeXe + ", BienSoXe=" + BienSoXe + "]";
	}
	
}
