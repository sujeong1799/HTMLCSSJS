package 리스트_수강관리프로그램;

import java.util.Scanner;

public class A_ProgramMain {

	public static void main(String[] args) {
		
		A_StudentManager sm = new A_StudentManager();
		Scanner scan = new Scanner(System.in);

		int menu = 0;

		while (menu != 6) {

			System.out.println("1. 학생등록 | 2. 학생확인 | 3. 학생검색");
			System.out.println("4. 수강신청 | 5. 수강철회 | 6. 종료");
			System.out.print("입력 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				sm.insertStudent(scan);
				break;
			case 2:
				sm.printStudent();
				break;
			case 3:
				sm.searchStudent(scan);
				break;
			case 4:
				sm.registerSubject(scan);
				break;
			case 5:
				sm.deleteSubject(scan);
				break;
			case 6:
				System.out.println("프로그램 종료.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
				
			}
		
		}

	}

}
