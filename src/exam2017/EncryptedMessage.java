package exam2017;

public class EncryptedMessage {
	
	private byte[] encryptedMesg;
	private boolean isEncrypted;
	private int mesgType;
	
	public EncryptedMessage(byte[] encryptedMesg, boolean isEncrypted, int mesgType) {
		this.encryptedMesg = encryptedMesg;
		this.isEncrypted = isEncrypted;
		this.mesgType = mesgType;
	}
	
	public int getMesgType() {
		return mesgType;
	}

	public void setMesgType(int mesgType) {
		this.mesgType = mesgType;
	}

//	public String getDecryptedMesg() {
//		return decrypt(this.getEncryptedMesg());
//	}
	
	
	public byte[] getEncryptedMesg() {
		return encryptedMesg;
	}
	public void setEncryptedMesg(byte[] encryptedMesg) {
		this.encryptedMesg = encryptedMesg;
	}
	public boolean isEncrypted() {
		return isEncrypted;
	}
	public void setEncrypted(boolean isEncrypted) {
		this.isEncrypted = isEncrypted;
	}
	
	
}
