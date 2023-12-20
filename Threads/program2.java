import java.io.*;  
   
class ThreadJoin extends Thread  
{  
// overriding the run method  
    public void run()  
    {  
        for (int j = 0; j < 10; j++)  
        {  
            try  
            {  
                Thread.sleep(300);
                System.out.println("The current thread name is: " + Thread.currentThread().getName() + " " + j );  
            }  
        
            catch(Exception e)  
            {  
                System.out.println("The exception has been caught: " + e);  
            }  
        }  
    }  
}  
  
public class program2
{  
    // main method  
    public static void main (String argvs[])  
    {  
        ThreadJoin th1 = new ThreadJoin();  
        ThreadJoin th2 = new ThreadJoin();  
        ThreadJoin th3 = new ThreadJoin();  
         
        th1.start();  
           
        try  
        {  
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
            th1.join();  
        }  
        catch(Exception e)  
        {  
            System.out.println("The exception has been caught " + e);  
        }  
 
        th2.start();  
       
        try  
        {  
            System.out.println("The current thread name is: " + Thread.currentThread().getName());  
            th2.join();  
        }  
         
        catch(Exception e)  
        {  
            System.out.println("The exception has been caught " + e);  
        }  
     
        th3.start();  
    }  
} 