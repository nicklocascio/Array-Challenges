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
		// ADD DIFFERENT QUESTIONS BASED ON SWEETS
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many favorite sweets do you have?");
		int numberOfFavoriteSweets = userInput.nextInt();
		String[] sweets = new String[numberOfFavoriteSweets];			
		Scanner moreUserInput = new Scanner(System.in);
		boolean namingSweets = true;
		for(int i = 0; i < numberOfFavoriteSweets; i++)
			{
			if(i == 0)
				{
				System.out.println("Name the first sweet.");
				}
			// ADD HERE
			sweets[i] = moreUserInput.nextLine();
			}
		System.out.println("Your favorite sweets are: ");
		for(String hello : sweets)
			{				
			System.out.println(hello);
			}
			
		// SECOND ONE
		int evenCounter = 0;
		int oddCounter = 0;
		int[]numbers = new int[8];
		System.out.println("You will be asked to input eight numbers.");
		for(int i = 0; i < 8; i++)
			{
			inputNumber();
			numbers[i] = number;
			}
		
		for(int i = 0; i < numbers.length; i++)
			{
			if(i%2 == 0)
				{
				evenCounter += numbers[i];
				}
			else
				{
				oddCounter += numbers[i];
				}			
			}
		System.out.println("The sum of the even numbers is: " + evenCounter);
		System.out.println("The sum of the odd numbers is: " + oddCounter);
		
		// THIRD ONE	
		int[]randomNumbers = new int[5];
		System.out.println("The random numbers are: ");
		for(int i = 0; i < 5; i++)
			{
			randomNumberGenerator();
			System.out.println(randomNumber);
			randomNumbers[4 - i] = randomNumber;
			}	
		System.out.println("The reversed random numbers are: ");
		for(int heyo : randomNumbers)
			{
			System.out.println(heyo);
			}
		
		// FOURTH ONE
		int[]fourDigits = new int[4];
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("Please enter a four digit number.");
		int fourDigitNumber = userInput3.nextInt();
		for(int i = 0; i < 4; i++)
			{
			fourDigits[i] = fourDigitNumber%10;			
			fourDigitNumber = fourDigitNumber / 10;			
			}
		System.out.println("The stripped digits in reverse order are: ");
		for(int ay : fourDigits)
			{
			System.out.print(ay);
			}		
		}
	}