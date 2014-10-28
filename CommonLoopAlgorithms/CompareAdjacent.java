import java.util.Scanner;

/**
 * Write a description of class CompareAdjacent here.
 * 
 * @author Matt Wright
 * @version October 28, 2014
 */
public class CompareAdjacent
{
    /**
     * Detects adjacent numbers that are equal in the specified series of numbers.
     */
    public static void main()
    {
        final double EPSILON = 1e-7;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to quit)");
        
        double prevValue = in.nextDouble();
        
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            if (Math.abs(value - prevValue) < EPSILON ) {System.out.println("Duplicate");}
            prevValue = value;
        }
    }

}
