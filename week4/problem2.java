package problemSet2;

import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("5개의 string 입력 : ");
		str = sc.nextLine();
		sc.close();
		
		String[] arr = str.split(",");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"번째, ");
			if(arr[i].contains("java")) {
				System.out.print("true, ");
				arr[i]=arr[i].replace("java","python");
				System.out.println(arr[i]);
			}
			else {
				System.out.print("false, ");
				System.out.println(arr[i]);
			}
		}
		
	}
}
