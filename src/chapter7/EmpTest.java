package chapter7;

import java.util.List;
import java.util.Scanner;

public class EmpTest {

	private static EmployeeDAO dao = new EmployeeDAO();
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		EmpTest main = new EmpTest();
		mainLoop: while (true) {
			System.out.println("1.사원목록조회\t2.사원조회\t3.사원등록\t4.사원수정\t5.사원삭제\t0.종료");
			System.out.print("메뉴를 선택하세요:");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				scanner.nextLine();
				main.selectEmployeeList();
				break;
			case 2:
				// 사원 조회
				scanner.nextLine();
				System.out.print("조회할 사원번호를 입력하세요: ");
				String userId = scanner.nextLine();
				main.selectEmployee(userId);
				break;
			case 3:
				// 사원 등록
				scanner.nextLine();
				System.out.println("등록하기");
				System.out.print("아이디: ");
				String insertId = scanner.next();
				System.out.print("이름: ");
				String insertName = scanner.next();
				System.out.print("이메일: ");
				String insertEmail = scanner.next();
				System.out.print("휴대전화번호: ");
				String insertHpNumber = scanner.next();
				main.insertEmployee(new EmployeeDTO(insertId, insertName, insertEmail, insertHpNumber));
				break;
				
			case 4:
			// 사원 수정
				scanner.nextLine();
				System.out.println("수정하기");
				System.out.print("수정할 아이디: ");
				String updateId = scanner.nextLine();
				System.out.print("수정할 이름: ");
				String updateName = scanner.nextLine();
				System.out.print("수정할 이메일: ");
				String updateEmail = scanner.nextLine();
				System.out.print("수정할 휴대전화번호: ");
				String updateHpNumber = scanner.nextLine();
				main.updateEmployee(new EmployeeDTO(updateId, updateName, updateEmail, updateHpNumber));
				break;
			case 5:
				// 사원 퇴사
				scanner.nextLine();
				System.out.println("삭제하기");
				System.out.print("삭제할 아이디: ");
				String deleteId = scanner.nextLine();
				main.deleteEmployee(deleteId);
				break;
			case 0:
				// 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break mainLoop;
			}
		}
		scanner.close();
	}

	private void selectEmployeeList() throws Exception {
		List<EmployeeDTO> list = dao.selectEmployeeList();
		for (EmployeeDTO vo : list) {
			System.out.print(vo.getId() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getEmail() + "\t");
			System.out.print(vo.getHpNumber() + "\n");
		}
	}
	private void selectEmployee(String userId) throws Exception {
		EmployeeDTO vo = dao.selectEmployee(userId);
		System.out.print(vo.getId() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getEmail() + "\t");
		System.out.print(vo.getHpNumber() + "\n");
	}

	private void updateEmployee(EmployeeDTO dto) throws Exception {
		dao.updateEmployee(dto);
	}

	private void insertEmployee(EmployeeDTO dto) throws Exception {
		dao.insertEmployee(dto);
	}
	
	private void deleteEmployee(String id) throws Exception {
		dao.deleteEmployee(id);
	}

}