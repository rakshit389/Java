import java.util.* ;
public class map {
    public static void main(String[] args) {
        
        Map<Integer,String> mp = new HashMap<Integer,String>() ;
       
        mp.put(18,"Virat Kohli");
        mp.put(45,"Rohit Sharma");
        mp.put(7,"Dhoni");
        mp.put(77,"Subhman");
        mp.put(18,"Kohli");

        System.out.println(mp);
        
        Set<Integer> st = mp.keySet() ;
        Iterator<Integer> it = st.iterator();
        while( it.hasNext() )
        {
            System.out.println( mp.get(it.next()));
        }

        for( Map.Entry<Integer,String> itr : mp.entrySet() )
        {
            System.out.print( "key " + itr.getKey() + " :" + " Value " + itr.getValue() + "  ");
        }

        System.out.println( mp.containsValue("Kohli"));
        System.out.println(mp.containsKey(45));
        mp.replace(18,"King Kohli");
        System.out.println(mp.entrySet());
        
        mp.replaceAll( (k,v) -> "BCCI" );
        System.out.println(mp);
        
        

    }
    
}
