package exam2017;

public interface Encryptable {
	
	public int getMesgType();
	public void setMesgType(int mesgType);
	
	public String getDecryptedMesg();
	public byte[] getEncryptedMesg();
	public void setEncryptedMesg();
	
	public boolean isEncrypted();
	public void setEncrypted(boolean isEncrypted);

}
