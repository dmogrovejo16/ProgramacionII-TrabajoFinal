package Parsons.Capitulo7.ModuleExample;

public class Prospectus {
	private Course[] prospectus = new Course[20];
	private int prospectusCount = 0;
	public String name;
	public Prospectus(String name) {
		this.name=name;
	}
	public void addCourses(Course new_prospectus)
	{
	if(prospectusCount < prospectus.length)
	{
		prospectus[prospectusCount] = new_prospectus;
		prospectusCount++;
	}
	else
	{
	System.out.println("Cannot add more courses");
	}
	}
	
	public String getName() {
		return name;
	}
	
	public Course[] getCourses() {
	return prospectus;
	}
	public int getCoursesCount() {
	return prospectusCount;
	}
}
