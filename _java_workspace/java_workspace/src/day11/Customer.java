package day11;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	double disCount=1;
	
	
	//생성자
	public Customer() {	}


	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
		
	//grade랑 point는 상속받는 애들이 알아서 지정해줄거임.
	}
	
	private void initCustomer() {
		customerGrade = "Silver"; // 얘네들은 매개변수없이 따로 써줘
		bonusRatio = 0.01;
	}
	
	
	//메서드
	//보너스 적립 계산 메서드
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price*bonusRatio); // 형변환 해줘야함.
		int result = (int)(price*disCount); 
		return result;
	}
	
	
	//출력 메서드
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며 "+"보너스 포인트는 "+bonusPoint+"점 입니다.");
	}


	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}


	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	public double getBonusRatio() {
		return bonusRatio;
	}


	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	



	
	
	
}



//class VIPCustomer extends Customer{
//	
//	public VIPCustomer() {
//		super.customerGrade = "VIP";
//		super.bonusRatio = 0.05;
//		disCount = 0.9;
//	}
//
//
//	public int calcPrice(int price) {
//		bonusPoint = (int) (price * bonusRatio);
//		int result = (int)(price*disCount); 
//		return result;
//	}
//}


