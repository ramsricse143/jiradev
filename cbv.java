/*PROGRAM TO ILLUSTRATE CALL BY VALUE CONCEPT */
class test1
{
void meth(int i,int j)
{
i*=2;
j/=2;
}
}
class cbv
{
public static void main(String args[])
{
test1 t=new test1();
int a=15,b=20;
System.out.println("a and b before calling "+a+"  "+b);
t.meth(a,b);
System.out.println("a and b after calling "+a+"  "+b);
}
}