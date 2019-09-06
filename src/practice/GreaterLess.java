package practice;
import java.util.Scanner;
public class GreaterLess {

	private static int greaterCount, lessCount, numRange, num;
	private static int[] nums;
	private static Scanner scan;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Number Comparison Program! Here you can compare any whole number from a range of whole numbers and find how many numbers are greater than this and how many are less");
		System.out.println("Kindly enter the range of number you want the number to be compared with!: ");
		scan = new Scanner(System.in);
		numRange = scan.nextInt();
		addValues(numRange);
		System.out.println("Kindly enter the number you want to compare!: ");
		num = scan.nextInt();
		findGreaterLess(num);
	}

	public static void addValues(int num) {
		nums = new int[num];
		for(int i = 0; i<nums.length; i++) {
			nums[i] = i;
		}
	}
	
	public static void findGreaterLess(int number) {
		if(nums.length != 0) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[j] == number) {
					System.out.println("Equivalent");
				}
				else if(nums[j] > number) {
					greaterCount++;
				} else {
					lessCount++;
				}
			}
			System.out.println("Number of numbers less than this number is: "+ lessCount + ". Number of numbers greater than this number is: " + greaterCount);
		}
	}
}
