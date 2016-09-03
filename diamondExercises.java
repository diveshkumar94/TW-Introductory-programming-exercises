import java.util.Scanner;

class DiamondExercises {
    public static void main( String args[] ) throws Exception{
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        for( int i = 0; i < n; i ++ ) {
            for( int j = 0; j < n - i - 1; j ++ )
                System.out.print( " " );
            for( int j = 0; j <=2 * i; j ++ )
                System.out.print( "*" );
            System.out.println( "" );
        }
    }
}