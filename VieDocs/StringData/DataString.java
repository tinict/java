package VieDocsJava;

public class DataString {
	protected String str;
	public DataString()
	{
		this.str = null;
	}
	public DataString(String str)
	{
		this.str = str;
	}
	public int CountString̣(String c)
	{
		int count = 0;
		for(int i = 0; i < str.length(); i++)
			if(c.equals(str.charAt(i)+"") == true)
				count++;
		return count+1;
	}
	public String getDataInString(String c, int index)
	{
		String[] Temp = str.split(c,CountString̣(c));
		return Temp[index];
	}
}
