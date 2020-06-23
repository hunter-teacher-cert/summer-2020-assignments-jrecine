import java.io.*;
import java.util.*;

public class Triangle {
	public static void main(String [] args) {

	System.out.println(isTriangle(12,1,1));

        }
	
	public static boolean isTriangle(int length1, int length2, int length3) {	
		// return false if any side length is greater than the sum of other two sides
		if (length1 > (length2 + length3)) {
			return false;
		} else if (length2 > (length1 + length3)) {
			return false;
		} else if (length3 > (length1 + length2)) {
			return false;
		} else {
			return true;
		}
	}
}

