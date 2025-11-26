package Parsons.Capitulo8.AverageExercise;

public class AppAverage {
	 public static void main(String[] args) {
	        IAverage calculator = new AverageCalculator();
	        double[] data = {10.0, 20.0, 30.0, 40.0};

	        // Calling the default method from the interface
	        double mean = calculator.getMeanDefault(data);

	        System.out.println("Mean Average: " + mean);
	    }
}
