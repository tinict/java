package VieDocsJava;

import java.util.ArrayList;

public class CleanData {
	protected String str;
	public CleanData()
	{
		this.str = null;
	}
	public CleanData(String str)
	{
		this.str = str;
	}
	
	public void RemoveSpace()
	{
		this.str = str.trim();
		String[] Temp = str.split(" ");
		ArrayList<String> Pick = new ArrayList<String>();
		for(int i = 0; i < Temp.length; i++)
		{
			if(Temp[i] != null)
				System.out.println(Temp[i]);
//			if(Temp[i].compareTo(" ") != 0)
//				Pick.add(Temp[i] + " ");
		}
//		this.str = Pick.trim();
//		for(int i = 0; i < Temp.length; i++)
//			System.out.print(Pick.get(i));
	}
	public String getCleanData()
	{
		return str;
	}
}
