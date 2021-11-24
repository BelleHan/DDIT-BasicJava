package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	public List<EmployeeDTO> selectEmployeeList() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //JDBC 드라이버 로딩
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "HHS96", "java"); // 데이터베이스 접속
		Statement statement = connection.createStatement(); //SQL명령 수행하는 statement 객체 생성
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT *");
		builder.append("  FROM EMPLOYEE");
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		ResultSet resultSet = statement.executeQuery(builder.toString()); // execteQuery(db에 명령)로 명령하면 ResultSet(명령에 대한 반환값)이라는 객체를 돌려줌
																		  // ResultSet : SELECT의 결과를 저장하는 객체
		while (resultSet.next()) { //resultSet.next - 커서의 다음 행이 존재할 경우 true를 리턴
			String id = resultSet.getString("ID");
			String name = resultSet.getString("NAME");
			String email = resultSet.getString("EMAIL");
			String hpNumber = resultSet.getString("HP_NUMBER");
			list.add(new EmployeeDTO(id, name, email, hpNumber));
		}
		resultSet.close();
		statement.close();
		connection.close();
		
		return list;
	}

			
	public EmployeeDTO selectEmployee(String userId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "HHS96", "java");
		String sql = "select * from employee where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, userId);	
		ResultSet resultSet = statement.executeQuery();
		EmployeeDTO vo = null;
		if (resultSet.next()) {
			String id = resultSet.getString("ID");
			String name = resultSet.getString("NAME");
			String email = resultSet.getString("EMAIL");
			String hpNumber = resultSet.getString("HP_NUMBER");
			vo = new EmployeeDTO(id, name, email, hpNumber);
		}
		resultSet.close();
		statement.close();
		connection.close();
		
		return vo;
	}
	
	public void insertEmployee(EmployeeDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "HHS96", "java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append(" INSERT INTO EMPLOYEE ");
		builder.append(" (ID, NAME, EMAIL, HP_NUMBER)");
		builder.append(" VALUES ");
		builder.append(" ('" + dto.getId() + "', '" + dto.getName() + "', '" + dto.getEmail() + "', '" + dto.getHpNumber() + "')");
		// executeQuery: select
		// executeUpdate: insert, update, delete
		int result = statement.executeUpdate(builder.toString());
		if (result > 0) {
			System.out.println("등록 완료!");
		} else {
			System.out.println("등록 실패!");
		}
		statement.close();
		connection.close();
		
	}
	public void updateEmployee(EmployeeDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "HHS96", "java");
		String sql = "update employee set name = ?, email = ?, hp_number = ? where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, dto.getName()); // setString()은 알아서 작은따옴표('')를 붙여준다.
		statement.setString(2, dto.getEmail()); // setInt()는 작은따옴표가 붙지 않는다.
		statement.setString(3, dto.getHpNumber());
		statement.setString(4, dto.getId());
		//statement 실행
		int result = statement.executeUpdate();
		if (result > 0 ) {
			System.out.println("변경 성공!");
		} else {
			System.out.println("변경 실패!");
		}
		statement.close();
		connection.close();
	}
	public void deleteEmployee(String id) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "HHS96", "java");
		String sql = "delete from employee where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, id);
		//statement 실행
		int result = statement.executeUpdate();
		if (result > 0 ) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패 원인 : 삭제할 아이디가 없습니다.");
		}
		statement.close();
		connection.close();
		
	}
}
