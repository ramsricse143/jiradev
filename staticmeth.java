/* PROGRAM USING STATIC METHODS */
class staticdemo
{
static int a=10;
static int b=20;
static void print()
{
System.out.println("the value of a= "+a);
System.out.println("the value of b= "+b);
}
}
class staticmeth
{
public static void main(String args[])
{
staticdemo.print();
}
}
