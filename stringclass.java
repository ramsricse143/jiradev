/* PROGRAM USING STRING CLASS */
class stringclass
{
public static void main(String args[])
{
String s1="FIRST STRING";
String s2="SECOND STRING";
String s3=s1;
String s4=s1+" AND "+s2;
System.out.println("s1= "+s1);
System.out.println("s2= "+s2);
System.out.println("s3= "+s3);
System.out.println("s4= "+s4);
System.out.println("NUMBER OF CHARACTERS IN s1= "+s1.length());
System.out.println("CHARACTER IN THE 3rd POSITION OF s1= "+s1.charAt(3));
if(s1.equals(s2))
System.out.println("THE CONTENTS OF s1 AND s2 ARE EQUAL");
else
System.out.println("NOT EQUAL");
if(s1.equals(s3))
System.out.println("THE CONTENTS OF s1 AND s3 ARE EQUAL");
else
System.out.println("NOT EQUAL");
}
}


