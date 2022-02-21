package VieDocsJava;

public class Test_Function {

	public static void main(String[] args) {
//		DataString str = new DataString("Hello;Bye;ioss");
//		System.out.println(str.CountString̣(";"));
//		System.out.println(str.getDataInString(";", 2));
		CleanData str = new CleanData("   Nguyen    van    tin   ");
		str.RemoveSpace();
	}
}
