package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	//<Sale<String, Integer>>안해주믄 타입 정하는거 미루는거임 ㅡㅡ
	private ArrayList<Sale<String, Integer>> product = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>();
	//메뉴가 들어오믄 String이고 가격이 들어오면 Integer로 들어감

	public void add(Scanner scan) {
		System.out.print("제품명 : ");
		String menu = scan.next();
		
		System.out.print("가격 : ");
		int price = scan.nextInt();
		
		Sale s = new Sale(menu, price);
		product.add(s);		
	}
	
	
	public void printProduct() {
		System.out.println("\t　상품 리스트 ");
		int index = 1;
		for(int i=0; i<product.size(); i++) {
			System.out.print("　　"+index+". "); 
			product.get(i).salePrint();
			index++;
		}
		System.out.println();
	}
	
	public void orderPick(Scanner scan) {
		int index = -1;
		
		System.out.println("주문메뉴 : ");
		String orderMenu = scan.next();
		
		System.out.println("주문수량 : ");
		int orderCount = scan.nextInt();
		for(int i=0; i<product.size(); i++) {
			if(product.get(i).getMenu().equals(orderMenu)) {
				index = i;
				int price = product.get(i).getPrice();
				Sale s = new Sale(orderMenu, orderCount*price);
				order.add(s);
			}
		}
		

		if(index == -1) {
			System.out.println("찾는 메뉴가 없습니다.");
		}
	}
	
	public void printOrder() {
		int sum = 0;
		for(Sale s : order) {
			sum = sum+(Integer)s.getPrice();
		}
		System.out.println("지불 총 금액 : "+sum);
	}
	
	
	public void printMenu() {
		System.out.println("1.상품추가 | 2. 상품리스트 ");
		System.out.println("3.상품주문 | 4. 주문내역");
		System.out.println("5.프로그램종료");
		System.out.print("입력 : ");
	}
	
	
}
