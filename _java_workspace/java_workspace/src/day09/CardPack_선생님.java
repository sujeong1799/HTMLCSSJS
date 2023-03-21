package day09;


	public class CardPack_선생님 {

		/* CardPack클래스
		 * - 카드팩 : 52장의 카드가 들어있음.
		 * 
		 * 기능
		 * - 카드를 섞는 기능
		 * - 한장을 선택하는 기능
		 * - 카드 초기화 기능
		 * - 출력 기능 (한장씩 찍는거니까 card 클래스에서 가져온다)
		 *   생성자에서 52장의 카드를 모두 생성
		 * */

	

	
	private Card[] pack = new Card[52]; // 카드 팩 배열
	private int cnt = 0; // 카드가 남은 개수(번지라고 생각해)
	
	
	//카드 섞기 
	//매서드명 : shuffle
	//Card tmp
	public void shuffle() {
		int min = 0;
		int max = pack.length-1;
				
		for(int i=0; i<pack.length; i++) { 
			int index = (int)(Math.random()*(max-min+1))+min;
			
				Card tmp = pack[i]; // 카드 pack[tmp] 자리를 하나 만들어서 pack[i]를 넣어줌.
				pack[i] = pack[index]; // pack[랜덤]카드를 pack[i]와 자리 바꿔줌.  
				pack[index] = tmp ; // pack[tmp]자리에 pack[랜덤]에 넣어주면 자리 바꾸기 끝! 
		}
		
	}
	
	
	
	//카드를 한장 빼내는 기능
	//매서드명 : pick
	//리턴타입 : 카드1장
	//cnt = 52 가정하고 제일 위에 있는 한장을 꺼내볼거야.
	//카드가 없으면 리턴 null
	
	public Card pick() {
		if(cnt==0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	
	
	// 생성자는 호출이 안됨.
	
	// 카드 초기화 기능
	public void init() { // cnt만 모아 (빠져나간것도 다 불러)
		cnt = 52;
		
//		cnt=0;
//		char shape = '♥';
//		for(int i=1; i<=4; i++ ) { // 배열에 넣는게 아니라서 i=1
//			switch(i) { // shape을 정하기 위한거 /// i=1일때
//			case 1: shape='♥'; break; 
//			case 2: shape='♣'; break;
//			case 3: shape='♠'; break;
//			case 4: shape='◆'; break;
//			}
//			for(int j=1; j<=13; j++) { /// j는 1~13번 돌아감
//				Card c = new Card(); //i가 돌때마다 카드 한 장 생성
//				c.setShape(shape); /// 
//				c.setNum(j); /// 
//				//shape, num수가 정해졌으니까 cnt=52라고 안해줘도 됨
//				pack[cnt] = c;// 
//				cnt++; 
		
		// 주석 없애면 정렬 됨 
//			}
//		}
	}
	


	//배열안에 다 비어있어 그 배열안에 카드를 만들어서(객체) 하나하나 순차적으로 배열에 넣어줄거야.
	
	//생성자 -> 52장의 카드를 생성 // 인덱스 번지는 for돌아가면서 만들어짐 
	public CardPack_선생님() {
		// ♥  ♣  ♠  ◆
		char shape = '♥';
		for(int i=1; i<=4; i++ ) { // 배열에 넣는게 아니라서 i=1
			switch(i) { // shape을 정하기 위한거 /// i=1일때
			case 1: shape='♥'; break; 
			case 2: shape='♣'; break;
			case 3: shape='♠'; break;
			case 4: shape='◆'; break;
			}
			for(int j=1; j<=13; j++) { /// j는 1~13번 돌아감
				Card c = new Card(); //i가 돌때마다 카드 한 장 생성
				c.setShape(shape); /// 
				c.setNum(j); /// 
				//shape, num수가 정해졌으니까 cnt=52라고 안해줘도 됨
				pack[cnt] = c;// 
				cnt++; // pack[0] > pack[1]... pack[51]
				
			}
		}
	}
	
	


}
	

