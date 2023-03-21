package 리스트_메뉴판;

import java.util.ArrayList;
import java.util.Scanner;

public class A_productManager implements A_Program {

	private ArrayList<A_Product> menu = new ArrayList<>();
	private ArrayList<A_Product> order = new ArrayList<>();

	private int count;
	private int total;
	
	public void addmenu() {
		menu.add(new A_Product("햄버거", 10000));
		menu.add(new A_Product("피자", 10000));
		menu.add(new A_Product("김밥", 5000));
		menu.add(new A_Product("음료", 1500));

	}

	@Override
	public void add(Scanner scan) {
		
		System.out.println("◈ 메뉴 추가 페이지 ◈");
		System.out.print("　메뉴 : ");
		String name = scan.next();

		System.out.print("　가격 : ");
		int num = scan.nextInt();

		menu.add(new A_Product(name, num));
	}

	@Override
	public void printProduct() {
		System.out.println("\n ▼ 메뉴 리스트 ▼");

		for (int i = 0; i < menu.size(); i++) {
			System.out.println("  "+ menu.get(i).getMenu() +"\t"+ menu.get(i).getPrice());
		}
		System.out.println();

	}

	@Override
	public void orderPick(Scanner scan) {

		char ch = 0;
		int sum = 0;

		while (true) {
			System.out.println("주문을 하시겠습니까? y/n");
			ch = scan.next().charAt(0);

			if (ch == 'y' || ch == 'Y') {
				A_Product p = new A_Product();
				System.out.println("주문을 시작합니다.");
				System.out.print("메뉴 : ");
				String name = scan.next();
				int price = 0;
				for (int i = 0; i < menu.size(); i++) {
					if (menu.get(i).getMenu().equals(name)) {
						price = menu.get(i).getPrice();
					}
				}

				System.out.print("수량 : ");
				count = scan.nextInt();
				p.setMenu(name);
				p.setPrice(price * count);
				p.setCount(count);
				order.add(p);
				 
				
				System.out.println("\n ▼ 장 바 구 니 ▼ ");
				for (int i = 0; i < order.size(); i++) {
					System.out.println(" " + order.get(i).getMenu() + " " + order.get(i).getCount() + "개");
				}
				System.out.println();
				
			} else if (ch == 'n') {
				break;
			}
		}
	}

	@Override
	public void printOrder() {
		int sum = 0;
		System.out.println("\n ▼ 주 문 내 역 ▼ ");
		for (int i = 0; i < order.size(); i++) {
			System.out.println("  " + order.get(i).getMenu() + "\t" + order.get(i).getPrice());
			sum += order.get(i).getPrice();
		}
		System.out.println("==================");
		System.out.println("　총 금액 : " + sum);

	}

	@Override
	public void delete(Scanner scan) {
		System.out.println("상품 삭제 페이지");
		System.out.println("메뉴 입력 : ");
		String name = scan.next();
		
		
		for(int i = 0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				System.out.println("삭제를 완료했습니다.");
				menu.remove(i);
			}
		}
		
	}

	@Override
	public void update(Scanner scan) {
		System.out.println("상품 수정 페이지");
		System.out.println("메뉴 입력 : ");
		String name = scan.next();
		int index = -1;
		
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				index = i;
			}
		}
		System.out.println("수정할 가격 입력 : ");
		int price = scan.nextInt();
		menu.get(index).setPrice(price);
		
		if(index == -1) {
			System.out.println("없는 메뉴 입니다.");
			return;
		}
		
		
	}	
}
