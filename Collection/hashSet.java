import java.util.* ;
public class hashSet {
    public static void main(String[] args) {

        HashSet<Integer> st = new HashSet<Integer>();
        st.add(10);
        st.add(5);
        st.add(20);
        st.add(15);
        st.add(30);
        st.add(25);
        st.add(10);

        System.out.println(st);
        st.remove( 10);
        Iterator<Integer> itr = st.iterator() ;
        while( itr.hasNext() )
        {
            System.out.print( itr.next() + " ");
        }
        System.out.println();
        System.out.println( st.contains(30) );
        System.out.println( st.size() );

    }
    
}
