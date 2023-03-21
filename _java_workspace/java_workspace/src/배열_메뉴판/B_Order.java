package 배열_메뉴판;

public class B_Order extends B_Product {
	
	private int count;
	private int total;


	public B_Order() {}
	
	public B_Order(int count, int total) {
		this.count = count;
		this.total = total;
	}
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		
		this.total = total;
	}
	
	public void printTotal() {
		System.out.println(super.getMenu()+super.getPrice());
		System.out.println(count+"개 주문, 금액 : "+total);
	}
	
	
	

}