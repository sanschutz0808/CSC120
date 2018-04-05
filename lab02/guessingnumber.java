import java.util.*;

public class GuessingNumber 
{
    public static void main( String[] args ) 
    {
        playGame( 2000, 10 );
    }

    public static void playGame( int maximum, int noRounds ) 
    {
        Scanner mykeyboard = new Scanner(System.in);

        int guess = -1;
        int secret = 1 + (int)( Math.random() * maximum );
        System.out.print( "---I have a number between 1 and " );
        System.out.println( maximum + "." );
        System.out.print( "---You can make up to " );
        System.out.println( noRounds + " guesses." );
        System.out.println( "---If your guess is incorrect, " );
        System.out.println( "---I will tell you whether the" + " guess is greater or smaller than my number." );

        //System.out.println(secret);

        System.out.print( "---Hit return to start: " );

        guess = mykeyboard.nextInt(); 

        for(int i=noRounds; i>0; i--)
        {
            
            if(guess==secret) 
            {
                System.out.println("Congrats! You guessed correctly!");    
                break;
            }
            else if(guess> secret)
            {
                System.out.println("Your guess is greater.");
            }
            else if(guess< secret)
            {
                System.out.println("Your guess is smaller.");
            }
            System.out.print("Enter your guess: ");
            guess = mykeyboard.nextInt();
             
        }
    }
}
≈
