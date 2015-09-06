import java.util.Scanner;

public class question5 {
	public static void main (String[] args)
	{
		String userValue = null;
		int[] pointA;
		int[] pointB;
		int[] pointC;
		
		question5 question = new question5();
		
		System.out.println("Point A - X,Y Coord");
		Scanner point = new Scanner(System.in);
		pointA = question.parse(point.nextLine());
		
		System.out.println("Point B - X,Y Coord");
		//Scanner pointB = new Scanner(System.in);
		pointB = question.parse(point.nextLine());
		
		System.out.println("Point C - X,Y Coord");
		//Scanner pointC = new Scanner(System.in);
		pointC = question.parse(point.nextLine());
		
		
		double distanceAB = question.length(pointA,pointB);
		double distanceBC = question.length(pointB,pointC);
		double distanceCA = question.length(pointC,pointA);		
		
		System.out.println("Distance of A to B=" + distanceAB);
		System.out.println("Distance of B to C=" + distanceBC); 
		System.out.println("Distance of C to A=" + distanceCA); 		
		
		if(distanceAB + distanceBC > distanceCA)
			System.out.println("This a valid triangle");
		else
			System.out.println("This can not be a valid triangle. Sum of the first and second ");
			System.out.println("is not greated than the third side");
		
		System.out.println("Done");
	}
	public double length (int[] pointA,int[] pointB)
	{
		double distance=0;
		
		distance= Math.sqrt(squared(pointB[0],pointA[0]) + squared(pointB[1],pointA[1]));
		
		return distance;
	}
	public int squared (int pointB, int pointA)
	{
		int value = 0;
		value = (pointB - pointA) *(pointB - pointA); 
		return value;
	}
	public int[] parse(String value)
	{
		String[] pointArray = value.split(",");
		int[] point = new int[2];		
		try
		{
			point[0] = Integer.parseInt(pointArray[0].toString());
			point[1] = Integer.parseInt(pointArray[1].toString());			
		}
		catch (Exception ex)
		{
			System.out.println("Invalid points supplied defaulting to 1 for both X and Y");
			point[0] = 1;
			point[1] = 1;			
		}
				
		System.out.println("PointX=" + point[0] + " ,PointY=" + point[1]);
		return point;
	
	}
}

