package Board;


public class BoardMain {

	public static void main(String[] args) {
		BoardManager bm = new BoardManager();
		
		
		
		bm.add();
		System.out.println("전체 리스트 출력");
		bm.printAllBoard();
		
		System.out.println();
		System.out.println("홍세나, 우성민만 출력");
		bm.getBoardByName();
		
		System.out.println();
		System.out.println("배열이 들어간 제목만 출력");
		bm.printBoard();
		
		System.out.println();
		System.out.println("조회수 젤 높은것만 출력");
		bm.printHitCountBoard();
		
		System.out.println();
		System.out.println("set통한 전체 게시물 목록 출력 ");
		bm.printSetBoard();
		
		System.out.println();
		System.out.println("Map을 이용한 전체 게시물 목록 출력");
		bm.printMapBoard();
		
		
	}

}