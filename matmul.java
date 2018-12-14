/* PROGRAM FOR MATRIX MULTIPLICATION USING PARSEINT()  */
class matmul
{
public static void main(String args[])
{
int i,j,k,y=0;
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=Integer.parseInt(args[y]);
y++;
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j]=Integer.parseInt(args[y]);
y++;
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j]=0;
for(k=0;k<2;k++)
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
}
System.out.println("         ");
System.out.println("Array Multiplication is");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(c[i][j]+"   ");
}
System.out.println("   ");
}
}
}


