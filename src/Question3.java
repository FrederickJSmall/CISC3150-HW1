import java.util.Random;

public class Question3 {
	public static void main (String[] args)
	{
		Random randomMonth = new Random();
		int month = randomMonth.nextInt(12) + 1;

		System.out.println("Randomly picking a month out of the year; and the winner is");
        String monthInYear;
        switch (month) {
            case 1:  monthInYear = "January";
                     break;
            case 2:  monthInYear = "February";
                     break;
            case 3:  monthInYear = "March";
                     break;
            case 4:  monthInYear = "April";
                     break;
            case 5:  monthInYear = "May";
                     break;
            case 6:  monthInYear = "June";
                     break;
            case 7:  monthInYear = "July";
                     break;
            case 8:  monthInYear = "August";
                     break;
            case 9:  monthInYear = "September";
                     break;
            case 10: monthInYear = "October";
                     break;
            case 11: monthInYear = "November";
                     break;
            case 12: monthInYear = "December";
                     break;
            default: monthInYear = "Invalid month";
                     break;
        }
        System.out.println(monthInYear);
    }

}


