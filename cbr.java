/*PROGRAM TO ILLUSTRATE CALL BY REFERENCE CONCEPT */
class test2
{
int a,b;
test2(int i,int j)
{
a=i;
b=j;
}
void meth(test2 t)
{
t.a*=2;
t.b/=2;
}
}
class cbr
{
public static void main(String args[])
{
test2 t1=new test2(11,57);
System.out.println("a and b before calling "+t1.a+"  "+t1.b);
t1.meth(t1);
System.out.println("a and b after calling "+t1.a+"  "+t1.b);
}
}