import java.util.Scanner;

/**
 * Prints a filling diamond using a given integer as the side length
 * 
 * @author Matt Wright
 * @version November 4, 2014
 */
public class Diamond
{
    /**
     * Prints a filling diamond when given a specific integer.
     */
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer (whole number)");
        int length = in.nextInt();
        
        for (int i = 0; i<length; i = i+2)
        {
            String spaces = "";
            for (int count = 0;i<length;i++)
            {
                spaces = spaces + " ";
            }
            for (int count = 0; count<=i;String diamond = spaces +"*"+ spaces
            System.out.println(diamond);
        }
    }

}
