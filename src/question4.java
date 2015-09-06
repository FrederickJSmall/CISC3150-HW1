import java.util.Scanner;

public class question4 {
	public static void main (String[] args)
	{
	    Scanner fileContents = new Scanner( System.in );
	    String readLine;

	    do{
	    	readLine = fileContents.nextLine();
		    System.out.println( readLine );
	    }while (fileContents.hasNextLine());


	    fileContents.close();
	}
}

