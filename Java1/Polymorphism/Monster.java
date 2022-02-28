package Polymorphism;

public class Monster {
	private String name;
	public Monster(String name) {
		this.name = name;
	}
	public String attack() {
		return name + " tấn công!";
	}
}
