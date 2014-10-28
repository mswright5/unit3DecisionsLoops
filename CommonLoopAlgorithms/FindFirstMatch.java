import java.util.Scanner;

/**
 * Computes the index of the first space (' ') in the specified string.
 * 
 * @author Matt Wright 
 * @version October 27, 2014
 */
public class FindFirstMatch
{
    /**
     * Computes the index of the first space (' ') in the string, if any.
     */
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.nextLine();
        
        boolean found = false;
        int index = -1;
        char ch = '¬';
        
        while(index < str.length())
        {
            ch = str.charAt(index);
            if (ch == ' '){break;}
            else {index++;}
        }
        
        if (ch == ' '){System.out.println("Index of first space: " + index);}
        
        
    }

}
