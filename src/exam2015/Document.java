package exam2015;

import java.util.Date;

public abstract class Document {
	private String filename;
	private String author;
	private Date createdAt;
	private Date lastModified;
	
	public Document(String filename, String author) {
		this.filename = filename;
		this.author = author;
		createdAt = new Date();
		lastModified = new Date();
	}

	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getLastModified() {
		return lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	

}
