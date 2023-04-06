package problem1;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	int area;
	
	public Rectangle() {};
	
	public Rectangle(int x,int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.area=this.width * this.height;
	}
	
	public void show() {
		System.out.printf("A rectangle with %dx%d at (%d,%d)\n", this.width,this.height,this.x,this.y);
	}
	
	public int square() {
		return this.area;
	}
	
	public boolean contains(Rectangle a) {
		int s1_x_end = this.x+this.width;
		int s1_y_end = this.y+this.height;
		int s2_x_end = a.x+a.width;
		int s2_y_end = a.y+a.height;
		
		if((this.area<a.area)||(this.x>a.x)||(this.y>a.y)) return false;
		else {
			if((s1_x_end<s2_x_end)||(s1_y_end<s2_y_end)) return false;
			else return true;
		}
	}
}
