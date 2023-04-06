package problem2;

public class Day {
	String work;
	
	void set(String work) {this.work=work;}
	
	String get() {return work;}
	
	void show() {
		if(work==null)System.out.println("Nothing.");
		else System.out.print("There is [" +work+ "]");
	}
	
}
