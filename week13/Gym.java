package problemset9;

import java.util.Scanner;

public class Gym {
	private SoccerPlayer[] sc;
	private BasketBallPlayer[] bsk;
	private Scanner scanner = new Scanner(System.in);
	private static int playerLength = 16;
	
	Gym() {
		sc = new SoccerPlayer[playerLength];
		bsk = new BasketBallPlayer[playerLength];
	}
	
	private void reserve() {
		System.out.print("Player Type (Soccer: 1, BasketBall: 2) >> ");
		int PlayerTypeChoice = scanner.nextInt();
		System.out.print("Room number (1~16) >> ");
		int RoomNumber = scanner.nextInt();
		
		if(PlayerTypeChoice == 1) {
			if(sc[RoomNumber-1] == null) {
				System.out.print("Name >> ");
	            String name = scanner.next();
	            System.out.print("Speed >> ");
	            double speed = scanner.nextDouble();
	            System.out.print("kickSpeed >> ");
	            double kickSpeed = scanner.nextDouble();
	            System.out.print("Number of tools >> ");
	            int numberOfTools = scanner.nextInt();
	            String[] tools = new String[numberOfTools];
	            for (int i = 0; i < numberOfTools; i++) {
	                System.out.print("Tool " + (i + 1) + " >> ");
	                tools[i] = scanner.next();
	            }
	            sc[RoomNumber - 1] = new SoccerPlayer(name, kickSpeed);
	            sc[RoomNumber - 1].setSpeed(speed);
	            sc[RoomNumber - 1].setTools(tools);
			} else {
		        System.out.println("This room is already reserved for a SoccerPlayer.");
		    }
		}
		
		if(PlayerTypeChoice == 2) {
			if(bsk[RoomNumber-1] == null) {
				System.out.print("Name >> ");
	            String name = scanner.next();
	            System.out.print("Jump >> ");
	            double jump = scanner.nextDouble();
	            System.out.print("Number of tools >> ");
	            int numberOfTools = scanner.nextInt();
	            String[] tools = new String[numberOfTools];
	            for (int i = 0; i < numberOfTools; i++) {
	                System.out.print("Tool " + (i + 1) + " >> ");
	                tools[i] = scanner.next();
	            }
	            bsk[RoomNumber - 1] = new BasketBallPlayer(name);
	            bsk[RoomNumber - 1].setSpeed(jump);
	            bsk[RoomNumber - 1].setTools(tools);
			} else {
		        System.out.println("This room is already reserved for a BasketBallPlayer.");
		    }
		}
	}
	
	private void search() {
		System.out.print("Player Type (Soccer: 1, BasketBall: 2) >> ");
		int PlayerTypeChoice = scanner.nextInt();
		System.out.print("Room number (1~16) >> ");
		int RoomNumber = scanner.nextInt();
		
		if(PlayerTypeChoice == 1) {
			if(sc[RoomNumber-1] == null) {
				System.out.println("No reservation");
			} else {
				sc[RoomNumber-1].showDetails();
		    }
		}
		
		if(PlayerTypeChoice == 2) {
			if(bsk[RoomNumber-1] == null) {
				System.out.println("No reservation");
			} else {
				bsk[RoomNumber-1].showDetails();
		    }
		}
	}
	
	private void cancel() {
		System.out.print("Name >> ");
		String name = scanner.next();
		
		for (int i = 0; i < sc.length; i++) {
	        if (sc[i] != null && sc[i].getName().equals(name)) {
	            sc[i] = null;
	            System.out.println("Reservation for " + name + " has been canceled.");
	            return;
	        }
	    }

	    for (int i = 0; i < bsk.length; i++) {
	        if (bsk[i] != null && bsk[i].getName().equals(name)) {
	            bsk[i] = null;
	            System.out.println("Reservation for " + name + " has been canceled.");
	            return;
	        }
	    }

	    System.out.println("No reservation found for " + name);
	}
	
	private void quit() {
		System.out.println("Thank you!");
	}
	
	public void run() {
		System.out.println("This is a reservation system for gym.");
		System.out.println();
		int state;
		while(true) {
			System.out.print("Reserve: 1, Search: 2, Cancel: 3, Quit: 4 >> ");
			state = scanner.nextInt();
			switch(state) {
			case 1:
				reserve();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				quit();
				return;
			default:
				System.out.println("This is wrong command");
			}
			System.out.println();
		}
	}
}
