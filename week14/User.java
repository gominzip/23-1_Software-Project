package problem10;

import lombok.Data;

@Data  // 알아서 method가 생긴다 
public class User {
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;
}
