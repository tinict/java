package Tuan_04;

import java.util.ArrayList;

public class Teacher extends Person{
	private int numCourse = 0;
	private String[] Courses;
	int Max = 1000;
	public Teacher(String name, String address) {
		super(name,address);
		Courses = new String[Max];
	}
	public boolean addCourse(String course) {
		for(int i = 0; i < numCourse; i++)
			if(course.equals(Courses[i]) == true)
				return false;
		Courses[numCourse] = course;
		numCourse++;
		return true;
	}
	public boolean removeCourse(String course) {
		ArrayList<String> Temp = new ArrayList<String>();
		int index = 0;
		for(int i = 0; i < numCourse; i++)
		{
			Temp.add(Courses[i]);
			if(course.equals(Courses[i]) == true)
				index = i;
		}
		if(index == 0)
			return false;
		Temp.remove(index);
		Courses = new String[Temp.size()];
		Courses = Temp.toArray(Courses);
		return true;
	}
	public void printCourese() {
		for(String i: Courses)
			System.out.println(i);
	}
	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}
}
