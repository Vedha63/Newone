// SumAndAverage.java
public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        int count = 10;

        // Calculate sum of first 10 numbers
        for (int i = 1; i <= count; i++) {
            sum += i;
        }

        // Calculate average
        double average = (double) sum / count;

        // Print results
        System.out.println("Sum of first 10 numbers: " + sum);
        System.out.println("Average of first 10 numbers: " + average);
    }
}