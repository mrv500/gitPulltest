package gitPulltest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class todaysDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=  Calendar.getInstance();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String date= sdf.format(cal.getTime());
		System.out.println(" date -"+date);
		String s = "03/09/2024 6:48 pm";
		
		if(s.contains(date))
		{
			System.out.println(" date -"+date);
		}
		
	}

}
