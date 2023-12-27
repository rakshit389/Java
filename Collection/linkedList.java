import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>() ;
        ll.add(10);
        ll.add(20);
        ll.add(0,5);
        ll.addLast(30);
        ll.addFirst(1);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);

        System.out.println("Either ll containes element 30 " + ll.contains(30 ) );
        System.out.println("First elem of ll " + ll.element());
         System.out.println(ll);
        System.out.println("First elem of ll " + ll.getFirst());
         System.out.println(ll);
        System.out.println("First elem of ll " + ll.get(0));
         System.out.println(ll);
        System.out.println("Last elem of ll " + ll.getLast());
         System.out.println(ll);
        System.out.println("First elem of ll " + ll.peek());
         System.out.println(ll);
        System.out.println("First elem of ll " + ll.peekFirst());
         System.out.println(ll);
        System.out.println("Last elem of ll " + ll.peekLast());
         System.out.println(ll);
        System.out.println("First elem of ll " + ll.poll());
         System.out.println(ll);
        System.out.println("First elem of ll " + ll.pollFirst());
         System.out.println(ll);
        System.out.println(ll.pollLast());
        ll.push(100);
        ll.push(200);
        ll.remove();
        System.out.println(ll);

    }   
}
