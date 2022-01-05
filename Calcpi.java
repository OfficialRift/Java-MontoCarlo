public class Calcpi{
    public static void main(String[] args){
        int i;
        int nThrows = 0;
        int nSuccess = 0;

        double x, y; 

        for (i = 0; i < 1000000 ; i++)
        {
           x = Math.random();      // Simulate random Darts
           y = Math.random();      // random between 1 and 0 (exclusive)
           nThrows++;

           if ( x*x + y*y <= 1 )
           {
                nSuccess++;
           }
        
           System.out.println("Pi = " + 4*(double)nSuccess/(double)nThrows );
        }

        System.out.println("nThrow = " + nThrows );
        System.out.println("nSuccess = " + nThrows );
    }
}