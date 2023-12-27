import java.util.* ;
public class linkedlistHashSet {
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>() ;
        ls.add(10);
        ls.add(9);
        ls.add(4);
        ls.add(40);
        ls.add(100);
        ls.add(10);
        System.out.println(ls);

        ls.remove(40);
        Iterator<Integer> itr = ls.iterator();
        while( itr.hasNext() )
        {
            System.out.println( itr.next() );
        }


        
    }
    
}
