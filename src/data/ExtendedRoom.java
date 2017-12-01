package data;

public class ExtendedRoom extends Room{

	private boolean tv = true;
	private boolean wifi = true;
	private boolean balcony = false;
	
	public ExtendedRoom(int numberOfBeds, int floorNumber, String price, String name, boolean status) {
		super(numberOfBeds, floorNumber, price, name, status);
		// TODO Auto-generated constructor stub
	}

	public boolean isTv() {
		return tv;
	}
	public void setTv(boolean tv) {
		this.tv = tv;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isBalcony() {
		return balcony;
	}
	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}
}
