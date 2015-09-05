import java.util.Scanner;

public class question2 {
	public static void main (String[] args)
	{
		// Math.PI
		Scanner keyboard = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a radius");
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

