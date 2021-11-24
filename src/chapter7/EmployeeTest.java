package chapter7;

import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		Scanner scanner = new Scanner(System.in);
		
		List<EmployeeDTO> list = dao.selectEmployeeList();
		for (EmployeeDTO vo : list) {
			System.out.print(vo.getId() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getEmail() + "\t");
			System.out.print(vo.getHpNumber() + "\n");
		}
		
		
		 //사원 조회
//		System.out.print("조회할 아이디를 입력하세요: ");
//		String userId = scanner.nextLine();
//		System.out.println(dao.selectEmployee(userId));
//		EmployeeDAO vo = vo.selectEmployee(userId);
//		System.out.print(vo.getId() + "\t");
//		System.out.print(vo.getName() + "\t");
//		System.out.print(vo.getEmail() + "\t");
//		System.out.print(vo.getHpNumber() + "\n");
//		scanner.close();
		
		/// 사원 등록
		System.out.println("등록하기");
		System.out.print("아이디: ");
		String id = scanner.next();
		System.out.print("이름: ");
		String name = scanner.next();
		System.out.print("이메일: ");
		String email = scanner.next();
		System.out.print("휴대전화번호: ");
		String hpNumber = scanner.next();
		dao.insertEmployee(new EmployeeDTO(id, name, email, hpNumber));

		
		// 사원 수정
//		System.out.println("수정하기");
//		System.out.print("수정할 아이디: ");
//		String id = scanner.nextLine();
//		System.out.print("수정할 이름: ");
//		String name = scanner.nextLine();
//		System.out.print("수정할 이메일: ");
//		String email = scanner.nextLine();
//		System.out.print("수정할 휴대전화번호: ");
//		String hpNumber = scanner.nextLine();
//		dao.updateEmployee(new EmployeeDTO(id, name, email, hpNumber));
		
		// 사원 퇴사
//		System.out.println("삭제하기");
//		System.out.print("삭제할 아이디: ");
//		String id = scanner.nextLine();
//		dao.deleteEmployee(id);
//		scanner.close();
	}		

	
}
