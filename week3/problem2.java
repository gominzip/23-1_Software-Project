package problem2.lecture02;

import java.util.Scanner;

public class problem2 {
	
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int money, a,b,c,d,e,f,g;
      
      System.out.print("금액 : ");
      money = sc.nextInt();
      
      a = money / 50000;
      money = money - (a * 50000);  // 5만원
      
      b = money / 10000;
      money = money - (b * 10000);  // 1만원
      
      c = money / 1000;
      money = money - (c * 1000);  // 1천
      
      d = money / 500;
      money = money - (d * 500);  //500원
      
      e = money / 100;
      money = money - (e * 100);  //100원
      
      f = money / 10;
      money = money - (f * 10);  //10원
      
      g = money; // 1원
      
      System.out.print("50000 : "+a+"\n");
      System.out.print("10000 : "+b+"\n");
      System.out.print("1000 : "+c+"\n");
      System.out.print("500 : "+d+"\n");
      System.out.print("100 : "+e+"\n");
      System.out.print("10 : "+f+"\n");
      System.out.print("1 : "+g+"\n");
      
      sc.close();
   }
   
}
