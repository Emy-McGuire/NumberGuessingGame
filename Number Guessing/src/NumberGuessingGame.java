import java.util.Scanner;

public class NumberGuessingGame
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
										
				System.out.println("What is your name?");
				
				String name = userInput.nextLine();
				
				System.out.println("Hello, " + name + "! Welcome to the Number Guessing Game! Would you like to play easy (1), or hard (2)?");
						
				int level = userInput.nextInt();
				
				int randomNumber = (int) (Math.round(Math.random()* 10 + 1));


				boolean num = true;

						while (num)
							{
								//Test
								
					System.out.println("Guess a number between 1 and 10!");

					int guess2 = userInput.nextInt();

							if (guess2 > randomNumber)
								{
								System.out.println("Too high!");
								}
						
							else if (guess2 < randomNumber)
								{
								System.out.println("Too low!");
								}

					
						if (guess2 == randomNumber)
							
							{
							  	num = false;

								System.out.println("Congratulations, " + name + "! You win!");
							}
							}
						
					
			}
		

	}
