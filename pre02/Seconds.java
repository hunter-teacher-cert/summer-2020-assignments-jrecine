import java.util.Scanner;

public class Seconds {
public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many seconds: ");
		int seconds = in.nextInt();
		int hrs = seconds % 60;
		int mins = seconds / 60;
		int secs = mins % 60;
		mins = mins / 60;
		System.out.print( mins + " hour(s): " + secs + " minute(s): " + hrs + " seconds");
		System.out.print("\n");
	}
}