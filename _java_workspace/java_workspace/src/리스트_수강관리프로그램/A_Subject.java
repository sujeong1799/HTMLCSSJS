package 리스트_수강관리프로그램;

import java.util.ArrayList;

import 리스트_수강관리프로그램.A_Subject;

public class A_Subject {

	
	private String subCode; 
	private String subName;
	private double subCredite;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subCategory;
	private String subScheduler;

	
	public A_Subject() {
	}

	// 과목명만 받는 생성자
	public A_Subject(String subName) {
		this.subName = subName;
	}

	// 과목코드, 과목명, 분류만 받는 생성자
	public A_Subject(String subName, String subProfessor, String subCategory) {
		super();
		this.subName = subName;
		this.subProfessor = subProfessor;
		this.subCategory = subCategory;

	}

	// 전체 데이터를 받는 생성자
	public A_Subject(String subCode, String subName, double subCredite, int subTime, String subProfessor,
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

