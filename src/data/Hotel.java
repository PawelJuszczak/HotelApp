package data;

import java.util.Scanner;

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
	public void createHotel(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number of rooms in your Hotel: ");
		numberOfRooms = sc.nextInt();
		rooms = new Room[numberOfRooms];
		System.out.println("Your hotel have " + numberOfRooms + " rooms.");
		sc.close();
	}
	
	
}
