package Board;

public class Board {
	
	private int id;
	private String title;
	private String writer;
	private String date;
	private int hitcount;
	
	public Board() {}

	public Board(int id, String title, String writer, String date, int hitcount) {
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	@Override
	public String toString() {
		return  id+" " + title +" "+ writer+" " + date +" "+ hitcount ;
	}
	
	
	

}