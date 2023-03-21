package day11;

public class VipCustomer extends Customer{
	
	
	
	private int agentID;
	double saleRatio;
	
	public VipCustomer() {}
	
	public VipCustomer(int id, String name, int agentid) {
		super(id, name);
		customerGrade = "Vip";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		this.agentID = agentid;
		
	}
	
	public int calcPrice(int price) { // 10000-1000 = 9000
		bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price*saleRatio); 

	}

	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("담당상담사는 "+agentID+"입니다.");
	}

	public int getAgentID() {
		return agentID;
	}
	
	
	

}
