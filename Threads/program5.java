import java.util.concurrent.Executors ; 
import java.util.concurrent.ExecutorService ;

class Teacher implements Runnable 
{
    public void run()
    {
        System.out.println("Teacher thread : " + Thread.currentThread().getName() );  
    }
}

public class program5 {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) 
        {  
            Teacher teacher = new Teacher() ;
            executor.execute(teacher); 
        }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    }
    
}
