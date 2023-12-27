import java.util.* ;
public class treeSet {
    public static void main(String[] args) {
        
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(9);
        ts.add(11);
        ts.add(5);
        ts.add(1);
        ts.add(12) ;

        ts.pollFirst();
        System.out.println(ts);
        System.out.println( "Ceiling value " + ts.ceiling(11));
         System.out.println( "Higher value " + ts.higher(11));
          System.out.println( "Floor value " + ts.floor(11));
         System.out.println("lower value " + ts.lower(11));
        System.out.println(ts.subSet(1,9));
        TreeSet<Integer> ts1 = (TreeSet<Integer>) ts.descendingSet() ;
        System.out.println(ts1);
    }
}
