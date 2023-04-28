package problemset6;

public class Point3D extends Point {
	private int z;
	
	Point3D(){
		super(0,0);
		z = 0;
	}
	
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	public void moveUp() { z++; }
	
	public void moveDown() { z--; }
	
	public void move(int x, int y) { 
		super.move(x, y);
		}
	
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
		}
	
	public String toString() {
		String str = "The point at (" + super.getX() + "," + super.getY() + "," + z + ")";
		return str;
	}
}
