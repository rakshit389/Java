import java.util.* ;

public class linkedHashMap {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer,String> mp = new LinkedHashMap<>();
        mp.put(7, "India");
        mp.put(1,"USA");
        mp.put(2,"Russia");
        mp.put(3,"UK");
        mp.put(4,"China");
        mp.put(5,"Australia");
        mp.put(6,"Jeramny");

        System.out.println(mp);
        for( Map.Entry<Integer,String> it : mp.entrySet() )
        {
            System.out.println( it.getKey() + ": " + it.getValue() );
        }
    }
    
}
