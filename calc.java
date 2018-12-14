/* PROGRAM TO CREATE A CALCULATOR USING AN APPLET */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="calc.class" width=500 height=500> </applet>*/
public class calc extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button add1,sub,prod,div;
public void init()
{
l1=new Label("enter a");
add(l1);
t1=new TextField(10);
add(t1);
l2=new Label("enter b");
add(l2);
t2=new TextField(10);
add(t2);
add1=new Button("+");
add(add1);
add1.addActionListener(this);
sub=new Button("-");
add(sub);
sub.addActionListener(this);
prod=new Button("*");
add(prod);
prod.addActionListener(this);
div=new Button("/");
add(div);
div.addActionListener(this);
t3=new TextField(10);
add(t3);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==add1)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int sum=a+b;
t3.setText(String.valueOf(sum));
}
if(e.getSource()==sub)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int sub=a-b;
t3.setText(String.valueOf(sub));
}
if(e.getSource()==prod)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int prod=a*b;
t3.setText(String.valueOf(prod));
}
if(e.getSource()==div)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int div=a/b;
t3.setText(String.valueOf(div));
}
}
}





