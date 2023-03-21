package 리스트_수강관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

import 리스트_수강관리프로그램.A_Subject;

public class A_Student {
	Scanner scan = new Scanner(System.in);
	private String stdNum;
	private String stdname;
	private String registerNum;
	private String faculty;
	private String major;
	private ArrayList<A_Subject> subjectlist = new ArrayList<>();

	// 기본생성자
	public A_Student() {
	}

	public A_Student(String stdname) {
		this.stdname = stdname;
	}

	// 전체 데이터 받는 생성자
	public A_Student(String stdNum, String stdname, String registerNum, String faculty, String major) {
		this.stdNum = stdNum;
		this.stdname = stdname;
		this.registerNum = registerNum;
		this.faculty = faculty;
		this.major = major;
	}

	// 메서드

	public void stdPrint() {
		System.out.println(" 학생명(학번) : " + stdname + "(" + stdNum + ")");
		System.out.println(" 　학부(학과) : " + faculty + "(" + major + ")");
	}

	
	public void subPrint() {
		int index = -1;
		
		// 수강 과목이 있을 때
		for (int i = 0; i < subjectlist.size(); i++) {
			subjectlist.get(index).subPrint();
		}
		// 수강 과목이 없을 때
		if(index == -1) {
			System.out.println("수강 과목이 없습니다.");
			return;
		}
		
	}

	
	
	// - 수강과목 추가(배열이 다 찼다면 늘려주기)
	// - 수강과목 삭제
	public void insertSubject(A_Subject subName) {
		
		for(int i=0; i<subjectlist.size(); i++) {
			if(subjectlist.get(i).getSubName().equals(subName)) {
				subjectlist.add(subName);
			}
		}
		
	}

	// 수강과목을 삭제하는 메서드

	public void deleteSubject(String subName) {
		int index = -1; // 찾는 과목의 위치를 나타내는 변수 // 왜 -1? 0번지로 두게되면 0번지로 선택되기때문엥..
		// 만약 매개변수 subName이 null이면 return(메서드 빠져나감)
		if (subName == null) {
			return;
		}

		// subName이 subjectlist에 있는지 검색.
		for (int i = 0; i < subjectlist.size(); i++) {
			if (subjectlist.get(i).getSubName().equals(subName)) {
				index = i;
				subjectlist.remove(index);
				break;
			}
		}

		// 찾는 과목이 없다면?
		if (index == -1) {
			System.out.println("해당하는 과목이 없습니다.");
			return;
		}

	}

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public ArrayList<A_Subject> getSubjectlist() {
		return subjectlist;
	}

	public void setSubjectlist(ArrayList<A_Subject> subjectlist) {
		this.subjectlist = subjectlist;
	}
	
	
	
	

}
