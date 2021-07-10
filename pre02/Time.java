import java.io.*;
import java.util.*;

public class Time {
	public static void main(String[] args) {
		 int x;
		 int hr = 16;
		 int min = 55;
		 int sec = 15;
		 double hour = 14;
		 int minute = 56;
		 int second = 01;
		 int elapsed_time_hrs = 23;
		 String firstLine = "hrs";
		 int elapsed_time_mins = 0;
		 String secondLine= "mins";
		 int elapsed_time_secs = 15;
		 String thirdLine = "secs";
			System.out.print("The current time is: ");
			System.out.print(hour);
			System.out.print(":");
			System.out.print(minute);
			System.out.print("\nNumber of seconds since midnight: ");
			System.out.println(3600*hour+minute*60+second);
			System.out.print("Number of seconds remaining in the day: ");
			System.out.println(3600*hour+minute*60+second-86400);
			System.out.print("Percent of the day that has passed: ");
			System.out.println(hour * 100 / 24);
			System.out.print("Elapsed time since starting the exercise: ");
			System.out.print(elapsed_time_hrs);
			System.out.print(firstLine);
			System.out.print(" ");
			System.out.print(elapsed_time_mins);
			System.out.print(secondLine);
			System.out.print(" ");
			System.out.print(elapsed_time_secs);
			System.out.print(thirdLine);
	}

}	
