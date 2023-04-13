package problem5;

import java.util.Scanner;

public class Reservation {
	private SeatArray[] seatArrays;
	private char[] seatTypes = {'S', 'A', 'B'};
	private Scanner scanner = new Scanner(System.in);
	private int command;
	private int seatTypeChoice;
	private int seatNum;
	private String name;
	
	public Reservation() {
		// to do
		seatArrays = new SeatArray[3];
		
		for(int i=0; i<3; i++) {  // Seat 배열마다 객체
			seatArrays[i]=new SeatArray(seatTypes[i]);
			}
		
	}
	
	private void reserve() {
		// to do
		System.out.print("Seat Type S(1), A(2), B(3) >> ");
		seatTypeChoice = scanner.nextInt();
		seatTypeChoice--;
		seatArrays[seatTypeChoice].show();
		
		System.out.print("Name >> ");
		this.name = scanner.next();
		System.out.print("Seat Number >> ");
		this.seatNum = scanner.nextInt();
		this.seatNum--;
		
		seatArrays[seatTypeChoice].reserve(seatNum, name);
	}
	
	private void search() {
		// to do
		for(int i=0; i<3; i++) {
			seatArrays[i].show();
		}
		System.out.println("This is the end of the search\n");
	}
	
	private void cancel() {
		// to do
		System.out.print("Seat Type S(1), A(2), B(3) >> ");
		seatTypeChoice = scanner.nextInt();
		seatTypeChoice--;
		seatArrays[seatTypeChoice].show();
		
		System.out.print("Name >> ");
		name = scanner.next();
		
		seatArrays[seatTypeChoice].cancel(name);
	}
	
	private void quit() {
		// to do
		System.out.println("Thank you!");
	}
	
	public void run() {
		
		System.out.println("This is a reservation system for music concert.");
		
		while(true) {
			System.out.println();
			command = 0;
			System.out.print("Reserve:1, Search:2, Cancel:3, Quit:4 >> ");
			command = scanner.nextInt();	
			
			if(command==1) {
				reserve();
				}
			
			else if(command==2) {
				search();
				}
			
			else if(command==3) {
				cancel();
				}
			
			else if(command==4) {
				quit();
				break;
				}
			}
		}
		
}
