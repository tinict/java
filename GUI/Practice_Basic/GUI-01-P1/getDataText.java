package GUI_TIENHANG;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class getDataText {
	private String[] MatHang;
	private String[] Money;
	static int count = 0;
	static int Max = 10000;
	public getDataText() {
		MatHang = new String[Max];
		Money = new String[Max];
	}
	public void ReadLine() throws IOException {
		FileInputStream fis = new FileInputStream("d:/JavaDataBase/DataTest.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while(line != null) {
			String[] Temp = line.split(";");
			MatHang[count] = Temp[0];
			Money[count] = Temp[1];
			count++;
			line = br.readLine();
		}
		br.close();
		isr.close();
		fis.close();
	}
	public int getCount() {
		return count;
	}
	public String[] getMatHang() {
		return MatHang;
	}
	public String[] getMoney() {
		return Money;
	}
	@Override
	public String toString() {
		return "getDataText [MatHang=" + Arrays.toString(MatHang) + ", Money=" + Arrays.toString(Money) + "]";
	}
	
}
