/* PROGRAM TO DEMONSTRATE NESTED CLASSES */
class nested
{
int x=10;
class inner
{
void display()
{
System.out.println("x= "+x);
}
}
void test()
{
inner i=new inner();
i.display();
}
public static void main(String args[])
{
nested o=new nested();
o.test();
}
}
