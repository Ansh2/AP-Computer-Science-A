package Arrays;

public class Hotel {
	// list[] stores reservations for each room. The index is the room number.
	// All elements are null at the beginning
	private Reservation[] list;

	public Hotel(int numbRooms) {
		list = new Reservation[numbRooms];
	}

	// Displays room numbers and reservation information.
	public void display() {
		System.out.println("\nCURRENT ROOM LIST & AVAILABILITY");
		for (int i = 0; i < list.length; i++) {
			System.out.println("Room: " + i + " " + list[i]);
		}

	}

	// returns true if room is occupied
	public boolean isOccupied(int room) {
		
		for (int i = 0; i < list.length; i++) {
			if (room == list[i].getRate()) {
				return true; 
			}
		}
		return false; 
				

	}

	// Assigns a new Reservation to the first available room.
	// Print out reservation with room number or indicate that hotel is full
	public void reserveRoom(String name, double rate) {
		
		for (int i = 0; i < list.length; i++) {
			if (this.list[i] == (null)) { //&& list[i].getName().equals(null)
				list[i] = new Reservation(name, rate);  
				System.out.println("Reservation confirmed:\n\t" + list[i] + "\tRoom: " + i);
				break;
			}
		}
	
				

	}

	// Assigns a new Reservation to an inputted room.
	// if room is occupied, find the first available room in the array
	// Print out reservation with room number or indicate that hotel is full
	public void reserveRoom(String name, double rate, int room) { 

		
		
		if (room > list.length - 1) {
			System.out.println("\nReservation for " + name + " could not be made \nfor room #" + room + ", as the highest room is "
					+ (list.length - 1) + "\nInstead, that reservation will be made\nfor the first available room.\n");
			reserveRoom(name, rate); 
			
		} else if (list[room] != null) {
			System.out.println("\nSorry, this room is already taken by " + list[room].getName() 
					+ ".\nTherefore, you will be assigned to the next room.\n\n");
			reserveRoom(name, rate); 
		} else { 
			list[room] = new Reservation(name, rate); 
			System.out.println("Reservation confirmed:\n\t" + list[room] + "\tRoom: " + room);
		}
		
			
		
	}

	// Find and return number of rooms with a reservation
	public int reservedRoomCount() {
		
		int counter = 0; 		
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				counter++; 							
			}
		}
		
		return counter; 

	}
	
	// find and return the average room rate of the occupied rooms.
	public double averageRoomRate() {
		
		double sum = 0; 	
		int counter = 0; 
		for (int i = 0; i < this.list.length; i ++) {
			
			if (list[i] != null) {
				sum += list[i].getRate();
				counter++;
			}
			
		}
		return (int) ((sum / counter) * 100 + 0.5) / 100.0;
					

	}
}



