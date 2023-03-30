package problem_set;

import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 입력 : ");
		int num = sc.nextInt();

		for(int i=0; i<=num-1; i++) {
			for(int j=num; j>=0; j--) {  // 왼쪽 
				if(i>=j)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			
			for(int j=1; j<=num-1; j++) {  // 오른쪽 
				if(i>=j)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
