package 배열_수강관리프로그램;

import java.util.Scanner;

public class B_StudentManager implements B_Program {

	// 멤버변수 student class, stuCount변수
	private B_Student[] stu = new B_Student[5];
	private int stuCount; // 등록한 학생 카운트

	@Override
	public void printStudent() { // 학생 전부 출력
		System.out.println("\n▼ 전체 학생 정보 ▼\n");
		for (int i = 0; i < stuCount; i++) { // stu.length 까지가면 안됨
			stu[i].stdPrint(); // 학생 정보만 출력
//			printStuOne(stu[i]); // 학생정보 + 수강정보 출력
			System.out.println("----------------------\n");
		}

	}

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 학생정보 값을 입력받아 객체를 생성한 후 등록

		System.out.println("◈ 학생등록 페이지 ◈");
		System.out.print("학번 입력 : ");
		String num = scan.next();

		System.out.print("이름 입력 : ");
		String name = scan.next();

		System.out.print("생년월일 입력 : ");
		String birth = scan.next();

		System.out.print("학부 입력 : ");
		String faculty = scan.next();

		System.out.print("학과 입력 : ");
		String major = scan.next();
		System.out.println("----------------------------------");

		// 배열이 다 찼다면 더 큰 배열을 생성 후 배열복사
		if (stuCount == stu.length) {
			B_Student[] tmp = new B_Student[stu.length + 5]; // 새 배열
			System.arraycopy(stu, 0, tmp, 0, stu.length);
			stu = tmp;
		}

		// 입력받은 값으로 객체를 생성
		B_Student s = new B_Student(num, name, birth, faculty, major);

		// stu 배열에 등록
		stu[stuCount] = s;
		stuCount++; // 인원증가 (배열 번지 증가)

	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 학생이름을 입력받아 배열에서 탐색 후 있다면 학생정보, 수강정보 출력
		// 학생정보, 수강정보 - > printStuOne() 호출
		System.out.println("◈ 학생 검색 페이지 ◈");
		while (true) {
			System.out.print("검색하실 학생 이름을 입력해주세요. : ");
			String name = scan.next();

			int index = -1;

			for (int i = 0; i < stuCount; i++) {
				if (stu[i].getStdname().equals(name)) {
					printStuOne(stu[i]);
					index = i;
					return;
				}
			}

			if (index == -1) {
				System.out.println("미등록 학생입니다.\n");
			}
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("◈ 수강신청 페이지 ◈");
		//수강신청을 하고자하는 학생 체크
		System.out.print("학번 입력 : ");
		String num = scan.next();
		int index = -1;
		
		
		for(int i=0; i<stuCount; i++) {
			if(stu[i].getStdNum().equals(num)) {
				index = i;
			}
		}
		
		//학번이 없다면
		if(index == -1) {
			System.out.println("해당 학생이 없습니다.\n");
			return;
		}
		
		//신청할 과목의 객체 생성 (과목정보 입력받기)
		
		System.out.print("과목명 입력 : ");
		String name = scan.next();
		System.out.print("교수명 입력 : ");
		String proname = scan.next(); 
		System.out.print("분류 입력(전공 / 교양) : ");
		String categori = scan.next();
		
		B_Subject sub = new B_Subject(name, proname, categori);
		
		// 신청메서드 호출 insertSubject(객체)
		stu[index].insertSubject(sub);
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("◈ 수강철회 페이지 ◈");
		System.out.print("학번 입력 : ");
		String num = scan.next();
		int index = -1;
		
		//수강철회를 하고자하는 학생 체크
		for(int i=0; i<stuCount; i++) {
			if(stu[i].getStdNum().equals(num)) {
				index = i;
			}
		}
		
		if(index == -1){
			System.out.println("미등록 학생입니다.");
			return;
		}
		
		//학생이 있으면 수강철회 고
		System.out.print("과목 입력 : ");
		String name = scan.next();
		
		stu[index].deleteSubject(name);
		

	}

	// 1명의 학생정보 + 수강정보를 같이 출력하고 싶을때
	public void printStuOne(B_Student s) {
		System.out.println("\n   ▼ 학생정보 ▼   \n");
		s.stdPrint();
		System.out.println();
		System.out.println("   ▼ 수강정보 ▼   \n");
		s.subPrint();
	}

}
