//. Implement Multithreading by creating two threads-one thread with the name
//CSthread and the other thread named ITthread. Each thread should display its
//respective name and execute after a gap of 500 milliseconds. Each thread should
//also display a number indicating the number of times it got a chance to execute. 
class CSthread extends Thread{
   public void run()
   { 
      for(int i=1;i<40;i++){ 
         try{
         Thread.sleep(500);
     System.out.println("CS Thread ");  
         }
         catch(Exception e)
         {
            System.out.println(" Interrupted Exception ");
         }
   }
   }
 public void run(int t)
   { 
      for(int j=0;j<40;j++){ 
         try{
         Thread.sleep(500); 
         System.out.println("It tHread  ");
      }  
      catch(Exception e)
         {
            System.out.println(" Interrupted Exception ");
         }
      }
 }
} 
public class Labq1 { 
   public static void main (String []args)
   {
      CSthread th1=new CSthread();
      th1.start();
      CSthread th2=new CSthread();
      th2.run(100);
   }
   
}
