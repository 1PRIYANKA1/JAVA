import java.awt.*;
 
public class Slip7B extends Frame{
    public void paint(Graphics g){
        Font f = new Font("Georgia",Font.PLAIN,20);
        g.setFont(f);
        g.drawString("Dr D Y Patil College", 50, 70);
        setBackground(Color.RED);
    }
    public static void main(String args[]){
        Slip7B sl = new Slip7B();
        sl.setVisible(true);
        sl.setSize(500,300);
    }
}