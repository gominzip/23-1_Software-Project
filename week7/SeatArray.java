package problem5;

public class SeatArray {
	private char seatType;
	private Seat[] seats;
	private static int seatLength = 16;
	
	public SeatArray(char seatType) {
		// to do
		this.seatType = seatType;
		seats = new Seat[seatLength];
		for(int i=0; i<seatLength; i++) {  // Seat 배열마다 객체
			seats[i]=new Seat();
			}
	}
	
	public void reserve(int seatNumber, String name) {
		// to do
		seats[seatNumber].setName(name);
	}
	
	public void show() {
		// to do
		System.out.printf("%c >> ",seatType);
		for(int i=0; i<seatLength; i++) { 
			seats[i].show();
			}
		System.out.println();
	}
	
	public void cancel(String name) {
		// to do
		
		for(int i=0; i<seatLength; i++) {
			if(seats[i].isMatched(name)) {
				seats[i].cancel();
				break;
			}
		}
	}
}