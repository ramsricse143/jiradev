/* PROGRAM TO DECLARE AN ARRAY,STORE ELEMENTS & PRINT THEM */
class array2
{
public static void main(String ars[])
{
int a[];
a= new int[5];
a[0]=10;
a[1]=12;
a[2]=14;
a[3]=16;
a[4]=18;
System.out.println("THE ELEMENTS IN THE ARRAY ARE");
for(int i=0;i<=4;i++)
{
System.out.println("a["+i+"]= "+a[i]);
}
}
}
