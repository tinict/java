package GUI_TIENHANG;

import java.io.IOException;

public class TestGetData {

	public static void main(String[] args) throws IOException {
		getDataText gdt = new getDataText();
		gdt.ReadLine();
		System.out.println(gdt.getMatHang()[0]);
	}

}
