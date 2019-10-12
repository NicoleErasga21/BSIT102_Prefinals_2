import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Scanner;

public class foutNicoleErasga
{
    public static void main(String[] args) throws IOException
    {
    		Base64.Decoder nicoleDecoder = Base64.getDecoder();
    	
    		// Constructs New Scanner
            System.out.print("Enter the file name  : ");
            Scanner nicsInput = new Scanner(System.in); // initiliaze Scanner
            
            // Construct and Reads file with the extension
            File nicsFile = new File(nicsInput.nextLine()+".NE");
            nicsInput = new Scanner(nicsFile); 
                       
            // Gets the encrypted message then decodes it then print
            String nicoleList = nicsInput.nextLine();
            String decodedString = new String(nicoleDecoder.decode(nicoleList));
            System.out.println(decodedString);
           
           	// close the file writer
            nicsInput.close();     
    }
}