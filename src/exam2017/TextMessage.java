package exam2017;

public class TextMessage extends IMAppBase implements Encryptable {
	
	private boolean isEncrypted;
	private byte[] encryptedMesg;
	private int type;
	
	public TextMessage(String content, int status) {
		super(content, status);
	}


	@Override
	public int getMesgType() {
		return type;
	}

	@Override
	public void setMesgType(int mesgType) {
		type = mesgType;

	}

	@Override
	public String getDecryptedMesg() {
		return null;
	}

	@Override
	public byte[] getEncryptedMesg() {
		return encryptedMesg;
	}

	@Override
	public void setEncryptedMesg() {
//		 encryptedMesg = encrypt(super.getContent());
		
	}

	@Override
	public boolean isEncrypted() {
		return isEncrypted;
	}

	@Override
	public void setEncrypted(boolean isEncrypted) {
		this.isEncrypted = isEncrypted;

	}

}
