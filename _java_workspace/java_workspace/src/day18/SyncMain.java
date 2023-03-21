package day18;

public class SyncMain {

	//공유하는 영역 
	public static Bank myBank = new Bank(); // Bank계좌는 공용으로 쓰는 계좌로 설정.  하나의 Bank를 같이 쓰는 경우임.
	
	public static void main(String[] args) throws Exception {
		
		Hong h = new Hong();
		h.start();
				
		HongWife hw = new HongWife();
		hw.start();
		
		//공유영역에 myBank를 설정해놔도 입금(3초), 출금(0.2초) 맞게나오지 않는다.
		//입금이되는중에 시간이 흘러가더라도 출금을 하지 못하게 해야한다.???
		

	}

}

class Bank{
	
	//계좌의 돈
	private int money = 10000;
	
	//입금
	public synchronized void saveMoney(int save){ //synchronized가 있다는것은 어떤 객체가 save 머니에 접근을 하면 입금하는동안(3초) bank자체에 접근을 못하게 하겠다.
		int m = this.money;
		
		try {
			Thread.sleep(3000); // 3초 기다려
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		setMoney(m+save);
	}

	//출금
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(money-minus);
	}
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}


class Hong extends Thread{
	public void run() { // 입금 
		System.out.println("입금을 시작합니다.");
		SyncMain.myBank.saveMoney(3000); // 3천원 입금
		System.out.println("3천원 입금 후 잔액 : " + SyncMain.myBank.getMoney());
	}
	
}



class HongWife extends Thread{
	public void run() { // 출금
		System.out.println("출금을 시작합니다.");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("천원 출금 후 잔액 : " + SyncMain.myBank.getMoney());
	}
	
}