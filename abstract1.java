/*PROGRAM TO ILLUSTRATE ABSTRACT CLASS */
abstract class A
{
abstract void show();
void print()
{
System.out.println("WELCOME");
}
}
class B extends A
{
void show()
{
System.out.println("TO SBIT");
}
}
class abstract1
{
public static void main(String args[])
{
B b=new B();
b.print();
b.show();
}
}

