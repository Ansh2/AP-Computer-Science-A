package Arrays;

public class HotelRunner {

	public static void main(String[]args) {
		Hotel hilton = new Hotel(10);

		hilton.reserveRoom("Jones", 99);
		hilton.reserveRoom("Patel", 94.99); 
		hilton.reserveRoom("Garcia", 94.99); 
		hilton.reserveRoom("Chen", 94.99); 
		hilton.reserveRoom("Conner", 94.99, 8); 
		hilton.display(); 
		System.out.println("\nReserved Rooms Count: " + hilton.reservedRoomCount());
		System.out.println("\nAverage Reservation Rate: " + hilton.averageRoomRate());
	
	}
	

	
	

}
