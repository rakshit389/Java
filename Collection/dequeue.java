import java.util.* ;
public class dequeue {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>() ;
        dq.add(5);
        dq.add(10);
        dq.add(15);
        dq.addFirst(20);
        dq.addLast(25);
        System.out.println(dq);
        System.out.println("Peek element of this queue " + dq.peekLast() );

        dq.remove();
        dq.poll();
        
        for( Integer itr : dq )
        {
            System.out.println( itr + " ");
        }

    }
    
}
