package day10;

public class Product2 {
	private String name;
	private int price;
	
	
	
	//생성자
	public Product2() {}
	
	
	public Product2(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	//삽입메서드
	public void insertProduct2(String name, int price) {
		this.name = name;
		this.price = price;
	}




	//getter / setter

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "상품리스트 [상품명 : " + name + ", 가격 : " + price + "원]";
	}
	
	
	


}
