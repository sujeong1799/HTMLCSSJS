package Board;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Map;

	public class BoardManager {

		private ArrayList<Board> list = new ArrayList<>();
		private ArrayList<Board> listAdd = new ArrayList<>();

		public void add() {
			list.add(new Board(100, "객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요"
				, "김정희", "2023.03.03", 84));
			list.add(new Board(101, "객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버"
				, "최윤희", "2021.07.21", 99));
			list.add(new Board(102, "클래스와 객체지향 프로그래밍(Object Oriented Programming)"
				, "우성민", "2020.06.10", 264));
			list.add(new Board(103, "[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77));
			list.add(new Board(104, "Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94));
			list.add(new Board(105, "배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70));
			list.add(new Board(106, "배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80));
			list.add(new Board(107, "문자열(장문) 처리하기", "성수정", "2019.12.30", 56));
			list.add(new Board(108, "[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기"
				, "홍세나", "2020.05.17", 84));
			list.add(new Board(109, "[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64));
			list.add(new Board(110, "다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94));
			list.add(new Board(111, "제어문 반복문", "정연남", "2022.08.03", 84));
			list.add(new Board(112, "연산자(Operator)", "최정빈", "2020.01.01", 64));
			list.add(new Board(113, "키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984));
			list.add(new Board(114, "변수와 자료형 #1", "이의정", "2022.09.03", 164));
		}
		
		

		public void printAllBoard() {

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}

//			for(Board tmp : list) {
//				System.out.println(tmp + " ");
//			}
		}

		public void getBoardByName() {

//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i).getWriter().equals("홍세나") || list.get(i).getWriter().equals("우성민")) {
//					listAdd.add(list.get(i));
//				}
//			}
			
			for(Board tmp : list) {
				if(tmp.getWriter().contains("홍세나") || tmp.getWriter().contains("우성민")) {
					listAdd.add(tmp);
				}
			}
			
			for(Board tmp : listAdd) {
				System.out.println(tmp);
			}
			
		}
		
		public void printBoard() {
			
			for(Board tmp : list) {
				if(tmp.getTitle().contains("배열")) {
					System.out.println(tmp);
				}
			}
			
//			for(int i=0; i<list.size(); i++) {
//				if(list.get(i).getTitle().contains("배열")) {
//					System.out.println(list.get(i));
//				}
//			}
		}
		
		public void printHitCountBoard() {
			int max = 0;
			
			for(int i=0; i<list.size(); i++) {
				max = (Math.max(max, list.get(i).getHitcount()));
			}
			
//			for(int i=0; i<list.size(); i++) {
//				if(list.get(i).getHitcount()==max) {
//					System.out.println(list.get(i));
//				}
//			}
			
			for(Board tmp : list) {
				if(tmp.getHitcount()==max) {
					System.out.println(tmp);
				}
			}
		}
		
		public void printSetBoard() {
			HashSet<Board> set = new HashSet<>();
			
			for(int i=0; i<list.size(); i++) {
				set.add(list.get(i));
			}
				
			for(Board tmp : set) {
				System.out.println(tmp);
			}
			
		}
		
		public void printMapBoard() {
			Map<Integer, Board> map = new HashMap<>();
			for(int i=0; i<list.size(); i++) {
				map.put(list.get(i).getId(), list.get(i));
			}
		
//			Iterator<Integer> it = map.keySet().iterator();
//			while(it.hasNext()) {
//				Integer id = it.next();
//				Board all = map.get(id);
//				System.out.println(all);
//			}
			
			for(Integer tmp : map.keySet()) {
				System.out.println(map.get(tmp));
			}
			
		}
		
		

	}

