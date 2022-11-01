class Th extends Thread
{
    Thread thread;
    String tn;
    Th( String s)
    {
        tn  = s;
        System.out.println(tn );
    }
    public void run()
    {
        System.out.println( tn );
        try
        {
            for(int i = 0; i < 5; i++)
            {
                System.out.println(tn + ", " + i);
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Exception in thread: " +  tn);
        }
        System.out.println("Thread " +  tn );
    }
    public void start ()
    {
        System.out.println("Start method " +  tn );
        if (thread == null)
        {
            thread = new Thread (this, tn );
            thread.start ();
        }
    }
}
public class Main
{
    public static void main(String args[])
    {
        Th thread1 = new Th ( "First Thread");
        thread1.start();

        Th thread2 = new Th ( "Second Thread");
        thread2.start();
    }
}
