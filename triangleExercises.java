import java.util.Scanner;

class TriangleExercises {
    public static void main( String args[] ) throws Exception{
        System.out.println( "*" );
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        for( int i = 0; i < n; i ++ )
            System.out.print( "*" );
        System.out.println("");
        n = sc.nextInt();
        for( int i = 0; i < n; i ++ )
            System.out.println( "*" );
    }
}