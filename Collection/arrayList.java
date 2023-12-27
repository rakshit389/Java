import java.util.*;
public class arrayList 
{
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(90);
        list.add(100);
        list.add(50);
        list.add(70) ;

        Iterator<Integer> it = list.iterator() ;
        while( it.hasNext() )
        {
            System.out.print( it.next() + " ");
        }
        System.out.println();

        System.out.println(list.get(4));
        list.set(4,101);

        Collections.sort(list);

        for( Integer i : list )
        {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.sort( list , Collections.reverseOrder() );
        for( int i = 0 ;  i < list.size() ; i++ )
        {
            System.out.print( list.get(i) + " ");
        }
        System.out.println();

        int index = list.indexOf(50);
        System.out.println("Printing list in reveerse order");

        list.removeIf( data -> data == 101 );
        ListIterator<Integer>itr = list.listIterator(list.size());
        while( itr.hasPrevious() )
        {
            System.out.print( itr.previous() + " ");
        }




    }
}