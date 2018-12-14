/* PROGRAM TO CREATE USER DEFINED EXCEPTION "MYEXCEPTION" */
class MyException extends Exception
{
int x;
MyException(int a)
{
x=a;
}
public String toString()
{
return "MyException[" + x + "]";
}
}
class check
{
public void compute(int y) throws MyException
{
int a=y;
System.out.println("called compute[" + y + "]");
if(a>10)
throw new MyException(y);
System.out.println("normal exit");
}
}
class myexe
{
public static void main(String args[])
{
check c=new check();
try
{
c.compute(1);
c.compute(20);
}
catch(MyException e)
{
System.out.println("caught : " + e);
}
}
}
