import java.util.Scanner;

/**
 * Computes the maximum value of the specified series of numbers.
 * 
 * @author Matt Wright 
 * @version October 28, 2014
 */
public class FindMax
{
    /**
     * Computes the maximum value of the specified series of numbers.
     */
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to quit)");
        
        double maxValue = in.nextDouble();
        
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            if (value > maxValue) {maxValue = value;}
            
        }
        
        System.out.println("Maximum value: " + maxValue);
    }
}
