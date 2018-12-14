/* PROGRAM USING SWITCH CASE */
 class switch1
{
public static void main(String args[])
{
int month=10;
String season;
switch(month)
{
case 12:
case 1:
case 2: season="winter";
         break;
case 3:
case 4:
case 5: season="spring";
       break;
case 6:
case 7:
case 8: season="summer";
        break;
case 9:
case 10:
case 11:season="autum";
        break;
default:season="bogusone";
}
System.out.println("october is in "+season);
}
}



