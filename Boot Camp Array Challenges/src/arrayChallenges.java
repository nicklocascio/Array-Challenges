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
	static int randomNumber;
	public static int randomNumberGenerator()
		{
		randomNumber = (int)(Math.random()*90)+10;
		return randomNumber;
		}
	public static void main(String[] args)
		{
		// FIRST ONE
		// DONE
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("How many favorite sweets do you have?");
//		int numberOfFavoriteSweets = userInput.nextInt();
//		String[] sweets = new String[numberOfFavoriteSweets];			
//		Scanner moreUserInput = new Scanner(System.in);
//		for(int i = 0; i < numberOfFavoriteSweets; i++)
//			{
//			if(i == 0)
//				{
//				System.out.println("Name the first one.");
//				}
//			else
//				{
//				System.out.println("Enter another.");
//				}
//			sweets[i] = moreUserInput.nextLine();
//			}
//		System.out.println("Your favorite sweets are: ");
//		for(String hello : sweets)
//			{				
//			System.out.println(hello);
//			}
			
		// SECOND ONE
		// JUST FIGURE OUT COUNTER
//		int evenCounter = 0;
//		int oddCounter = 0;
//		int[]numbers = new int[8];
//		for(int i = 0; i < 8; i++)
//			{
//			inputNumber();
//			numbers[i] = number;
//			}
//		
//		for(int i = 0; i < numbers.length; i++)
//			{
//			if(i%2 == 0)
//				{
//				evenCounter += i;
//				}
//			else
//				{
//				oddCounter += i;
//				}			
//			}
//		System.out.println(evenCounter);
//		System.out.println(oddCounter);
//		for(int wassup : numbers)
//			{
//			System.out.println(wassup);
//			}
		
		// THIRD ONE	
		// ONLY NEED TO KNOW HOW TO INSERT BACKWARDS
//		int[]randomNumbers = new int[5];
//		for(int i = 0; i < 5; i++)
//			{
//			randomNumberGenerator();
//			System.out.println(randomNumber);
//			randomNumbers[i] = randomNumber;
//			}
//		for(int heyo : randomNumbers)
//			{
//			System.out.println(heyo);
//			}
		
		// FOURTH ONE
		// JUST NEED TO KNOW HOW TO INSERT BACKWARDS
		int[]fourDigits = new int[4];
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("Please enter a four digit number.");
		int fourDigitNumber = userInput3.nextInt();
		for(int i = 0; i < 4; i++)
			{
			fourDigits[i] = fourDigitNumber%10;			
			fourDigitNumber = fourDigitNumber / 10;			
			}
		for(int ay : fourDigits)
			{
			System.out.println(ay);
			}		
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