package problemSet2;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int[] arr;
		double mean=0, variance=0, temp=0;
		int total=0;
		
		// 정수 입력 받기 
		arr = new int[10];
		System.out.print("정수 10개 입력 \n");
		
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		// 평균 구하기 
		for(int i=0;i<10;i++) {
			total += arr[i];
		}
		
		mean = (double)total/10;
		
		// 분산 구하기 
		for(int i=0;i<10;i++) {
			temp +=Math.pow((arr[i]-mean),2);
		}
		variance= temp / 10;
		
		System.out.printf("평균 : %.2f \n", mean);
		System.out.printf("분산 : %.2f", variance);

	}

}
