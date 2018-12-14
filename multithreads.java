/* PROGRAM  TO ILUSTRATE MULTIPLE THREADS CONCEPT */
class NewThread implements Runnable
{
String name;
Thread t;
NewThread(String threadname)
{
name=threadname;
t=new Thread(this,name);
System.out.println("newthread:"+t);
t.start();
}
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println(name+": "+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("childthread intrrupted");
}
System.out.println(name+" exiting");
}
}
class multithreads
{
public static void main(String args[])
{
new NewThread("one");
new NewThread("two");
new NewThread("three");
try
{
Thread.sleep(10000);
}
catch(InterruptedException e)
{
System.out.println("mainthread intrrupted");
}
System.out.println("mainthread exiting");
 }
 }
