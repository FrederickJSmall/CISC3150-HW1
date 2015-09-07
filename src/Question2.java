import java.util.Scanner;

public class Question2 {
	public static void main (String[] args)
	{
		// Math.PI
		Scanner keyboard = new Scanner(System.in);
		while(true)
		{
			System.out.println("The purpose of this application is to read a radius from a user");
			System.out.println("and then display the area of the circle");
			System.out.println("\nEnter a radius");
			int radius = keyboard.next().charAt(0);
			char keyChar = (char) radius;
			if (keyChar==4)
			{
				keyboard.close();
				break;
			}
			if ((keyChar >=48) && (keyChar <=57))
			{
				System.out.println("Radius=" + Character.toString ((char) radius));
				System.out.println("Area  =" + Math.PI * (Math.pow(radius,2)));
				System.out.println("------------------------------");				
			}
			else
				System.out.println("Please type a proper number");
		}
		System.out.println("We are done");
	}
}

