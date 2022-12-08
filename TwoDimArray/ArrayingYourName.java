package TwoDimArray;

public class ArrayingYourName {

	private String[][] arr;

	public ArrayingYourName(String input) {
		int c = 4;
		int r = 0; 
		if (input.length() % 4 == 0) {
			r = (int) (input.length() / 4.0 + 0.5);
		} else {
			r = (int) (input.length() / 4.0 + 1.5);
		}

		arr = new String[r][c];
		int i = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[0].length; column++) {
				if (i < input.length()) {
					arr[row][column] = input.substring(i, i + 1);
					i++;
				} else {
					arr[row][column] = "*";
				}
			}
		}

	}

	public String toString() {
		String accumulator = "";
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				accumulator += arr[row][col] + " ";

			}
			accumulator += "\n";
		}
		return accumulator;
	}

	public static void main(String[] args) {
		ArrayingYourName one = new ArrayingYourName("CHRIS BEASELY");
		System.out.println(one);
	}

}
