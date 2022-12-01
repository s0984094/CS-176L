import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
	  Scanner scanIn = new Scanner(System.in);
	  System.out.print("Please enter the path to open the input file. For example:'C:\\Downloads\\lines.txt' : ");
	  
	  String fileLocation = scanIn.nextLine();
	  File inputFile = new File(fileLocation);
	   
     PrintWriter outputFile = new PrintWriter("C:\\Users\\vacca\\OneDrive\\Desktop\\CS176\\CS176L\\outlines.txt");
     try {Scanner in = new Scanner(inputFile);
     }
     catch(FileNotFoundException e){
    	 System.out.println("File is not found, please try again");
     }
     Scanner in = new Scanner(inputFile);
     while (in.hasNext()) 
     {
     String what =in.next();
     outputFile.println(what);
     }
     in.close();
     scanIn.close();
     outputFile.close();
   }

}
//C:\Users\vacca\OneDrive\Desktop\CS176\CS176L\lines.txt  <-- correct path
