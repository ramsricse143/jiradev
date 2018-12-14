/* PROGRAM TO ILLUSTRATE DYNAMIC METHOD DISPATCH CONCEPT */
class A
{
void callme()
{
System.out.println("FROM CLASS A");
}
}
class B extends A
{
void callme()
{
System.out.println("FROM CLASS B");
}
}
class C extends A
{
void callme()
{
System.out.println("FROM CLASS C");
}
}
class dmd
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();
A r;
r=a;
r.callme();
r=b;
r.callme();
r=c;
r.callme();
}
}

