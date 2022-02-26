package Tuan_04;

public class Test_Person {
	public static void main(String[] args) {
		Student stu1 = new Student("Huế", "Nguyễn Huệ");
		stu1.addCourseGrade("A",1);
		stu1.addCourseGrade("B",2);
		stu1.addCourseGrade("C",3);
		stu1.addCourseGrade("D",4);
		stu1.printGrades();
		System.out.println(stu1.toString());
		Teacher tch = new Teacher("Đà Nẵng", "Lê Lợi");
		tch.addCourse("A");
		tch.addCourse("B");
		tch.addCourse("C");
		tch.addCourse("D");
		System.out.println("Sau khi xóa: ");
		tch.removeCourse("C");
		tch.printCourese();
		System.out.println(tch.toString());
	}

}
