import java.util.Scanner;

/**
 * Computes the number of spaces ' ' in the specified string.
 * 
 * @author Matt Wright 
 * @version October 27, 2014
 */
public class CountMatches
{
    /**
     * Computes the number of spaces ' ' in the specified string.
     */
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine(); //read the entire line; not just a word
        str = str.trim();
        
        int numSpaces = 0;
        
        for (int index = 0; index < str.length(); index++)
        {
            char ch = str.charAt(index);
            if (ch == ' ')
            {
                numSpaces++;
            }
            
        }
        
        System.out.println("Number of spaces: " + numSpaces);
    }

}
