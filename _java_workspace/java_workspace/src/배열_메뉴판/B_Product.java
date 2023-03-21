package 배열_메뉴판;

public class B_Product {
	
	private String menu;
	private int price;
	
	// 기본생성자만 쓰게되면 코드가 길어짐. 
	public B_Product() {}

	
	public B_Product(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
	public void printMenu() {
		System.out.println(" 메뉴 리스트 ");
		System.out.println(" "+ menu + "\t"+price);
	}

	public String getMenu() {
		return menu;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}