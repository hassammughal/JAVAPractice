package practice;
import java.util.Scanner;

public class OddnEven {

	private static int input;
	private static Scanner scan;
	private static int[] nums;
	private static int even,odd;
	
	public static void main(String[] args) {
		System.out.println("Get the number of Even and Odds from your Specified Range for Free! :D");
		System.out.println("Please enter the amount of numbers you want to store in a box of Array!");
		scan = new Scanner(System.in);
		input = scan.nextInt();
		addValues(input);
		findEvenOdd();
	}
	
	public static void addValues(int num) {
		nums = new int[num];
		for(int i = 0; i<nums.length; i++) {
			nums[i] = ++i;
		}
	}
	
	public static void findEvenOdd() {
		if(nums.length!=0) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[j]%2 == 0) {
					even++;
				}else {
					odd++;
				}
			}
			System.out.println("Total number of even numbers: " + even + ", Total number of odd numbers: " + odd);
		}
	}
}
