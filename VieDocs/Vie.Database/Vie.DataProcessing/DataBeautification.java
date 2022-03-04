package Vie.DataProcessing;

import java.util.ArrayList;

public class DataBeautification {
	protected String str;
	
	public DataBeautification() {
		this.str = null;
	}
	
	public DataBeautification(String str) {
		this.str = str;
	}
	
	public String RemoveLeftSpace(){
		boolean Left = false;
		String Pick = "";
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != ' ' && Left == false)
				Left = true;
			if(Left == true)
				Pick += (String)(str.charAt(i)+"");
		}
		return this.str = Pick;
	}
	
	public String RemoveRightSpace(){
		String Reverse = new StringBuffer(str).reverse().toString();
		DataBeautification Temp = new DataBeautification(Reverse);
		return this.str = new StringBuffer(Temp.RemoveLeftSpace()).reverse().toString();
	}
	
	public String RemoveSpace(){
		String[] Temp = str.split(" ");
		String Pick = " ";
		for(int i = 0; i < Temp.length; i++)
			if(Temp[i] != "")
				Pick += Temp[i] + " ";
		return this.str = Pick.trim();
	}
	
	public boolean CheckAnphabe(char c) {
		if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
			return true;
		return false;
	}
	
	public String RemoveChar() {
		String Temp = "";
		for(int i = 0; i < str.length(); ++i)
			if(CheckAnphabe(str.charAt(i)) == true)
				Temp += str.charAt(i) + "";
		return Temp;
	}
	
	public boolean CheckList(){
		if(str == null)
			return true;
		return false;
	}
	
	public String toUpperName()
	{
		boolean flag = true;
		ArrayList<String> Temp = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++)
		{
			
			if(flag == true) {
				Temp.add((str.charAt(i)+"").toUpperCase());
				flag = false;
			}
			else if(flag == false)
				Temp.add((str.charAt(i)+"").toLowerCase());
			if(str.charAt(i) == ' ')
				flag = true;
		}
		for(String s: Temp)
			sb.append(s);
		str = sb.toString();
		return str;
	}
}
