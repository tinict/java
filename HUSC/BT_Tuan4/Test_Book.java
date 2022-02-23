package Tuan_04;

public class Test_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("tuan", "minh@123", '1');
		Book b = new Book("lthdt",a, 100, 1);
		System.out.println(b.toString() );
	}

}
