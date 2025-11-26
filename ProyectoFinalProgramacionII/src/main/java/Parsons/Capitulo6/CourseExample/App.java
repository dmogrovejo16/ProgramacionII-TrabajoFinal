package Parsons.Capitulo6.CourseExample;

/**
 * Clase principal para el ejecutado del objeto clases
 * 
 * @author Mathias
 * @version 1.0
 */
public class App {
	
	 /**
     * Default constructor for App class.
     */
    public App() {
        // Constructor body (can be empty)
    }
    
	/**
     * Main method that serves as the entry point for the application.
     * 
     * @param args command line arguments (not used)
     */
	public static void main(String[] args)
	{
		//Creamos un curso
	Course javaCourse = new Course("C#", 2, 1500.00,30);
	javaCourse.setName("Java");
	javaCourse.setNumberOfDays(3);
	javaCourse.setPricePerPerson(1000.0);
	javaCourse.discountedCostPerPerson(15);
	System.out.println(javaCourse.getName() +
	" course lasts " + javaCourse.getNumberOfDays() +
	" days and costs " + javaCourse.getPricePerPerson());
	System.out.println("Name of the training company: "+javaCourse.getCoursesAcademy());

	
	
	
	}
	
	
	
}
