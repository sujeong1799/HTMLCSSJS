package day10;

public class Ezen_선생님 {
	private String name;
	private String birth;
	private int age;
	private String phone;
	public final static String company = "EZEN";
	private String branch;
	private String[] course = new String[5]; // 수강과목
	private String[] period = new String[5]; // 수강기간
	
	private int cnt; // 수강과목, 수강기간의 index를 처리
	
	
	//생성자
	public Ezen_선생님() {}
	
	public Ezen_선생님(String name, String birth, int age,
			String phone, String branch) {
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;
		this.branch = branch;
		
	}
	
	public Ezen_선생님(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
		
	}
	
	//메서드
	
	public void printInfo() {
		System.out.println("------학생정보------");
		System.out.println("이름 : "+name);
		System.out.println("tel : "+phone);
		System.out.println("age : "+age+"세");
		System.out.println("생년월일 : "+birth);
	}
	
	public void printCompany() {
		System.out.println("학원명 : "+company);
		System.out.println("지점 : " + branch);
	}
	
	//수강정보 출력
	public void printCourse() { // 배열 -> for반복하여 출력
		if(course.length ==0 || cnt ==0) {
			System.out.println("수강 이력이 없습니다.");
			return; // 메서드의 종료를 의미
		}
		for(int i=0; i<cnt; i++) { // cnt 추가되지 않은 값은 출력X
			System.out.println("과정:"+course[i]+"("+period[i]+") ");		
		}
	}
	
	//수강정보 등록
	public void insertCourse(String course, String period) {
		this.course[cnt] = course; // cnt는 0인상태
		this.period[cnt] = period;
		cnt++; // index 증가.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getCompany() {
		return company;
	}
	
	
}
