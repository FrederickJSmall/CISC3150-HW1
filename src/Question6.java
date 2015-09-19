import java.util.Scanner;

public class Question6 {
	public static void main (String[] args)
	{
		//String userValue = null;
		int[] circle1;
		int[] circle2;
		//int[] pointC;
		int radius1=0;
		int radius2=0;
		
		Question5 question = new Question5();
		System.out.println("The purpose of this application is to see if the selected points create a valid triangle");
		System.out.println("");
		System.out.print("Please select a point and radius in the form of x,y,r\n");
		System.out.print("Circle 1 - X,Y,R Coord-> ");
		@SuppressWarnings("resource")
		Scanner point = new Scanner(System.in);
		circle1 = question.parse(point.nextLine());
		
		System.out.print("Please select a point and radius in the form of x,y,r\n");
		System.out.print("Circle 2 - X,Y,R Coord-> ");
		//Scanner pointB = new Scanner(System.in);
		circle2 = question.parse(point.nextLine());
		
		//System.out.print("Please select a point in the form of x,y\n");
		//System.out.print("Point C - X,Y Coord-> ");
		//Scanner pointC = new Scanner(System.in);
		//pointC = question.parse(point.nextLine());
		
		
		//double distanceAB = question.length(circle1,circle2);
		//double distanceBC = question.length(circle2,pointC);
		//double distanceCA = question.length(pointC,circle1);		
		
		//System.out.format("Distance of A to B=%.3f%n" , distanceAB);
		//System.out.format("Distance of B to C=%.3f%n" , distanceBC); 
		//System.out.format("Distance of C to A=%.3f%n" , distanceCA); 		
		
		//if(distanceAB + distanceBC > distanceCA)
		//{
		//	System.out.println("");
		//	System.out.println("This a valid triangle");
		//}
		//else
		//{
		//	System.out.println("This can not be a valid triangle. Sum of the first and second ");
		//	System.out.println("is not greated than the third side");
		//}
		System.out.println("");
		System.out.println("Done");
	}
	public int circleTest (int[] circle1,int[] circle2)
	{
			double circleInteraction = Math.sqrt((circle1[0]-circle2[0])^2 + (circle1[1]-circle2[1])^2);  
			//Circles touch each other
			if (circle1[2]+circle2[2] == circleInteraction)//Math.sqrt((circle1[0]-circle2[0])^2 + (circle1[1]-circle2[1])^2))
				return 0;
			//Circles Overlap
			if (circle1[2]+circle2[2] > circleInteraction)//Math.sqrt((circle1[0]-circle2[0])^2 + (circle1[1]-circle2[1])^2))
				return 1;
			//Circles do not intersect
			if (circle1[2]+circle2[2] < circleInteraction)//Math.sqrt((circle1[0]-circle2[0])^2 + (circle1[1]-circle2[1])^2))
				return 2;
				
			return -1;
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
		int[] point = new int[3];		
		try
		{
			point[0] = Integer.parseInt(pointArray[0].toString());
			point[1] = Integer.parseInt(pointArray[1].toString());			
			point[2] = Integer.parseInt(pointArray[1].toString());			
		}
		catch (Exception ex)
		{
			System.out.println("Invalid points supplied defaulting to 1 for both X and Y");
			point[0] = 1;
			point[1] = 1;
			point[2] = 1;
		}
				
		System.out.println("PointX=" + point[0] + " ,PointY=" + point[1] + " ,Radius=" + point[1]);
		System.out.println("");
		return point;
	
	}
}


