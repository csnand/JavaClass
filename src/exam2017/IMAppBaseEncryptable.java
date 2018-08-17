package exam2017;

public class IMAppBaseEncryptable implements Encryptable {
	
	private byte[] encryptedMesg;
	private boolean isEncrypted;
	private int mesgType;
	
	public IMAppBaseEncryptable(byte[] encryptedMesg, boolean isEncrypted, int mesgType) {
		this.encryptedMesg = encryptedMesg;
		this.isEncrypted = isEncrypted;
		this.mesgType = mesgType;
	}
	
	@Override
	public int getMesgType() {
		return mesgType;
	}

	@Override
	public void setMesgType(int mesgType) {
		this.mesgType = mesgType;

	}

	@Override
	public String getDecryptedMesg() {
		String decryptedMesg = "Decrypted Message";
		return decryptedMesg;
	}

	@Override
	public byte[] getEncryptedMesg() {
		return this.encryptedMesg;
	}

	@Override
	public void setEncryptedMesg() {
		this.encryptedMesg = encryptedMesg;

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
