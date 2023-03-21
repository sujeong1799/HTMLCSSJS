package day09;

public class CardPack {

		/* CardPack클래스
		 * - 카드팩 : 52장의 카드가 들어있음.
		 * 
		 * 기능
		 * - 카드를 섞는 기능
		 * - 한장을 선택하는 기능
		 * - 카드 초기화 기능
		 * - 출력 기능 (한장씩 찍는거니까 card 클래스에서 가져온다)
		 *   생성자에서 52장의 카드를 모두 생성하고 ........카드의 배열에 넣어줄거야. 
		 * */

	
	//멤버변수
	//카드를 담을 수 있는 배열 52장 
	
	private Card[] pack = new Card[52]; //카드 클래스의 배열을 만든다. 클래스[] 이름 = new 클래스[범위]
	private int cnt = 0; // 카드가 남은 개수 ex) Card[cnt] pack
	
	
	//멤버변수는 매개변수로 넣지 않는다.
	
	
	// 카드 섞기 기능
	// 메서드명 : shuffle
	// Card tmp
	public void shuffle() {
		for(int i=0; i<pack.length; i++) {  // pack범위만큼
			int num = (int)(Math.random() * pack.length); 
			// 바로 Card에 못 넣어주니까 int num에 넣어준다. 
			
			Card tmp = pack[i]; // 카드 pack[tmp] 자리를 하나 만들어서 pack[i]를 넣어줌.
			pack[i] = pack[num]; // pack[랜덤]카드를 pack[i]와 자리 바꿔줌.  
			pack[num] = tmp ; // pack[tmp]자리에 pack[랜덤]에 넣어주면 자리 바꾸기 끝! 
		}
		
	}
	
	
	// 카드 한장씩 뽑는 기능
	// 메서드명 : pick
	
	public Card pick() {
		if(cnt<=0) {
			return null;
		}else {
			cnt--; // 2. 마이너스 그럼 다음 카드는 cnt=51
			
			return pack[cnt]; // 1. 카드가 나가고	
		}
			
	}
	
	
//	public Card pick1() {
//		if(cnt>0) { // 0포함하면 안됨. 
//			cnt--;
//			return pack[cnt];
//			
//		}else 
//			
//			return null;
//	}
	
	public void init() {
		cnt = 52; //cnt만 모아 (빠져나간것도 다 불러)
	}
	
	
	public CardPack() {
		char shape ='♥';
		for(int i=1; i<=4; i++) { 
			switch(i) {  		  
			case 1: shape='♥'; break; 
			case 2: shape='♣'; break;
			case 3: shape='♠'; break;
			case 4: shape='◆'; break;
			}
			for(int j=1; j<=13; j++) {  
				Card c = new Card(); 
				c.setShape(shape);
				c.setNum(j);
				
				pack[cnt] = c; 
				cnt++; 
			}
		}
	}
	
	
	
}
