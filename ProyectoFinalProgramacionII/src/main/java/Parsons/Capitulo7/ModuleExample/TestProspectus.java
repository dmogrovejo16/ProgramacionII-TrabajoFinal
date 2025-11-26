package Parsons.Capitulo7.ModuleExample;

public class TestProspectus {
	public static void main(String[] args) {
		Prospectus myProspect = new Prospectus("Hard Skills");
		Course course1 = new Course
		("Unit testing", 10, 2000, 50);
		Course course2 = new Course
		("Acceptance testing", 20, 1520,12);
		Course course3 = new Course("Boundary Values", 50,500,50);
		// add the modules to the course
		myProspect.addCourses(course1);
		myProspect.addCourses(course2);
		myProspect.addCourses(course3);
		// display the course details
		System.out.println(myProspect.getName()
		+ " contains the following modules:");
		System.out.println
		("Prospect name \t Course name");
		for (int i = 0; i < myProspect.getCoursesCount(); i++) {
		System.out.println(myProspect.getName() +
		'\t' + myProspect.getCourses()[i].getName());
		}
	}}
