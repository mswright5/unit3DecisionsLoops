import java.util.Scanner;
import java.util.Random;

/**
 * Swaps two random letters in a given string.
 * 
 * @author Matt Wright and Joe Deahr
 * @version October 29, 2014
 */
public class SwapLetters
{
    /**
     * Swaps two letters in a given string.
     */
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a single word: ");
        String word = in.next();
        
        Random generator = new Random();
        String newWord = "";        
        for (int i = 0; i < word.length();i++)
        {
            int index1 = generator.nextInt(word.length() - 2);
            int index2 = index1;
            while (index2 <= index1)
            {
             index2 = generator.nextInt(word.length() -1 -index1) +index1 + 1;
            }
            
            if (index1 < 0 || index2 < 0)// || index1 == index2) 
            {
                System.out.println("Error");
                System.out.println("\n\n" + index1 + " " + index2);
                break;
            }
            
            else
            {
                System.out.println(index1 + " " + index2);
                newWord = word.substring(0, index1) 
                          + word.substring(index2,index2+1)  
                          + word.substring(index1+1, index2)
                          + word.substring(index1, index1+1)
                          + word.substring(index2+1);
            }
           
            System.out.println(newWord);
        }
    }

}
