package Tuan_04;

public class Student extends Person{
	private int numCourse = 0;
	private String[] Courses;
	private int[] grades;
	int Max = 1000;
	public Student(String name, String address) {
		super(name,address);
		Courses = new String[Max];
		grades = new int[Max];
	}
	public String toString() {
		return "Student: " + super.toString();
	};
	public void addCourseGrade(String course, int grade) {
		Courses[numCourse] = course;
		grades[numCourse] = grade;
		numCourse++;
	}
	public void printGrades() {
		for(int i = 0; i < numCourse; i++)
			System.out.println(Courses[i] + "," +grades[i]);
	}

}
