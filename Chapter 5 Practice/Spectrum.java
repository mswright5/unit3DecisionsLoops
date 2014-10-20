import java.util.Scanner;

/**
 * Prompts the user for a wavelength value and prints a description of the corresponding part of 
 * the electromagnetic spectrum
 * 
 * @author Matt wright 
 * @version October 20, 2014
 */
public class Spectrum
{
    /**
     * Asks for wavelength and prints the Type of wave and frequency
     */
    public static void main()
    {
        while (true){
        System.out.print("Please enter a wavelength: ");
        Scanner in = new Scanner(System.in);
        double wavelength = in.nextDouble();
        
        if (wavelength > 10e-1)
        {
            System.out.println("Radio Waves\nWavelength: > 10e-1\nFrequency: < 3 x 10e9");
        }
        
        else if (wavelength <= 10e-1 && wavelength > 10e-3)
        {
            System.out.println("Microwaves\nWavelength: 10e-1 to 10e-3\nFrequency: < 3 x 10e9 to 3 x 10e11");
        }
        
        else if (wavelength <= 10e-3 && wavelength > 7 * 10e-7)
        {
            System.out.println("Infrared\nWavelength: 7 * 10e-7 to 10e-3\nFrequency: < 3 x 10e11 to 4 x 10e14");
        }
        
        //TODO
        else if (wavelength <= 4 * 10e-7 && wavelength > 7 * 10e-7)
        {
            System.out.println("Visible Light\nWavelength: 7 * 10e-7 to 4 * 10e-7\nFrequency: < 4  x 10e14 to 7.5 x 10e14");
        }
        
         else if (wavelength <= 4 * 10e-7 && wavelength > 10e-8)
        {
            System.out.println("Ultraviolet\nWavelength: 4 * 10e-7 to 10e-8\nFrequency: < 7.5 x 10e14 to 3 x 10e16");
        }
        
        else if (wavelength <= 10e-8 && wavelength > 10e-11)
        {
            System.out.println("X-rays\nWavelength: 10e-8 to 10e-11\nFrequency: < 3 x 10e16 to 3 x 10e19");
        }
        else 
        {
            System.out.println("Gamma Rays\nWavelength: < 10e-11\nFrequency: < 3 x 10e16 to 3 x 10e19");
        }
        }
    }
}
