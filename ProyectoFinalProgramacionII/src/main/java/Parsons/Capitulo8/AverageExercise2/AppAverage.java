package Parsons.Capitulo8.AverageExercise2;

public class AppAverage {
	 public static void main(String[] args) {
	        double[] numbers = {10.0, 20.0, 30.0, 40.0, 50.0};

	        // Lambda expression for mean average
	        IAverage meanAverage = (double[] nums) -> {
	            double sum = 0;
	            for (double num : nums) {
	                sum += num;
	            }
	            return sum / nums.length;
	        };

	        // Lambda expression for median average (assume array is sorted)
	        IAverage medianAverage = (double[] nums) -> {
	            int n = nums.length;
	            if (n % 2 == 0) {
	                return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
	            } else {
	                return nums[n / 2];
	            }
	        };

	        // Demonstrate both
	        System.out.println("Mean Average: " + meanAverage.getAverage(numbers));
	        System.out.println("Median Average: " + medianAverage.getAverage(numbers));
	    }
}
