import java.io.*;
import java.util.*;

public class Ack{
	
 public static int Ack(int m, int n) 
    { 
        if (m == 0) 
        { 
            return n + 1; 
        } 
        else if((m > 0) && (n == 0)) 
        { 
            return Ack(m - 1, 1); 
        } 
        else if((m > 0) && (n > 0)) 
        { 
            return Ack(m - 1, Ack(m, n - 1)); 
        }else
        return n + 1; 
    } 
  
    // Main code 
   public static void main(String args[])  
    {  
        System.out.println(Ack(1, 2));  
    }  
}  