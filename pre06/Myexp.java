import java.io.*;
import java.util.*;

public class Myexp {  
	
	public static double myexp(double x, int n) {
		double result = 1.0; 
		double term  = 1.0;
		int i = 1;
		while (i <= n) { 
			term = term*x/i; 
			result = result + term;
			i = i+1;
		}
		
		return result; 
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	public static void check(double x) {
		System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x, 17)); 
	}
	
	public static void main(String[] args) {
		double x = 0.1;
		while (x <= 100.0) {
			check(x); 
			x = x*10; 
		}
		
		x = -0.1;
		while (x >= -100.0) {
			check(x); 
			x = x*10; 
		}		
	}
}