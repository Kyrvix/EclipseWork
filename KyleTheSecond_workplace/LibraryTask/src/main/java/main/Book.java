package main;

public class Book extends Item {
	private String title;

	public Book(String title, int id) {
		super(id);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "[" + title + ", " + super.getId() + "]";
	}

}
