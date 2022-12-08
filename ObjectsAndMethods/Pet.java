package ObjectsAndMethods;

import java.util.Scanner;

public class Pet {

	private String name;
	private String type;
	private int age;

	public Pet() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		Pet one = new Pet();

		System.out.print("Enter Name of Pet ----> ");
		String name = console.nextLine();

		System.out.print("\nEnter Type of Pet ---->  ");
		String type = console.nextLine();

		System.out.print("\nEnter Age of Pet ----> ");
		int age = console.nextInt();

		one.setName(name);
		one.setType(type);
		one.setAge(age);

		System.out.println();
		System.out.println();
		System.out.println("Information of User Dog");
		System.out.println("=====================");
		System.out.println("Pet Name  = " + one.getName());
		System.out.println("Pet Type = " + one.getType());
		System.out.println("Pet Age = " + one.getAge());

	}

}
