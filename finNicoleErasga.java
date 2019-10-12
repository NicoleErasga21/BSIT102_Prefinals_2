import java.util.*;
import java.io.*;

 public class finNicoleErasga
 	 {
		public static void main (String []args) throws IOException
		{
		
		// Creates the array list to store words
	    ArrayList<String> nicsWords = new ArrayList<String>(); 
	    
	    // Constructs and Initialize Scanner and Base64 Encoder
	    Scanner nicsScan = new Scanner(System.in);
        Base64.Encoder nicsEncode = Base64.getEncoder();// return the string that encodes using basic type of base64 encoding scheme
	    
        // Variables for encode and validation
	    String stringEncoded;
	    String validation;
   
    	// The while loop to determine if the user inputs the stop message ":q" 
	    Boolean isSaving = false;
	    System.out.println("Please Input Messages");
	        while(isSaving == false)
	    {
			validation = nicsScan.nextLine();	   
				// if the user inputs the stop message it will terminate the loop
				if(validation.equals(":q"))
				{
					isSaving = true;
				}	
				// if the uset hasn't put the stop message then the loop continues and add more words
				else
				{
				stringEncoded = nicsEncode.encodeToString(validation.getBytes());
				nicsWords.add(stringEncoded);
				System.out.println(stringEncoded);
				}
	    
	    }
	    // Asks the user whether to save the file or not
        System.out.println("Do you want to save it? ");
        System.out.println("Yes or No? ");
        String saveFile = nicsScan.nextLine();
        String fileName;
        
			   	// if the user inputs yes then the file will be save to a new file
        		if(saveFile.equalsIgnoreCase("yes") ||saveFile.equalsIgnoreCase("y"))
			    {
				    System.out.println("Enter your file name: ");
				    fileName = nicsScan.nextLine();
				    Writer nicsWriter = new FileWriter(fileName +".NE");
				   
				    for(String listToWords: nicsWords)
					    {
					    nicsWriter.write(listToWords);
					    }
					    nicsWriter.close();
			     }
			        else
			        	{
			        		// if not it won't be saved
			        		System.out.println("Not saved!");
			        	}
    }
}
