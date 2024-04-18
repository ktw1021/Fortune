package furtune;

public class SipSung {
	
	private String sipsung;
	private int sipsung_num;
	
	public String getSipsung() {
		return sipsung;
	}
	public void setSipsung(String sipsung) {
		this.sipsung = sipsung;
	}
	public int getSipsung_num() {
		return sipsung_num;
	}
	public void setSipsung_num(int sipsung_num) {
		this.sipsung_num = sipsung_num;
	}
	public SipSung(String sipsung, int sipsung_num) {
		super();
		this.sipsung = sipsung;
		this.sipsung_num = sipsung_num;
	}
	@Override
	public String toString() {
		return  sipsung + ": " + sipsung_num + " ";
	}
	
	
}
