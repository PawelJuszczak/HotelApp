package utils;

import data.Hotel;
import data.Room;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
	private Scanner sc;
	
	public DataReader(){
		sc = new Scanner(System.in);
	}
	public void readerClose(){
		sc.close();
	}
	public int getInt() throws NumberFormatException{
		int number = 0;
		try{
			number = sc.nextInt();
		}catch(InputMismatchException e){
			throw new NumberFormatException("Incorrect format of inserted number.");
		}finally{
			sc.nextLine();
		}
		return number;
	}
	public Room readAndCreateRoom(){
		System.out.println("Set number of beds: ");
		int numberOfBeds = sc.nextInt();
		sc.nextLine();
		System.out.println("Set floor number: ");
		int floorNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Set price: ");
		String price = sc.nextLine();
		System.out.println("Set name: ");
		String name = sc.nextLine();
		System.out.println("Set status: ");
		boolean status = sc.nextBoolean();
		
		return new Room(numberOfBeds, floorNumber, price, name, status);
	}
	public Hotel readAndCreateHotel(){
		System.out.println("Insert number of rooms in your Hotel: ");
		int numberOfRooms = sc.nextInt();
		sc.nextLine();
		Room[] rooms = new Room[numberOfRooms];
		System.out.println("Hotel created!");
		return new Hotel(numberOfRooms, rooms);
	}
}
