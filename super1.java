/* PROGRAM USING SUPER KEYWORD */
class  rec
{
double length,breadth;
rec()
{
length=10;
breadth=20;
}
rec(double l,double b)
{
length=l;
breadth=b;
}
double area()
{
return(length*breadth);
}
}
class rec1 extends rec
{
int i;
rec1()
{
super();
i=5;
}
rec1(int x,int y)
{
super(x,y);
i=x;
}
}
class super1
{
public static void main(String args[])
{
rec r1=new rec();
System.out.println("area="+r1.area());
rec1 r2=new rec1(5,10);
System.out.println("area="+r2.area());
System.out.println("value of r2="+r2.i);
}
 }
