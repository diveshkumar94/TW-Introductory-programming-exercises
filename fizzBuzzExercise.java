import java.util.Scanner;

class FizzBuzzExercise {
    public static void main( String args[] ) throws Exception{
        for( int i = 1; i <= 100; i ++ ){
            if(i%3==0||i*5==0){
                if(i%3==0)
                    System.out.print( "FIZZ" );
                if(i%5==0)
                    System.out.print( "BUZZ" );
                System.out.println( "" );
            }
            else
                System.out.println( i );
        }
    }
}