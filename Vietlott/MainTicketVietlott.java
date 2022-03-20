package SystemVielott;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class MainTicketVietlott {
	private ArrayList<String> ResultVietlott = new ArrayList<String>();
	private ArrayList<String> InfoPersonVietlott = new ArrayList<String>();
	private ArrayList<String> ManagerResultVietlott = new ArrayList<String>();
	private ArrayList<String> ManagerFullName = new ArrayList<String>();
	private ArrayList<String> MangerCity = new ArrayList<String>();
	private ArrayList<String> MangerPhoneNumber = new ArrayList<String>();
	private ArrayList<String> ManagerNumberPerson = new ArrayList<String>();
	private static int CountBody = 0;
	private DataBeautification dbf;
	
	public MainTicketVietlott() {
		
	}
	
	public void ReadResultVietlott() throws IOException {
		FileInputStream fis = new FileInputStream("d:/JavaDataBase/input1.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while(line != null) {
			ResultVietlott.add(line);
			line = br.readLine();
		}
		br.close();
		isr.close();
		fis.close();
	}
	
	public void TestShowResultVietlott() {
		for(String i: ResultVietlott)
			System.out.println(i);
	}
	
	public void ReadInfoPersonVietlott() throws IOException {
		FileInputStream fis = new FileInputStream("d:/JavaDataBase/input2.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while(line != null) {
			InfoPersonVietlott.add(line);
			line = br.readLine();
			CountBody++;
		}
		br.close();
		isr.close();
		fis.close();
	}
	
	public void TestShowInfoPersonVietlott() {
		for(String i: InfoPersonVietlott)
			System.out.println(i);
	}
	
	public void SplitResultInText() throws IOException {
		FileInputStream fis = new FileInputStream("d:/JavaDataBase/input1.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while(line != null) {
			ManagerResultVietlott.add(line);
			line = br.readLine();
		}
		br.close();
		isr.close();
		fis.close();
	}
	
	public void TestShowResultInText() {
		for(String i: ManagerResultVietlott)
			System.out.println(i);
	}
	
	public void SplitInfOfPersonInText() throws IOException {
		FileInputStream fis = new FileInputStream("d:/JavaDataBase/input2.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while(line != null) {
			String Temp[] = line.split(",");
			ManagerFullName.add((dbf = new DataBeautification(Temp[0])).RemoveSpace());
			MangerCity.add((dbf = new DataBeautification(Temp[1])).RemoveSpace());
			MangerPhoneNumber.add((dbf = new DataBeautification(Temp[2])).RemoveSpace());
			String Num = "";
			for(int i = 3; i < Temp.length; ++i)
			{
				dbf = new DataBeautification(Temp[i]);
				Num += dbf.RemoveSpace() + " ";
			}
			ManagerNumberPerson.add((dbf = new DataBeautification(Num)).RemoveSpace());
			line = br.readLine();
		}
		br.close();
		isr.close();
		fis.close();
	}
	
	public void TestShowInfoInText() {
		for(String i: ManagerFullName)
			System.out.println(i);
		System.out.println("-------FullName-------");
		for(String i: MangerCity)
			System.out.println(i);
		System.out.println("-------City-------");
		for(String i: MangerPhoneNumber)
			System.out.println(i);
		System.out.println("-------PhoneNumber-------");
		for(String i: ManagerNumberPerson)
			System.out.println(i);
		System.out.println("-------NumberPerson-------");
	}
	
	public boolean CheckResultVietlott() throws IOException {
		SplitResultInText();
		for(int i = 0; i < 5; ++i)
		{
			int converNumber1 = Integer.parseInt(ManagerResultVietlott.get(i));
			for(int j = i + 1; j < i; i++)
			{
				int converNumber2 = Integer.parseInt(ManagerResultVietlott.get(j));
				if(converNumber1 == converNumber2)
					return false;
			}
			if(converNumber1 < 1 || converNumber1 > 45)
				return false;
		}
		return true;
	}
	
	public void ShowResultFailed() throws IOException {
		if(CheckResultVietlott() == false)
			System.out.println("Du lieu dau vao sai!");
	}
	
	public int getNumber(String str, int index) {
		String Temp[] = str.split(" ");
		return Integer.parseInt(Temp[index]);
	}
	
	public boolean checkSort(String str) {
		String Temp[] = str.split(" "); 
		for(int i = 0; i < Temp.length - 1; i++) {
			int num1 = Integer.parseInt(Temp[i]);
			int num2 = Integer.parseInt(Temp[i+1]);
			if(num1 > num2)
				return false;
		}
		return true;
	}
	
	public boolean CheckLineNumberPerson(int Index) throws IOException {
		SplitInfOfPersonInText();
		for(int i = 0; i < 5; ++i)
		{
			int converNumber1 = getNumber(ManagerNumberPerson.get(Index), i);
			for(int j = i + 1; j < i; i++)
			{
				int converNumber2 = getNumber(ManagerNumberPerson.get(Index), j);
				if(converNumber1 == converNumber2)
					return false;
			}
			if((converNumber1 < 1 || converNumber1 > 45) || checkSort(ManagerNumberPerson.get(Index)) == false)
				return false;
		}
		return true;
	}
	
	public void CheckManagerPerson() throws IOException {
		for(String i: ManagerNumberPerson)
			System.out.println(i);
		for(int i = 0; i < CountBody; ++i) {
			if(CheckLineNumberPerson(i) == false)
				System.out.println("Ve du thuong o dong so " + (i+1) + " khong hop le!");
		}
	}
	
	public int CountBodyWin() throws NumberFormatException, IOException {
		SplitInfOfPersonInText();
		SplitResultInText();
		int c = 0;
		for(int i = 0; i < CountBody; i++)
		{
			int index = 0;
			for(int j = 0; j < 6; j++) {
				int num = Integer.parseInt(ManagerResultVietlott.get(j));
				if(getNumber(ManagerNumberPerson.get(i), j) == num &&  CheckLineNumberPerson(i) == true && CheckResultVietlott() == true)
					index++;
			}
			if(index == 6)
				c++;
		}
		return c;
	}
	
	public void WriteWinVietLot() throws IOException {
		SplitInfOfPersonInText();
		SplitResultInText();
		FileOutputStream fos = new FileOutputStream("d:/JavaDataBase/output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		for(int i = 0; i < CountBody; i++) {
			int index = 0;
			for(int j = 0; j < 6; j++) {
				int num = Integer.parseInt(ManagerResultVietlott.get(j));
				if(getNumber(ManagerNumberPerson.get(i), j) == num &&  CheckLineNumberPerson(i) == true && CheckResultVietlott() == true)
					index++;
			}
			if(index == 6)
			{
				bw.write(ManagerFullName.get(i) + "; " + MangerCity.get(i) + "; " + MangerPhoneNumber.get(i) + "; " + ManagerNumberPerson.get(i) + "; " + "Dac biet" + "; " + ((long)(12 * Math.pow(10,9))/CountBodyWin()));
				bw.newLine();
			}
			else if(index == 5)
			{
				bw.write(ManagerFullName.get(i) + "; " + MangerCity.get(i) + "; " + MangerPhoneNumber.get(i) + "; " + ManagerNumberPerson.get(i) + "; " + "Nhat" + "; " + (long)Math.pow(10,7));
				bw.newLine();
			}
			else if(index == 4)
			{
				bw.write(ManagerFullName.get(i) + "; " + MangerCity.get(i) + "; " + MangerPhoneNumber.get(i) + "; " + ManagerNumberPerson.get(i) + "; " + "Nhì" + "; " + (3 * Math.pow(10, 5)));
				bw.newLine();
			}
			else if(index == 3)
			{
				bw.write(ManagerFullName.get(i) + "; " + MangerCity.get(i) + "; " + MangerPhoneNumber.get(i) + "; " + ManagerNumberPerson.get(i) + "; " + "Ba" + "; " + (3 * Math.pow(10, 4)));
				bw.newLine();
			}
		}
		bw.close();
		osw.close();
		fos.close();
	}
	
}
