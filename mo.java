/* PROGRAM TO ILLUSTRATE METHOD OVERLOADING CONCEPT */
class over
{
void test()
{
System.out.println("no parameters");
}
void test(int a)
{
System.out.println("a= "+a);
}
void test(int a,int b)
{
System.out.println("a= "+a);
System.out.println("b= "+b);
}
void test(double a)
{
System.out.println("a= "+a);
}
}
class mo
{
public static void main(String args[])
{
over ol=new over();
ol.test();
ol.test(10);
ol.test(20,20);
ol.test(1211,1257);
ol.test(143.1157);
}
}
