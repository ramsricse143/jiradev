/* PROGRAM TO ILLUSTRATE INTERFACE EXTEND CONCEPT */
interface a
{
void meth1();
void meth2();
}
interface b extends a
{
void meth3();
}
class imp implements b
{
public void meth1()
{
System.out.println("THIS IS METHOD1 ");
}
public void meth2()
{
System.out.println("THIS IS METHOD2 ");
}
public void meth3()
{
System.out.println("THIS IS METHOD3 ");
}
}
class intextended
{
public static void main(String args[])
{
a A=new imp();
A.meth1();
A.meth2();
b B=new imp();
B.meth3();
}
}