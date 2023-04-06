package problem2;

import java.util.Scanner;

public class MonthSchedule {
	
	Scanner sc = new Scanner(System.in);
	int command;
	int date;
	Day[]day;
	String work;
	
	public MonthSchedule(int num) {
		day = new Day[num];  // 객체 배열 선언 및 생
		
		for(int i=0; i<day.length; i++) {  // Day 객체 생성 
		day[i]=new Day();
		}
	}
	
	public void run() {
		while(true){
			command=0;
			System.out.print("Command(Insert: 1, Show:2, Quit: 3) >> ");
			command = sc.nextInt();
			
			if (command==1) {
				System.out.print("Date(1-30)? ");
				date = sc.nextInt();
				
				System.out.print("Do list (without space)? ");
				work = sc.next();
				this.day[date-1].set(work);
				System.out.println();
				continue;
			}
			
			if (command==2) {
				System.out.print("Date(1-30)? ");
				date = sc.nextInt();
				if(this.day[date-1].work==null)this.day[date-1].show();
				else {
					this.day[date-1].show();
					System.out.printf(" on the %dth \n",date);
					System.out.println();
					continue;
				}
			}
			
			if(command==3) {
				finish();
				break;
			}
		};
	}
	
	public void finish() {
		System.out.print("This is the end of the program.");
	}
	
}
