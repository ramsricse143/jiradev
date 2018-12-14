/* PROGRAM TO PERFORM TVTEST USING MOUSEEVENTS */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="tvtest.class" width=500 height=500> </applet>*/
public class tvtest extends Applet 
{
public void init()
{
CheckboxGroup c=new CheckboxGroup();
Checkbox c1=new Checkbox("Black&White",c,true);
Checkbox c2=new Checkbox("color",c,false);
c1.addMouseListener(new check1());
c2.addMouseListener(new check2());
add(c1);
add(c2);
Choice abc=new Choice();
abc.add("ONIDA");
abc.add("BPL");
abc.add("SAMSUNG");
abc.add("PHILIPS");
abc.add("AKAI");
abc.addItemListener(new ch());
add(abc);
}
class check1 extends MouseAdapter
{
public void mouseClicked(MouseEvent e)
{
showStatus("BLACK&WHITE TV");
}
}
class check2 extends MouseAdapter
{
public void mouseClicked(MouseEvent e)
{
showStatus("COLOR TV");
}
}
class ch implements ItemListener
{
public void itemStateChanged(ItemEvent e)
{
String s=(String)e.getItem();
showStatus("YOU HAVE SELECTED "+ s +" BRANDED TV");
}
}
}
