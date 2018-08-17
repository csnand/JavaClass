package exam2017;

import java.util.Date;

public class IMAppBase {
	
	private Date createdAt;
	private String content;
	private int status;
	
	public IMAppBase(String content, int status) {
		createdAt = new Date();
		this.content = content;
		this.status = status;
	}
	
	public String viewContent() {
		return content;
	}
	
	public String previewContent() {
		return content;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	
	

}
