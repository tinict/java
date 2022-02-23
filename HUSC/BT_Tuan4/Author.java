package Tuan_04;

public class Author {
	protected String Name, Email;
	protected char Gender;
	public Author(String name, String email, char gender) {
		super();
		Name = name;
		Email = email;
		Gender = gender;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Author [Name=" + Name + ", Email=" + Email + ", Gender=" + Gender + "]";
	}
	
}
