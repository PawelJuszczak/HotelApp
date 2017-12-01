package data;



public class Room {
	private String name;
	private int numberOfBeds;
	private int floorNumber;
	private String price;
	private boolean status;
	private String roomNumber;
	
	public Room(String name,int numberOfBeds, int floorNumber, String price, 
			 boolean status, String roomNumber){
		this.numberOfBeds = numberOfBeds;
		this.floorNumber = floorNumber;
		this.price = price;
		this.name = name;
		this.status = status;
		this.roomNumber = roomNumber;
	}
	public Room(Room room){
		this(room.getName(), room.getNumberOfBeds(), room.getFloorNumber(), 
				room.getPrice(), room.isStatus(), room.getRoomNumber());
	}
	public int getNumberOfBeds() {
		return numberOfBeds;
	}
	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
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
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + floorNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfBeds;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((roomNumber == null) ? 0 : roomNumber.hashCode());
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
		if (roomNumber == null) {
			if (other.roomNumber != null)
				return false;
		} else if (!roomNumber.equals(other.roomNumber))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return  name + "\nNumber of beds: " + numberOfBeds + "\nFloor number: " + floorNumber + "\nPrice: " + price + "\nRoom number: " + roomNumber;
	}
	


	

}
