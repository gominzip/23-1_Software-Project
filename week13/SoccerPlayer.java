package problemset9;

public class SoccerPlayer implements Player {
	private String name;
	private double speed = 0.0;
	private double kickSpeed = 0.0;
	private String[] tools;
	
	public SoccerPlayer(String name, double kickSpeed){
		this.name = name;
		this.kickSpeed = kickSpeed;
	}
	
	@Override
	public void setSpeed(double speed) {
		this.speed = speed;
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
		if(speed == 0.0) System.out.println("speed : No information");
		else System.out.printf("speed : %.1f\n",speed);
		if(kickSpeed == 0.0) System.out.println("kickSpeed : No information");
		else System.out.printf("kickSpeed : %.1f\n",kickSpeed);
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
