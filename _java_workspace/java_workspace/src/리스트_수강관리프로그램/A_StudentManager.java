package 리스트_수강관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

import 배열_수강관리프로그램.B_Student;
import 배열_수강관리프로그램.B_Subject;

public class A_StudentManager implements A_StudentProgram {
	private ArrayList<B_Student> studentlist = new ArrayList<>();

	// 1명의 학생정보 + 수강정보를 같이 출력하고 싶을때
	public void printStuOne(B_Student s) {
		System.out.println("\n   ▼ 학생정보 ▼   \n");
		s.stdPrint();
		System.out.println();
		System.out.println("   ▼ 수강정보 ▼   \n");
		s.subPrint();
	}

	@Override
	public void printStudent() {
		System.out.println("\n▼ 전체 학생 정보 ▼\n");
		for (int i = 0; i < studentlist.size(); i++) {
			studentlist.get(i).stdPrint();
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

		B_Student p = new B_Student();
		p.setStdNum(num);
		p.setStdname(name);
		p.setRegisterNum(birth);
		p.setFaculty(faculty);
		p.setMajor(major);

		studentlist.add(p);
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("◈ 학생 검색 페이지 ◈");
		while (true) {
			System.out.print("검색하실 학생 이름을 입력해주세요. : ");
			String name = scan.next();

			int index = -1;

			for (int i = 0; i < studentlist.size(); i++) {
				if (studentlist.get(i).getStdname().equals(name)) {
					printStuOne(studentlist.get(i));
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
		
		
		for(int i=0; i<studentlist.size(); i++) {
			if(studentlist.get(i).getStdNum().equals(num)) {
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
		studentlist.get(index).insertSubject(sub);

	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("◈ 수강철회 페이지 ◈");
		System.out.print("학번 입력 : ");
		String num = scan.next();
		int index = -1;
		
		//수강철회를 하고자하는 학생 체크
		for(int i=0; i<studentlist.size(); i++) {
			if(studentlist.get(i).getStdNum().equals(num)) {
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
		
		studentlist.get(index).deleteSubject(name);
	}

}
