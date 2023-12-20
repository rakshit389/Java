class Student extends Thread 
{
    Student(String name)
    {
        super(name);
    }
    Student()
    {

    }
    public void run()
    {
        System.out.println("Current thread name : " + Thread.currentThread().getName() );
    }
}

class Teacher implements Runnable 
{
    public void run()
    {
        System.out.println("Current thread name : " + Thread.currentThread().getName() );
    }
}

public class program3 {
    public static void main(String[] args) {
        
        System.out.println("Current Thread "  + Thread.currentThread().getName() );
        Student s1 = new Student("First Thread student") ;
        Student s2 = new Student() ;
    
        s1.start();

        s2.setName("second thread student");
        s2.start();

        Thread t1 = new Thread( new Teacher() , "third thread teacher");
        t1.start();
 
    }
    
}
