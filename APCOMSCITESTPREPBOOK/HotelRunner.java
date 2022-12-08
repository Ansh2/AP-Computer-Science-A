package APCOMSCITESTPREPBOOK;

public class HotelRunner {

	public static void main(String[] args) {
		Hotel LocalInn = new Hotel();
		
		LocalInn.requestRoom("smith");
		LocalInn.requestRoom("hill");
		LocalInn.requestRoom("wang");
		LocalInn.requestRoom("chung");
		System.out.println(LocalInn);
		System.out.println();
		
		LocalInn.requestRoom("frieze");
		LocalInn.requestRoom("santiago");
		LocalInn.requestRoom("willard");
		System.out.println(LocalInn);
		System.out.println();
		
		Reservation smith = new Reservation("smith", 0);
		Reservation wang = new Reservation("wang", 2);
		LocalInn.cancelAndReassign(smith);
		System.out.println(LocalInn);
		System.out.println();
		
		LocalInn.cancelAndReassign(wang);
		System.out.println(LocalInn);

	}

}