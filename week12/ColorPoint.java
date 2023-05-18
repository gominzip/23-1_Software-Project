package problemset6;

public class ColorPoint extends Point {
	private int x, y;
	private String color;
	
	ColorPoint(){
		super(0,0);
		color = "zero";
	}
	
	ColorPoint(int x, int y){
		super(x,y);
		color = "black";
	}
	
	ColorPoint(int x, int y, String color){
		super(x,y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		super.move(x,y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String str = "The "+ color + " point at (" + super.getX() + "," + super.getY() + ")";
		return str;
	}
}
