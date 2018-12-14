/* PROGRAM TO FIND FIBONOCII SERIES USING FOR LOOP */  
class fibo
{
public static void main(String args[])
{
int a=0,b=1,c,n,i=0;
n=Integer.parseInt(args[0]);

while(i<=n)
{
System.out.println(a);
c=a+b;
a=b;
b=c;
i++;
}
}
}
