package problem3.lecture02;

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int a, b, c;
		      
	      System.out.print("length? \n");
	      a = sc.nextInt();
	      b = sc.nextInt();
	      c = sc.nextInt();
	      
	      if((a + b < c) || (b + c < a ) || (a + c < b)) {
	    	  System.out.print("No triangle");
	      }
	      else {
	         System.out.print("triangle");
	      }
	   }
}
