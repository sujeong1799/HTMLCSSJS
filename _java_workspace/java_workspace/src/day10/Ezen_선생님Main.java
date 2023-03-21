package day10;

public class Ezen_선생님Main {

	public static void main(String[] args) {
		
		Ezen_선생님 e1 = new Ezen_선생님();
		e1.setName("홍길똥");
		e1.setAge(20);
		e1.setBirth("2002-01-01");
		e1.setPhone("010-0000-1111");
		e1.setBranch("인천");
		e1.printInfo();
		e1.printCompany();
		e1.insertCourse("java", "4개월");
		e1.insertCourse("html", "5개월");
		e1.insertCourse("DB", "1개월");
		
		e1.printCourse();
		
		System.out.println();
		
		Ezen_선생님 e2 = new Ezen_선생님("홍기리","2001-01-01", 22, "010-1212-3232","서울");
		e2.printInfo();
		e2.printCompany();
		e2.insertCourse("JAVA", "6개월");
		e2.insertCourse("컴퓨터 활용능력", "1개월");
		
		e2.printCourse();
		
		System.out.println();
		

		/* 배열로 5명의 학생을 등록 후
		 * - 학생 이름으로 검색
		 * - 지점명으로 검색
		 * 
		 * 
		 * */
		
		Ezen_선생님[] std = new Ezen_선생님[7];
		std[0] = new Ezen_선생님("홍길동", "010-1234-4567","인천");		
		std[1] = new Ezen_선생님("홍길순", "010-1244-4567","인천");		
		std[2] = new Ezen_선생님("윤민영", "010-1234-4547","오사카");		
		std[3] = new Ezen_선생님("최누리", "010-1264-4564","도쿄");		
		std[4] = new Ezen_선생님("유관순", "010-1344-4547","인천");
		std[5] =e1;
		std[6] =e2;
		
		//std배열에 홍길동이 있다면 찍어주세요.
		String searchName = "최누리"; // 홍길동의 개인정보와 상담받은 지점정보 출력
		
		
		//std배열에 인천이 있다면 찍어주세요.
		String searchBranch = "오사카"; // 지점정보 / 개인정보 출력
		
		
		
		System.out.println("────"+searchName+"의 이름 정보────");
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchName)) {
				System.out.println(std[i].getName());
				System.out.println(std[i].getPhone());
				System.out.println(std[i].getBranch());
				System.out.println();
			}
		}
		
		System.out.println("─────"+searchBranch+" 지점 검색─────");
		
		for(Ezen_선생님 tmp : std) { // 향상된 for문 써보기
			if(tmp.getBranch().equals(searchBranch)){
				System.out.println(tmp.getName());
				System.out.println(tmp.getPhone());
				System.out.println(tmp.getBranch());
				System.out.println();
			}
		}

	}
	
	
}
