package data;



public class Hotel {
	
	private Room[] rooms;
	private int numberOfRooms;
	
	public Room[] getRooms() {
		return rooms;
	}
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public Hotel(int numberOfRooms, Room[] rooms){
		this.numberOfRooms = numberOfRooms;
		this.rooms = rooms;
	}
	
	
	
}
