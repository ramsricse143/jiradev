/* PROGRAM TO ILLUSTRATE INHERITANCE CONCEPT */
class A
{
int i,j;
void show()
{
System.out.println(" i and j are "+i+"   "+j);
}
}
class B extends A
{
int k;
void showk()
{
System.out.println("k= "+k);
}
void sum()
{
System.out.println(" SUM of i,j and k is= "+(i+j+k));
}
}
class inher
{
public static void main(String args[])
{
A a=new A();
B b=new B();
a.i=3;
b.j=4;
System.out.println("SUPERCLASS CONTENTS ARE ");
a.show();
b.i=10;
b.j=5;
b.k=6;
System.out.println("SUBCLASS CONTENTS ARE ");
b.show();
b.showk();
b.sum();
}
}




