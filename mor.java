/* PROGRAM TO ILLUSTRATE METHOD OVERRIDING CONCEPT */
class A
{
int i,j;
A(int a,int b)
{
i=a;
j=b;
}
void show()
{
System.out.println(" i and j are "+i+"   "+j);
}
}
class B extends A
{
int k;
B(int a,int b,int c)
{
super(a,b);
k=c;
}
void show()
{
super.show();
System.out.println("k= "+k);
}
}
class mor
{
public static void main(String agrs[])
{
A a=new A(1,2);
B b=new B(1,2,3);
a.show();
b.show();
}
}

