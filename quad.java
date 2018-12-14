/*PROGRAM TO FIND THE ROOTS OF A GIVEN QUADRATIC EQUATION */
class quad
{
public static void main(String ars[])
{
int a,b,c,d;
double d1,d2,e;
a=Integer.parseInt(ars[0]);
b=Integer.parseInt(ars[1]);
c=Integer.parseInt(ars[2]);
System.out.println("EQUATION IS: "+a+"X2+"+b+"X+"+c+"=0");
if(c==0)
{
System.out.println("ROOT IS "+(-c/b));
}
else
{
d=(b*b)-(4*a*c);
e=Math.sqrt(d);
System.out.println("DISCREMENENT IS = "+d);
if(d<0)
{
System.out.println("NO REAL SOLUTION ");
}
if(d>0)
{
System.out.println("ROOTS ARE REAL AND DISTINCT ");
System.out.println("ROOTS ARE ");
d1=((-b+e)/(2*a));
d2=((-b-e)/(2*a));
System.out.println(d1);
System.out.println(d2);
}
if(d==0)
{
System.out.println("ROOTS ARE REAL AND EQUAL ");
System.out.println("ROOTS ARE ");
d1=((-b+e)/(2*a));
d2=d1;
System.out.println(d1);
System.out.println(d2);
}
}
}
}
