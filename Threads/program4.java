 
class Teacher implements Runnable 
{
    public void run()
    {
        for( int i = 0 ; i < 5 ; i++ ){
            System.out.println("Current thread name : " + Thread.currentThread().getName() + " " + i);
        }
    }
}

public class program4 {
    public static void main(String[] args) {
        
         

        Thread t1 = new Thread( new Teacher() , "First thread");
        Thread t2 = new Thread( new Teacher() , "Second thread");
        Thread t3 = new Thread( new Teacher() , "Third thread");
        
        System.out.println("First Second Third starting priority " + t1.getPriority() + " " + t2.getPriority() + " " +  t3.getPriority());
        t1.setPriority(10) ;
        t2.setPriority(1);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
 
    }
    
}
