import java.util.* ;

public class treeMap {
    public static void main(String[] args) {
        
        TreeMap<Integer,String> tmp = new TreeMap<Integer,String>() ;
        tmp.put(98,"Physics");
        tmp.put(90,"Chemistry");
        tmp.put(85,"Maths");
        tmp.put(92,"English");
        tmp.put(89,"Hindi");

        System.out.println(tmp);
        for( Map.Entry<Integer,String> it :tmp.entrySet() )
        {
            System.out.print( "Marks: " + it.getKey() +  ": " + it.getValue() );
        }
        System.out.println();

        System.out.println( tmp.higherKey(87) );
        System.out.println( tmp.lowerKey(87));
        System.out.println( tmp.floorEntry(85));
        System.out.println( "Sub Map " + tmp.subMap(85,95));
        System.out.println("Head map " + tmp.headMap(90));
        System.out.println("Tail map " +tmp.tailMap(92));
    }

    
}
