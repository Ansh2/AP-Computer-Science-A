package ObjectsAndMethods;

public class PersonalInformation {

	private String name;
	private String address;
	private int age;
	private String number;

	public PersonalInformation(String nm, String add, int ag, String nb) {

		this.name = nm;
		this.address = add;
		this.age = ag;
		this.number = nb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String toString() {

		return "Name: " + name + "\nAdress: " + address + "\nAge: " + age + "\nPhone Number: " + number;
	}

	public static void main(String[] args) {
		PersonalInformation one = new PersonalInformation("John", "7 Dogwood Drive", 29, "609-333-4567");
		PersonalInformation two = new PersonalInformation("Maria", "7 Dogwood Drive", 28, "609-652-5125");
		PersonalInformation three = new PersonalInformation("Emerson", "26 Elsie Court", 22, "609-124-9436");

		System.out.println(one.toString());
		System.out.println();
		System.out.println();
		System.out.println("Wife:  \n" + two);
		System.out.println();
		System.out.println();
		System.out.println("Friend:  \n" + three);

	}

}
