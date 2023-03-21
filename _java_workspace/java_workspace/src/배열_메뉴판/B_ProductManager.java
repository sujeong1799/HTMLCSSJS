package 배열_메뉴판;

import java.util.Scanner;

public class B_ProductManager implements B_Program {
	
	private B_Product[] menu = new B_Product[5];
	private B_Product[] order1 = new B_Product[5];
	private int menuCount;
	private int orderCount;

	@Override
	public void addMenu(Scanner scan) {

		System.out.println("메뉴명 : ");
		String name = scan.next();
		
		System.out.println("가격 : ");
		int num = scan.nextInt();
		
		if(menuCount ==menu.length) {
			B_Product[] tmp = new B_Product[5];
			System.arraycopy(menu, 0, tmp, 0, menu.length);
			menu = tmp;
		}
		
		B_Product p = new B_Product(name, num);
		
		menu[menuCount] = p;
		menuCount++;
		
	}

	@Override
	public void printProduct() {
		for(int i=0; i<menuCount; i++) {
			menu[i].printMenu();
		}
	}

	@Override
	public void orderPick(String name, int count) {
			for(int i=0; i<menuCount; i++) {
			if(menu[i].getMenu().equals(name)) {
				int price = menu[i].getPrice();
				B_Order order = new B_Order();
				order.setMenu(name);
				order.setPrice(price);
				order.setTotal(price*count);
				order1[orderCount] = order;
			}
		}
	}

	@Override
	public void printOrder() {
		System.out.println("주문내역");
		for(int i=0; i<orderCount; i++) {
			System.out.println(order1[i].getMenu() + order1[i].getPrice());
		}

	}

}