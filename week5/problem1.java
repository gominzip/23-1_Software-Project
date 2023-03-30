package problem_set;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[]name = new String[5];  // 이름 배
		double[][]score = new double[7][5];  // 성적, 합계, 평균
		
		for(int i=0; i<5; i++) {
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			System.out.print("국어, 영어, 수학 점수 차례로 입력 : ");
			for(int j=0; j<3;j++) {
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j];  // 3행에 합계
			}
			score[i][4] = score[i][3]/3;  // 평
		}
		
		for(int i=0; i<3; i++) {  // 과목별 합계, 평균구하기 
			for(int j=0; j<5; j++) {
				score[5][i] += score[j][i] ;
			}
			score[6][i]=score[5][i]/5;
		}
		
		System.out.println("Name | Korean | English | Math | Sum | Mean");
		for(int p=0; p<5; p++) {
			System.out.printf("%s  %.0f  %.0f  %.0f  %.0f  %f \n", name[p], score[p][0],score[p][1],score[p][2],score[p][3],score[p][4]);
		}
		System.out.printf("Sum  %.0f  %.0f  %.0f \n", score[5][0], score[5][1], score[5][2]);
		System.out.printf("Mean  %.3f  %.3f  %.3f \n", score[6][0], score[6][1], score[6][2]);
	}
}