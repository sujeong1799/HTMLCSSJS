package day02;

public class Switch문3 {

	public static void main(String[] args) {
		/* 계절을 출력
		 * 1~12월까지 랜덤으로 생성 후 해당하는 월과 계절을 출력 
		 * 3~5 : 봄, 6~8 : 여름, 9~11 : 가을, 12~2 : 겨울*/
		
		int month = (int)(Math.random()*12)+1;
		
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.println(month+"월은 겨울입니다. 추버요");
			break;
		case 3: case 4: case 5:
			System.out.println(month+"월은 봄입니다. 조아요");
			break;
		case 6: case 7: case 8:
			System.out.println(month+"월은 여름입니다. 더버요");
			break;
		default:
			System.out.println(month+"월은 가을입니다. 조아요");
		}
		
//		|| or 둘 중 하나의 조선만 맞으면 true
//		&& and 둘 다 맞아야 맞다.
//		!(조건) > 조건의 반대
		
		if (month >= 3 && 5 >= month) { // random이 3보다 크거나 같고, 5보다 작거나 같다
			System.out.println(month+"월은 봄입니다.");
		} else if (month >= 6 && 8 >= month) { // random이 6보다 크거나 같고, 8보다 작거나 같다
			System.out.println(month+"월은 여름입니다.");
		} else if (month >= 9 && 11 >= month) { // random이 9보다 크거나 같고, 11보다 작거나 같다
			System.out.println(month+"월은 가을입니다.");			
		} else if (month == 12 || month == 2 || month == 1){ // 12이거나 2거나 1인 값은 없으니 or로 한다.
			System.out.println(month+"월은 겨울입니다.");
		} else {
			System.out.println("이상해여");
		}
		

	}

}
