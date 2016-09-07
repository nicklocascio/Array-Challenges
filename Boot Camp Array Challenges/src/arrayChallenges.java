import java.util.Scanner;

public class arrayChallenges
	{
	static int number;
	public static int inputNumber()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number.");
		number = userInput.nextInt();
		return number;
		}
	public static void main(String[] args)
		{
		// FIRST ONE
		// ASK THE TYPE OF SWEET
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("How many favorite sweets do you have?");
//		int favoriteSweets = userInput.nextInt();
//		for(int i = 0; i < favoriteSweets; i++)
//			{	
//			int[]sweets;
//			sweets = new int[i];				
//			for(int hello : sweets)
//				{
//				System.out.println(hello);
//				}
//			}
			
		// SECOND ONE
		inputNumber();
		int[]numbers;
		numbers = new int[8];
		// MAKE THIS IN A FOR LOOP
		numbers[0] = number;
		inputNumber();
		numbers[1] = number;
		inputNumber();
		numbers[2] = number;
		inputNumber();
		numbers[3] = number;
		inputNumber();
		numbers[4] = number;
		inputNumber();
		numbers[5] = number;
		inputNumber();
		numbers[6] = number;
		inputNumber();
		numbers[7] = number;
		int evenCounter = 0;
		int oddCounter = 0;
		//
		for(int i = 0; i < numbers.length; i++)
			{
			if(i%2 == 0)
				{
				evenCounter = evenCounter + number;
				}
			else
				{
				oddCounter = oddCounter + number;
				}
			System.out.println(evenCounter);
			System.out.println(oddCounter);
			}
//		for(int wassup : numbers)
//			{
//			System.out.println(wassup);
//			}
		}
	}



//NOTES
//int num = 45453
//int digit = num%10
//int digit = num/10
//Put in loop for #4
//for(String moose : studentList
//	{
//	System.out.println(moose);		
//	}
//That is a for each loop