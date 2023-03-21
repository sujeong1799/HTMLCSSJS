package 배열_수강관리프로그램;

public class B_Subject {
	/*
	 * 과목클래스 : 한 과목의 정보를 나타내는 클래스
	 * 
	 * - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 분류, 수업시간표 - 멤버변수 선언, 생성자, getter/setter, 그외 필요한
	 * toString // 여기까지는 필수~~~!!!! (print메서드)
	 */

	// 멤버변수 선언 - 일반적으로 private으로 선언
	private String subCode; // 기본값 = null
	private String subName;
	private double subCredite;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subCategory;
	private String subScheduler;

	// 생성자 : 객체를 생성할 때 기본적으로 세팅하고자하는 값을 미리 입력받아서 객체를 생성
	// 생성자는 아무것도 없는 기본값을 가지고 있음. -> 생성자를 추가하지 않는다면 자동 생성
	// 추가 생성자를 만든다면 기본 생성자는 사라짐.(자동생성 하지 않음 -> 직접 만들어야 함)
	public B_Subject() {
	}

	// 과목명만 받는 생성자
	public B_Subject(String subName) {
		this.subName = subName;
	}

	// 과목코드, 과목명, 분류만 받는 생성자
	public B_Subject(String subName, String subProfessor, String subCategory) {
		super();
		this.subName = subName;
		this.subProfessor = subProfessor;
		this.subCategory = subCategory;

	}

	// 전체 데이터를 받는 생성자
	public B_Subject(String subCode, String subName, double subCredite, int subTime, String subProfessor,
			String subSemester, String subCategory, String subScheduler) {
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subCategory = subCategory;
		this.subScheduler = subScheduler;
	}
	
	public void subPrint() {
		System.out.println(" 과목명 : " + subName);
		System.out.println(" 교수명 : " + subProfessor);
		System.out.println(" 　분류 : " + subCategory+"\n");

	}

	// getter / setter

	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public double getSubCredite() {
		return subCredite;
	}

	public void setSubCredite(double subCredite) {
		this.subCredite = subCredite;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubSemester() {
		return subSemester;
	}

	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSubScheduler() {
		return subScheduler;
	}

	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}

}
