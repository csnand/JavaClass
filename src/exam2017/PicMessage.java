package exam2017;

import java.awt.Image;

public class PicMessage extends IMAppBase {
	
	private Image image;
	private TextMessage textMesg;
	
	public PicMessage(String content, int status, Image image) {
		super(content, status);
		this.image = image;
	}
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}


}
