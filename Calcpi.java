public class Calcpi{
    public static void main(String[] args){
        int points_total = 0;
        int points_inside = 0;

        double x, y; 

        for (int i = 0; i < 1000000 ; i++)
        {
           x = Math.random();      // Simulate random points
           y = Math.random();      // random between 1 and 0 (exclusive)
           points_total++;

           if ( x*x + y*y <= 1 )
           {
                points_inside++;
           }
        
           System.out.println("Pi = " + 4*(double)points_inside/(double)points_total);
        }
    }
}