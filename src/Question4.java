import java.util.Scanner;

public class Question4 {
	public static void main (String[] args)
	{
	    Scanner fileContents = new Scanner( System.in );
	    String readLine;

		System.out.println("The purpose of this application is to read a file and display the output on the screen");
		System.out.println("via file redirection");
		System.out.println("to run the application use the following syntax");
		System.out.println("java Question4 < {file}");
	    do{
	    	readLine = fileContents.nextLine();
		    System.out.println( readLine );
	    }while (fileContents.hasNextLine());


	    fileContents.close();
	}
}

