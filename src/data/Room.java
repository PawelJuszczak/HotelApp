package data;



public class Room {
	private int numberOfBeds;
	private String standardLevel;
	private int floorNumber;
	private String price;
	private String name;
	private boolean status;
	
	public Room(int numberOfBeds, String standardLevel, int floorNumber, String price, 
			String name, boolean status){
		this.numberOfBeds = numberOfBeds;
		this.standardLevel = standardLevel;
		this.floorNumber = floorNumber;
		this.price = price;
		this.name = name;
		this.status = status;	
	}
	public Room(Room room){
		this(room.getNumberOfBeds(), room.getStandardLevel(), room.getFloorNumber(), 
				room.getPrice(), room.getName(), room.isStatus());
	}
	public int getNumberOfBeds() {
		return numberOfBeds;
	}
	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}
	public String getStandardLevel() {
		return standardLevel;
	}
	public void setStandardLevel(String standardLevel) {
		this.standardLevel = standardLevel;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + floorNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfBeds;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((standardLevel == null) ? 0 : standardLevel.hashCode());
		result = prime * result + (status ? 1231 : 1237);
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
		Room other = (Room) obj;
		if (floorNumber != other.floorNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfBeds != other.numberOfBeds)
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (standardLevel == null) {
			if (other.standardLevel != null)
				return false;
		} else if (!standardLevel.equals(other.standardLevel))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	public void printStatus(){
		if(status == false){
			System.out.println("Room is available!");
		}else{
			System.out.println("Room is taken.");
		}
	}
	@Override
	public String toString() {
		StringBuilder print = new StringBuilder(32);
		print.append(getNumberOfBeds());
		print.append("\n");
		print.append(getStandardLevel());
		print.append("\n");
		print.append(getFloorNumber());
		print.append("\n");
		print.append(getPrice());
		print.append("\n");
		print.append(getName());
		print.append("\n");
		print.append(isStatus());
		return print.toString();
		
	}
	

}
