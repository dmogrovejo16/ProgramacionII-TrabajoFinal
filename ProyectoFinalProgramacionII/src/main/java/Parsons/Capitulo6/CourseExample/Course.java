package Parsons.Capitulo6.CourseExample;
/**
* Esta clase representa a un curso
* @author Mathias Mogrovejo
*
*/
public class Course {

	private static int numberOfCoursesCreated = 0;
	private static int fixedPriceCustomCourse = 5000;
	private static final String coursesAcademy="Udemy";
		private String name;
		private int numberOfDays;
		private double pricePerPerson;
		private int maximoParticipantes;
		
	


		/*Constructor con parametros iniciales
		 * nombre, dias, precio y numero maximo de participantes
		 */
		public Course(String name, int days, double price,int maximoParticipantes){
		this.name = name;
		this.numberOfDays = days;
		this.pricePerPerson = price;
		this.maximoParticipantes = maximoParticipantes;
		numberOfCoursesCreated++;
		}
		
		
		public String getName() {
			return name;
		}
		
	    public void setName(String name) {
		this.name = name;
		}
		public int getNumberOfDays() {
		return numberOfDays;
		}
		public void setNumberOfDays(int numberOfDays) {
			if(numberOfDays >= 1 && numberOfDays <=10)
			{
			this.numberOfDays = numberOfDays;
			}
			else
			{
			// do not accept the parameter value
			// should probably throw an exception (see Chap. 9)
			}
		}
		public double getPricePerPerson() {
		return pricePerPerson;
		}
		public void setPricePerPerson(double pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
		}
		
		public int getMaximoParticipantes() {
			return maximoParticipantes;
		}


		public void setMaximoParticipantes(int maximoParticipantes) {
			this.maximoParticipantes = maximoParticipantes;
		}
		
		public double discountedCostPerPerson(int percentDiscount) {
			return pricePerPerson-percentDiscount*pricePerPerson;
		}
	
		
		public static int getNumberOfCoursesCreated(){
		return numberOfCoursesCreated;
		} 
		
		public static int getFixedPriceCustomCourse(int maximoParticipantes){
			return fixedPriceCustomCourse/maximoParticipantes;
			} 
		
		public static String getCoursesAcademy(){
			return coursesAcademy;
			} 
		
		
}
