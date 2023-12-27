class Shared 
{
    synchronized void printFunction(int n, String s )
    {
        for( int i = 0 ; i < n ; i++ )
        {
            System.out.println(s + " " + i );
        }
    }
}

class Student implements Runnable 
{
    int n ;
    String s ;
    Shared sh ;
    Student(int n , String s , Shared obj )
    {
        this.n = n ;
        this.s = s ;
        this.sh = obj ;
    }
    public void run()
    {
        sh.printFunction(n , s);
    }
}
class Teacher implements Runnable 
{
    int n ;
    String s ;
    Shared sh ;
    Teacher(int n , String s , Shared obj )
    {
        this.n = n ;
        this.s = s ;
        this.sh = obj ;
    }
    public void run()
    {
        sh.printFunction(n , s);
    }
}



public class program8 {

    public static void main(String[] args) {

        Shared obj1 = new Shared() ;
        Shared obj2 = new Shared() ;
        Thread s1 = new Thread( new Student(5,"S1", obj1) );
        Thread t1 = new Thread( new Teacher(10 , "S2", obj2)) ;
        s1.start();
        t1.start();
    }
    
}
