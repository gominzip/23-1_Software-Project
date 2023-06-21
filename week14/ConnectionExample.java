package problem10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		Connection conn = null;  // connection 객체를 만들고 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  // 찾아서 메모리에 로딩 
			conn = DriverManager.getConnection(  // 커넥션을 시도 
					"jdbc:oracle:thin:@localhost:1521/xe",
					"java",
					"oracle"
			);
			System.out.println("Connection success");
			
			String sql = """
					DELETE FROM boards WHERE writer=?
					""";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"winter");
			
			int rows = pstmt.executeUpdate();
			System.out.println("The number of inserted rows : "+rows);
			
			pstmt.close();
			
		} catch(ClassNotFoundException e) {  // 예외처리문
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} // catch (FileNotFoundException e) {
			
		//}
		finally {
			if(conn != null) {  // 연결이 됐으면 
				try {
					conn.close();
					System.out.println("Connection disconnected");
				} catch (SQLException e) {
					
				}
			}
		}
	}

}
