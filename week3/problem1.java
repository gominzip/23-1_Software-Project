package problem1.lecture02;

import java.util.Scanner;

public class problem1 {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	     
	      int cx, cy; // 원의 중심
	      double r, distance; //원의 반지름
	      int x,y; // 점 좌표 
	      
	      
	      System.out.print("circle \n");
	      cx = sc.nextInt();
	      cy = sc.nextInt();
	      r = sc.nextDouble();
	      System.out.print("point \n");
	      x = sc.nextInt();
	      y = sc.nextInt();
	      
	      distance = Math.sqrt(((x-cx)*(x-cx))+((y-cy)*(y-cy)));
	      if(distance<r) {
	         System.out.print("This is in circle");
	      }
	      else {
	         System.out.print("This isn't in circle");
	      }
	      
	      sc.close();
	   }
	}

