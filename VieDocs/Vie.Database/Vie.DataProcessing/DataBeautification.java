package Vie.DataProcessing;

import java.util.ArrayList;

/**
 * @author tinict
 * @since 2022
 * @see <a href="https://github.com/tinict/java/tree/main/VieDocs">Github</a>
 * @version 1.0
 * Làm đẹp dữ liệu từ file text
 */

public class DataBeautification implements modelDataBeautification{

	private String str;
	
	public DataBeautification() {
		this.str = null;
	}
	
	public DataBeautification(String str) {
		this.str = str;
	}
	
	/*Xóa khoảng trắng phía bên trái của chuỗi truyền vào*/
	public String RemoveLeftSpace(){
		boolean Left = false;
		String Pick = "";
		for(int i = 0; i < str.length(); ++i){
			if(str.charAt(i) != ' ' && Left == false)
				Left = true;
			if(Left == true)
				Pick += (String)(str.charAt(i)+"");
		}
		return this.str = Pick;
	}
	
	/*Xóa khoảng trắng phía bên phải của chuỗi truyền vào*/
	public String RemoveRightSpace(){
		String Reverse = new StringBuffer(str).reverse().toString();
		DataBeautification Temp = new DataBeautification(Reverse);
		return this.str = new StringBuffer(Temp.RemoveLeftSpace()).reverse().toString();
	}
	
	/*Xóa khoảng trắng dư thừa*/
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
		return this.str = Temp;
	}
	
	public boolean isNull(){
		if(str == null)
			return true;
		return false;
	}
	
	/*Làm đẹp họ và tên theo đúng chuẩn*/
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

	@Override
	public String toString() {
		return str;
	}
	
}
