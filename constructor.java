/* PROGRAM TO FIND THE AREA OF A RECTANGLE USING CONSTRUCTORS WITH AND WITHOUT PARAMETERS */
class rec
{
double l,b;
rec()
{
l=10;
b=20;
}
rec(double le,double br)
{
l=le;
b=br;
}
double area()
{
return(l*b);
}
}
class constructor
{
public static void main(String args[])
{
rec r1=new rec();
rec r2=new rec(11.0,10.0);
System.out.println("AREA OF RECTANGLE IS= "+r1.area());
System.out.println("AREA OF RECTANGLE IS= "+r2.area());
}
}