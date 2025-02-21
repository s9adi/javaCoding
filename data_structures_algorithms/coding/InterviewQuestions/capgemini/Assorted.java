package coding.InterviewQuestions.capgemini;

public class Assorted {

	public static void main(String[] args) {
		// int[] array = {89,23,45,29,39};
		// SmallestLargest(array);

		printFibonacci();

	}

	private static void SmallestLargest(int[] array) {
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			smallest = Math.min(array[i], smallest);
			largest = Math.max(array[i], largest);
		}

		System.out.println("Smallest is " + smallest + "\nLargest is " + largest);
	}

	private static int fibonacciUsingRecursion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fibonacciUsingRecursion(n - 1) + fibonacciUsingRecursion(n - 2);
		}
	}

	private static void printFibonacci() {
		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacciUsingRecursion(i) + "\t");
		}
	}

	private static void fibonacci(int n) {
		int first = 1;
		int second = 1;
		int output  = 0 ;
		for (int i = 3 ; i < n ; i++) {
			output = first + second ;
			first = second ;
			second = output;
		}
	}

}
