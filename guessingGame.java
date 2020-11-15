import java.util.*;

public class guessingGame {
	public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      Random rand = new Random();
      int guess = -1;
      
      try {
         System.out.println("Would you like to play a game? y/n");
         String response = in.nextLine();

         while (response.equals("y"))
         {
            System.out.println("Great!\nI'll choose a number smaller than 100, and you guess it.");
            int randNum = rand.nextInt(100);
            System.out.println("...\n\nOkay! I am ready. Guess!");
            
            while (guess != randNum)
            {
               guess = in.nextInt();

               if (guess > randNum)
               {
                  System.out.println("Nope! That is too high. Try again.");
               }
               else if (guess < randNum)
               {
                  System.out.println("Wrongo. Too low. Guess again!");
               }
               else
               {
                  System.out.println("That's right!");
               }
            }

            response = in.nextLine();
         }

         System.out.println("See you later!");
      } finally {
         in.close();
      }
   }
}