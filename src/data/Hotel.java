package data;

public class Hotel {
	
	private int numberOfRooms;
	private int numberOfFloors;
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	public Hotel(){

	}
	public Hotel(int numberOfRooms, int numberOfFloors){
		this.numberOfRooms = numberOfRooms;
		this.numberOfFloors = numberOfFloors;
	}
	
}
