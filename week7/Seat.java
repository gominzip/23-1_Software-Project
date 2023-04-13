package problem5;

public class Seat {
	private String name;
	
	public void setName(String name) {
		// to do
		this.name=name;
	}
	
	public void show() {
		// to do
		if(this.name==null) {
			System.out.print("--- ");
		}
		else {
			System.out.printf("%s ",this.name);
		}
	}
	
	public boolean isMatched(String checkName) {
		// to do
		if(name == null) return false;
		else return name.equals(checkName);
	}
	
	public void cancel() {
		// to do
		this.name = null;
	}
	
}

