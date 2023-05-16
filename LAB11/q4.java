
//Design an applet to display a coloured smiley face in the centre of the applet window.
import java.awt.*;
import java.applet.*;

/*<applet code="q4.class" width=300 height=300>
</applet>*/
public class q4 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.black);
        g.fillOval(100, 100, 20, 20);
        g.fillOval(180, 100, 20, 20);
        g.drawArc(100, 150, 100, 50, 180, 180);
    }

}
