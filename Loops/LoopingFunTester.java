package Loops;

public class LoopingFunTester {
	// put this in your main method

	public static void primeNumberList(int n) {

		for (int i = 1; i < n; i++) {
			if ((n % i == 0)) {

			}
			System.out.print(i + ", ");
		}
		System.out.println(n);

	}

	public static int sumInts(int n) {

		int sum = 0;
		for (int i = n; i >= 1; i--) {
			sum += i;

		}
		return sum;

	}

	public static long factorial(int n) {

		long factorial = 1;
		for (long i = n; i >= 1; i--) {

			factorial *= i;

		}
		return factorial;

	}

	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int n) {

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				return false;
			}

		}
		return true;

	}

	public static int lcm(int firstnum, int secondnum) {
		for (int i = 1; i < secondnum; i++) {
			if ((firstnum * i) % secondnum == 0) {
				return firstnum * i;
			}

		}
		return firstnum * secondnum;
	}

	public static int gcf(int a, int b) {

		int loopcount = 1;
		int holdlargestfactor = 1;
		int minimum = Math.min(a, b);
		while (loopcount <= minimum) {
			if (a % loopcount == 0 && b % loopcount == 0) {
				holdlargestfactor = loopcount;

			}
			loopcount++;
		}
		return holdlargestfactor;

	}

	public static int sumDigits(int n) {

		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n /= 10;
		}
		return sum;

	}

	public static int reverseNum(int n) {

		int reversed = 0;
		while (n != 0) {
			reversed = reversed * 10 + (n % 10);
			n /= 10;
		}
		return reversed;

	}

	public static void coinTrials(int n) {
		int heads = 0;
		int tails = 0;
		for (int i = 0; i <= n; i++) {
			int x = (int) (Math.random() * 2);
			if (x == 0) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Heads is: " + heads);
		System.out.println("Tails is: " + tails);

	}

	public static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;

	}

	public static void fibonacci(int n) {

		int current = 1;
		int temp = 0;
		int last = 0;
		System.out.print(1);
		for (int i = 1; i < n; i++) {
			temp = last + current;
			current = last;
			System.out.print(", " + temp);
			last = temp;
		}
		System.out.println();

	}

	public static boolean isPerfect(int n) {
		int sumOfFactors = 0;
		int factor = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				factor = i;
				sumOfFactors += factor;

			}
		}
		if (sumOfFactors == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void primeFactorization(int n) {
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.print(n + ", ");
			}
		}

	}

	public static int binary(int n) {
		String binary = "";
		while (n < 0) {
			int remainder = n % 2;
			binary = remainder + binary;
			n = n / 2;
		}
		return Integer.valueOf(binary);

	}

	public static void pyramid(int n) {
		int i = 1;
		int j = 0;
		int increment = 1;
		int copy = n;

		for (int x = 1; x <= n; x++) {

			for (i = 1; i <= copy; i++) {
				System.out.print(" ");
			}
			for (j = 1; j <= increment; j++) {
				System.out.print("*");
			}
			copy--;
			increment += 2;
			System.out.println();
		}
	}

	public static String printFactors(int n) {
		String factors = "";
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors += (i + " ");
			}
		}
		return factors;

	}

	public static void main(String[] args) {
//		System.out.println("#15 - Binary of 122:  " + binary(122));
//		System.out.println("\n#10 - Coin trials:  ");
//		coinTrials(100);
//		System.out.println("\n#11 - CountDigits of 23456:  " + countDigits(23456));
//		System.out.println("\n#3 - Factorial of 10:  " + factorial(10));
//		System.out.println("\n#12 - Fibonacci of 10:  ");
//		fibonacci(10);
//		System.out.println("\n\n#7 - gcf of 32 & 80:  " + gcf(32, 80));
//		System.out.println("\n#4 - isEven of 62875:  " + isEven(62875));
//		System.out.println("#4 - isEven of 62878:  " + isEven(62878));
//		System.out.println("\n#13 - isPerfect of 28:  " + isPerfect(28));
//		System.out.println("#13 - isPerfect of 30:  " + isPerfect(30));
//		System.out.println("\n#5 - isPrime of 30:  " + isPrime(30));
//		System.out.println("#5 - isPrime of 31:  " + isPrime(31));
//		System.out.println("\n#6 - lcm of 32 & 80:  " + lcm(32, 80));
//		System.out.println("\n#14 - Prime Factorization of 112:  ");
//		primeFactorization(112);
//		System.out.println("\n\n#1 - Prime number list for 100:  ");
//		primeNumberList(100);
//		System.out.println("\n\n#9 - Reverse of 1358642:  " + reverseNum(1358642));
//		System.out.println("\n#16 - Pyramid - 6 high:  ");
//		pyramid(6);
//		System.out.println("\n#8 - sum digits of 24678:  " + sumDigits(24678));
//		System.out.println("\n#2 - sum of ints up to 10:  " + sumInts(10));

	}
}
