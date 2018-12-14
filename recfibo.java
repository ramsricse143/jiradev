/* PROGRAM TO GET FIBONOCII SERIES USING RECURSIVE FUNCTION */
class fi
{
int fib(int i)
{
if(i==0)
return 0;
else if(i==1)
return 1;
else
return(fib(i-1)+fib(i-2));
}
}
class recfibo
{
public static void main(String args[])
{
fi f=new fi();
int i;
int a=Integer.parseInt(args[0]);
for(i=0;i<a;i++)
{
System.out.println(f.fib(i));
}
}
}
