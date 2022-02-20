package SystemPark;

public class Xe4Banh extends Xe{
	public Xe4Banh(int Type, String BienSoXe, String VeXe, String TimeInPark, String TinhTrangLucVaoBai)
	{
		super(Type, BienSoXe, VeXe, TimeInPark, TinhTrangLucVaoBai);
	}

	@Override
	public String toString() {
		return "Xe4Banh [TinhTrangVaoBai=" + TinhTrangVaoBai + ", TimeInPark=" + TimeInPark + ", Type=" + Type
				+ ", VeXe=" + VeXe + ", BienSoXe=" + BienSoXe + "]";
	}
}
