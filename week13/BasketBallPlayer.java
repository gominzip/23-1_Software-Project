package problemset9;

public class BasketBallPlayer implements Player{
	private String name;
	private double jump = 0.0;
	private String[] tools;
	
	public BasketBallPlayer (String name){
		this.name = name;
	}
	
	@Override
	public void setSpeed(double jump) {
		this.jump = jump;
	}
	
	public void setTools() {
		this.tools = null;
	}
	
	public void setTools(String[] tools) {
		this.tools = tools;
	}
	
	public String getName() {
		return name;
	}
	
	public void showDetails() {
		System.out.println("<Detail>");
		System.out.println("name : "+ name);
		if(jump == 0.0) System.out.println("jump : No information");
		else System.out.printf("jump : %.1f\n",jump);
		if(tools == null) System.out.println("tools : No information");
		else {
			System.out.print("Tools: ");
	        for (int i = 0; i < tools.length; i++) {
	            System.out.print(tools[i]);
	            if (i != tools.length - 1)
	                System.out.print(", ");
	        }
	        System.out.println();
		}
	}
}
