/* PROGRAM USING CLASSES AND OBJECTS */
class rect
{
double len,bre;
}
class obj
{
public static void main(String args[])
{
rect r=new rect();
double a;
r.len=10;
r.bre=30;
a=r.len*r.bre;
System.out.println("Area= "+a);
}
}
