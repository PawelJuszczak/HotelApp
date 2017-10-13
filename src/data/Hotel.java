package data;



public class Hotel {
	
	private Room[] rooms;
	private int numberOfRooms;
	private int roomNumber;
	
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
	public void addRoom(Room room){
		if(roomNumber < numberOfRooms){
			rooms[roomNumber] = room;
			roomNumber++;
		}else{
			System.out.println("Capacity of the created Hotel is full!");
		}
	}
	
	
	
}
