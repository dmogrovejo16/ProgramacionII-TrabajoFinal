package Parsons.Capitulo8.AverageExercise;

public interface IAverage {
	 double getMean(double[] numbers);


	    private double calculateMean(double[] numbers) {
	        double sum = 0;
	        for (double num : numbers) {
	            sum += num;
	        }
	        return sum / numbers.length;
	    }

	  
	    default double getMeanDefault(double[] numbers) {
	        return calculateMean(numbers);
	    }
}
