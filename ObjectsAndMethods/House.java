package ObjectsAndMethods;

public class House {
	
	public static void main(String[] args) {
		
		
		int Shahkids = 3; 
		int Caokids = 4; 
		int Bitnerkids = 2; 
		
		int Shahaddress = 402; 
		int Caoaddress = 404; 
		int Bitneraddress = 398; 
		
		
		String family1 = "Shah     "; 
		String family2 = "Cao      "; 
		String family3 = "Bitner   ";
		
		String family = "FAMILY: "; 
		String kids = "# OF KIDS: "; 
		String address = "ADDRESS: "; 
		String dogcat = "DOG/CAT: "; 
		String streetname = " Oak Street     "; 
		String none = "none"; 
		
		System.out.println(family + family1 + kids  + Shahkids +  "    "  
				+ address + Shahaddress + streetname + dogcat + "Fluffy, Rex");
		
		System.out.println(family  + family2 + kids  + Caokids + "    " 
				+ address + Caoaddress + streetname +  dogcat + none);
		
		System.out.println(family  + family3 + kids  + Bitnerkids  + "    "
				+ address + Bitneraddress + streetname +  dogcat + none);
		
	}

}
