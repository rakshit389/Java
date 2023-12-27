import java.util.* ;
public class stack {

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<Integer>() ;
        st.push(100);
        st.push(80);
        st.push(60);
        st.push(40);
        st.push(20);
        st.push(10001);
        st.addFirst(0);
       // st.add(0,99);

        System.out.println( "index of searched element " + st.search(80) );
        System.out.println(st);
        st.forEach( n -> {
            System.out.print(n + " ");
        }
        );
         System.out.println();

        for( Integer itr : st )
        {
            System.out.print(itr + " ");
        }

        Iterator<Integer> itr = st.iterator() ;
        while( itr.hasNext() )
        {
            System.out.println( itr.next() );
            itr.remove();
        }
        System.out.println(st );
    }
    
}
