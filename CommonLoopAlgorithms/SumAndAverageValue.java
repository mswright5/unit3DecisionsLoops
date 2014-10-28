import java.util.Scanner;

/**
 * Write a description of class SumAndAverageValue here.
 * 
 * @author Matt Wright 
 * @version October 27, 2014
 */
public class SumAndAverageValue
{
    /**
     * Computes the sum and average of a series of numbers
     */
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter multiple numbers or 'q' to quit");
        
        double total = 0;
        int count = 0;
        
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            total += value;
            count++;
        }
        
        double average = 0;
        if (count > 0){average = total/count;}
        
        System.out.println("Total: " + total + "\nAverage: " + average);
    }

}
