import java.util.Scanner;

/**
 * Asks user for a year input and returns whether or not it is a leap year
 * 
 * @author Matt Wright
 * @version October 28, 2014
 */
public class LeapYear
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        
        System.out.println(isLeapYear(year));
    }
    
    public static boolean isLeapYear(int aYear)
    {
        boolean answer;
        if (aYear % 4 == 0 && aYear > 1582 && (aYear % 100 != 0 || aYear % 400 == 0))
        {
            answer = true;
        }
        
        else{ answer = false;}
        
        return answer;
    }

}
