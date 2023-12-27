import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> q = new PriorityQueue<Integer>() ;
        q.add(10);
        q.add(20);
        q.add(60);
        q.add(40);
        q.add(5);

        System.out.println(q);
        for( Integer it : q )
        {
            System.out.print( it +  " ");
        }
        System.out.println();
        q.remove();
        
        for( Integer itr : q )
        {
            System.out.println( itr + " ");
        }
        System.out.println();
        System.out.println("Peek element of queue " + q.peek() );

       
         
    }
    
}
