package exam2015;

public class SpreedSheet extends Document {
	private String title;
	private Cell[][] cell;
	
	public SpreedSheet(String filename, String author, String title, Cell[][] cell) {
		super(filename, author);
		this.title = title;
		this.cell = cell;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Cell[][] getCell() {
		return cell;
	}
	public void setCell(Cell[][] cell) {
		this.cell = cell;
	}
	
	

}
