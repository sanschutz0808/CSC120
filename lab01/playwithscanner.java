import java.util.*;

public class PlayWithScanner 
{
    public static void main( String[] args ) 
    {
        Scanner mykeyboard = new Scanner(System.in);
        System.out.print( "Enter a String and hit return: " );
        String input;
        
        
        input = mykeyboard.nextLine();    

        System.out.println( "charAt" );
        for(int i = 0; i< input.length() ; i++)
        {
            System.out.println(i + ": " + input.charAt(i));
        }

        System.out.print( "The reverse: " );

        String reverse="";
        for(int i = input.length()-1; i>0; i--)
        {
            reverse+=(input.charAt(i));
        }
        System.out.println( reverse );

        System.out.print( "Enter position: " );
            Scanner enter = new Scanner(System.in);
        int position = enter.nextInt();
        
        String prefix = input.substring(0,position);
        String suffix = input.substring (position);


        System.out.print( "The prefix: " );
            System.out.println(prefix);
        System.out.print( "The suffix: " );
            System.out.println(suffix);

        System.out.print( "Enter pattern: " );            
        Scanner enter1 = new Scanner(System.in);
        String pattern = enter1.nextLine();
        int count = 0;
        
        for(int i = 0; i<= input.length(); i++)
        {
            count += checkOccurrences(input, pattern, i);
        }

        System.out.print( "The number of occurrences: " );
        System.out.println( count );
    }

    public static int checkOccurrences(String input, String pattern, int position )
    {
        int diff = input.indexOf(pattern, position) - position;
        int diffSq = (diff * diff);
        double result1 = Math.signum(diffSq);
        int result2 = (int)result1;
        return 1-result2;
    }


}

