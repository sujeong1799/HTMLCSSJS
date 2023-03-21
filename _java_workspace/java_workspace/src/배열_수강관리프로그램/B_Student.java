package 배열_수강관리프로그램;

import java.util.Arrays;

public class B_Student {
	// 학생 클래스 : 한 학생의 정보를 나타내는 클래스
	// 학번, 이름, 주민번호(생년월일),
	// 학부, 학과, 수강과목정보(과목클래스를 배열로 생성) 5개
	// 수강과목 번지를 대신할 count
	/*
	 * 메서드 - 수강과목 추가(배열이 다 찼다면 늘려주기) - 수강과목 삭제
	 * 
	 * 생성자, getter/setter / toString 말고 출력메서드(print) 출력메서드 (2가지 형태) 1. 학생확인 2. 학생검색
	 * 
	 */

	private String stdNum;
	private String stdname;
	private String registerNum;
	private String faculty;
	private String major;
	private B_Subject[] subjectlist = new B_Subject[5]; // subject 클래스를 배열로 선언.
	private int subCount;

	// 기본생성자
	public B_Student() {
	}

	public B_Student(String stdname) {
		this.stdname = stdname;
		subjectlist = new B_Subject[5];


	}

	// 전체 데이터 받는 생성자
	public B_Student(String stdNum, String stdname, String registerNum, String faculty, String major) {
		this.stdNum = stdNum;
		this.stdname = stdname;
		this.registerNum = registerNum;
		this.faculty = faculty;
		this.major = major;

	}

	// print 메서드
	// 학생정보만 출력
	public void stdPrint() {
		System.out.println(" 학생명(학번) : " + stdname + "(" + stdNum + ")");
		System.out.println(" 　학부(학과) : " + faculty + "(" + major + ")");
	}

	// 수강과목을 출력하는 메서드
	public void subPrint() {
		// 수강 과목이 없을 때
		if (subCount == 0) {
			System.out.println(" 수강중인 과목이 없습니다.\n");
		}

		// 수강 과목이 있을 때 : 수강과목은 여러개 있을 수 있음
		for (int i = 0; i < subCount; i++) {
//			System.out.println(subjectlist[i]); // -> toString을 이용한 출력
			// pirnt메서드로 직접 sysout을 했을 경우
			 subjectlist[i].subPrint(); // subject 클래스에 print메서드가 있을 경우 이렇게 호출

		}
	}

	// 수강과목 추가 메서드
	/*
	 * 매개변수 : Subject 클래스의 subName을 가져올거임. 리턴타입 : void (왜? 값만 넣는거니까)
	 */

	public void insertSubject(B_Subject subName) {
		// 배열이 다 찼을 경우
		if (subCount == subjectlist.length) {
			// new를 이용해서 배열 생성 (신규 배열을 생성) 기존배열 +5한 배열을 만들거임.
			B_Subject[] tmp = new B_Subject[subjectlist.length + 5]; // [subjectlist.length+5]로 해도 됨

			// arraycopy를 이용한 배열복사
			// System.arraycopy(구배열, 시작번지, 신배열, 시작번지, 총개수)
			System.arraycopy(subjectlist, 0, tmp, 0, subjectlist.length);

			// 새로 만든 배열로 연결
			subjectlist = tmp; // subjectlist 길이는 원래 길이의 +5가 된다.
		}

		// subName 추가
		subjectlist[subCount] = subName;
		subCount++; // 값을 추가했기 때문에 cubCount 증가
	}

	// 수강과목을 삭제하는 메서드

	// 중간에 null 넣으면 값을 제대로 조회 할 수 없다.
	// null을 넣고 맨뒤로 자리 옮기고 애들 하나씩 땡겨야함

	/*
	 * 매개변수 : String subName 리턴은 읎어.
	 */

	public void deleteSubject(String subName) {
		int index = -1; // 찾는 과목의 위치를 나타내는 변수 // 왜 -1? 0번지로 두게되면 0번지로 선택되기때문엥..
		// 만약 매개변수 subName이 null이면 return(메서드 빠져나감)
		if (subName == null) {
			return;
		}

		// subName이 subjectlist에 있는지 검색.
		for (int i = 0; i < subCount; i++) { // 나에게 있는 값까지만 돌리자.
			if (subjectlist[i].getSubName().equals(subName)) {
				// 있다면 그 위치의 값을 index에 저장할겨.
				index = i;
				break;
			}
		}

		// 찾는 과목이 없다면?
		if (index == -1) {
			System.out.println("해당하는 과목이 없습니다.");
			return;
		}

		// subName의 값을 찾았을 경우 삭제(찾은 위치부터 뒷번지의 과목을 앞번지로 옮기기) subCount까지만 옮기고 그 뒤에는 건들이면
		// 안됨
		// subCount = 1 // 1과목이 있다는것을 의미. subjectlist = 0번지라는 의미
		for (int i = index; i < subCount - 1; i++) { // 전체 번지의 값까지 간다. // subCount-1을 하는 이유? ↓
			subjectlist[i] = subjectlist[i + 1]; // 뒤에 있는걸 앞으로 옮길게요 // i+1하면 subCount뒤에 있는 값도 가져와서 안됨!!
		}

		// 마지막 번지는 null로 채워줄게
		// ex) 과목이 3개 있따면 0 1 2 마지막 번지는 2
		subjectlist[subCount - 1] = null;
		subCount--;

	}

	// getter / setter
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

	public B_Subject[] getSubjectlist() {
		return subjectlist;
	}

	public void setSubjectlist(B_Subject[] subjectlist) {
		this.subjectlist = subjectlist;
	}

	// setSubcount는 뺌 안빼믄 임의조작 가능하잖아. 그럼 프로그램 에러 나쟈나
	public int getSubcount() {
		return subCount;
	}

}
