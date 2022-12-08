package APCOMSCITESTPREPBOOK;

public class Reservation {
	private String name;
	private int room;

	public Reservation(String guestName, int roomNumber) {
		name = guestName;
		room = roomNumber;
	}

	public int getRoomNumber() {
		return room;
	}

	public String toString() {
		return "Name: " + name + "\tRoom: " + room;
	}

}