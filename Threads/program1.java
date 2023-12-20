
class Student extends Thread
{
    public void run()
    {
        for( int i = 0 ; i < 5 ; i++ )
        {
            System.out.println( Thread.currentThread().getName()  + " is running with index " + i );
        }
    }
}
public class program1 {

    public static void main(String[] args) {
        
        Student r1 = new Student();
        r1.start();
        Student r2 = new Student();
        r2.start();
    }
}
