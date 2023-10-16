import java.awt.*;
import java.applet.*;
/*
<html>
<applet code="Slip29A" width="400" height="400"></applet>
</html>
*/
public class Slip29A extends Applet
{
  public void paint(Graphics g)
  {
    Color c=Color.RED;
    g.setColor(c);
    g.fillOval(100,100,250,250); //face
    
    Color c1=Color.GRAY;
    g.setColor(c1);
    g.fillOval(170,170,30,30);  //outer_left eye
    g.fillOval(250,170,30,30);  //outer_right eye

    g.setColor(Color.BLACK);
    g.fillOval(170,170,30,30);  //left eye
    g.fillOval(250,170,30,30);  //right eye

    g.drawLine(255,200,225,240);  //nose

    g.fillOval(55,170,50,50);  //left ear
    g.fillOval(345,170,50,50);  //right ear
   
    g.fillArc(190,220,70,60,180,180); //smile
  }
}
