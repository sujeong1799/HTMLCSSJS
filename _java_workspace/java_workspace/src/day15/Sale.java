package day15;


/* 제네릭 : 결정되지 않은 파라미터를 처리할때
 * 실제 객체를 사용할때 파라미터 타입을 결정해서 대체
 * <T> <K><V>
 * menu, price
 * */

public class Sale<K,V> {
	
	//멤버변수 선언 menu, price
	private K menu; 
	private V price; // v에 뭑 ㅏ들어오든 다 v로 박거.
	
	public Sale() {}

	public Sale(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}
	
	public void salePrint() {
		System.out.println(menu +"\t"+ price);	
	}

	public K getMenu() {
		return menu;
	}

	public void setMenu(K menu) {
		this.menu = menu;
	}

	public V getPrice() {
		return price;
	}

	public void setPrice(V price) {
		this.price = price;
	}


	

	


	
	

	
	

}
