/*program to create a simpe applet */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="simple.class" width=500 height=500> </applet>*/
public class simple extends Applet 
{
public void init()
{
}
public void paint(Graphics g)
{
g.drawString("my simple APPLET program",100,100);
}
}
