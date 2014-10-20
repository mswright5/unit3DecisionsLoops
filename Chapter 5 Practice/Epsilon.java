import java.util.Scanner;

/**
 * Write a description of class Epsilon here.
 * 
 * @author Matt Wright
 * @version October 13, 2014
 */
public class Epsilon
{
    public static void main()
    {
        final double EPSILON = 1e-14;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        double num = s.nextDouble();
        
        String magnitude = "";
        
        if(num < 1.0)
        {
            magnitude = "small";
        }
        
        if(Math.abs(num) > 1000000.0)
        {
            magnitude = "large";
        }
        
        if(Math.abs(num-0) < EPSILON) //num == 0
        {
            System.out.println("It's a 0.");
        }
        
        else if (num > 0)
        {
            System.out.println("It's a " + magnitude + " positive number.");
            
        }
        
        else
        {
            System.out.println("It's a " + magnitude + " negative number.");
        }
    }

}
