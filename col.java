/*PROGRAM TO ILUUSTRATE CONSTRUCTOR OVERLODING CONCEPT */
class rec
{
double l,b;
rec()
{
l=10;
b=20;
}
rec(double len,double bre)
{
l=len;
b=bre;
}
rec(double le)
{
l=b=le;
}
double area()
{
return(l*b);
}
}
class col
{
public static void main(String args[])
{
rec r1=new rec();
rec r2=new rec(1211.0,1257.0);
rec r3=new rec(40.0);
System.out.println("AREA1=  "+r1.area());
System.out.println("AREA2= "+r2.area());
System.out.println("AREA3= "+r3.area());
}
}