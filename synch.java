/* PROGRAM USING SYNCHRONIZED KEYWORD */
class callme
{
synchronized void call(String msg)
{
System.out.print(">"+msg);
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("INTERRUPT");
}
System.out.println("<");
}
}
class caller implements Runnable
{
String msg;
callme target;
Thread t;
public caller(callme targ,String s)
{
target=targ;
msg=s;
t=new Thread(this);
t.start();
}
public void run()
{
target.call(msg);
}
}
class synch
{
public static void main(String args[])
{
callme target=new callme();
caller ob1=new caller(target,"HELLO");
caller ob2=new caller(target,"SYNCHRONIZED");
caller ob3=new caller(target,"WORLD");
try
{
ob1.t.join();
ob2.t.join();
ob3.t.join();
}
catch(InterruptedException e)
{
System.out.println("MAIN INTERRUPT ");
}
}
}