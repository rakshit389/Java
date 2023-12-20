public class program6
{  
    public static void main(String args[])throws Exception
    {  
         Runtime r = Runtime.getRuntime() ;
         System.out.println(r.totalMemory());
         System.out.println(r.freeMemory());
        
        for (int i = 0; i < 1000 ; i++) {
            new program6() ;
         }
       
         System.out.println(r.totalMemory());
         System.out.println(r.freeMemory());

         System.gc() ;

    }  
}