/*PROGRAM TO FIND THE AREA OF A RECTANGLE USING CLASSES AND METHODS WITH NO RETURN VALUE */
class rec
{
int len,bre;
void area()
{
System.out.println("the area of rectangle is "+(len*bre));
}
}
class class1
{
public static void main(String args[])
{
rec r1=new rec();
r1.len=10;
r1.bre=20;
r1.area();
}
}