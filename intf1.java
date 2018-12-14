/* PROGRAM USING INTERFACES */
interface callback
{
public void callback(int p);
}

class client implements callback
{
  public void callback(int p)
  {
   System.out.println("callback called with "+p);
   }

   void noninterfacemethod()
  {
   System.out.println("call that implemented interfaces "+"may also define other members too");
  }
}
class intf1
{
public static void main(String args[])
{
callback c=new client();
c.callback(10);
client c1=new client();
c1.noninterfacemethod();
}
}
