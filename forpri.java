/* PROGRAM TO FIND THE PRIME NUMBERS WITH IN A GIVEN RANGE OF NUMBERS */
class forpri
{
public static void main(String args[])
{
int n,i,c=0,j;
n=Integer.parseInt(args[0]);
 System.out.println("FROM 1 to "+args[0]);
for(i=1;i<=n;i++)
{
c=0;
for(j=1;j<=i;j++)
{
if((i%j)==0)
{
c=c+1;
}
}
if(c==2)
{
System.out.println(i);
}
}
}
}