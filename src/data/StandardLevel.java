package data;

public class StandardLevel {
	private boolean wifi;
	private boolean tv;
	
	
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isTv() {
		return tv;
	}
	public void setTv(boolean tv) {
		this.tv = tv;
	}
	public StandardLevel(boolean wifi, boolean tv){
		this.wifi = wifi;
		this.tv = tv;
	}
	public StandardLevel(StandardLevel level){
		this(level.isWifi(), level.isTv());
	}
	public StandardLevel(){
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (tv ? 1231 : 1237);
		result = prime * result + (wifi ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StandardLevel other = (StandardLevel) obj;
		if (tv != other.tv)
			return false;
		if (wifi != other.wifi)
			return false;
		return true;
	}
	
	
}
