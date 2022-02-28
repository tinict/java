package Polymorphism;

public class TestMonster {
	public static void main(String[] args) {
		Monster fire = new FireMonster("quái vật lửa");
		Monster water = new WaterMonster("quái vật nước");
		Monster stone = new StoneMonster("quái vật đá");
		System.out.println(fire.attack());
		System.out.println(water.attack());
		System.out.println(stone.attack());
	}
}
