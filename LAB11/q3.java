
//Write an applet program to display student information such as roll no name ,branch and section in separate lines.
import java.awt.*;
import java.applet.*;

/*<applet code="q3.class" width=300 height=300>
</applet>*/
public class q3 extends Applet {
    public void paint(Graphics g) {
        g.drawString("Roll no: 734", 20, 20);
        g.drawString("Name: RISHIKESH", 20, 40);
        g.drawString("Branch: CSE", 20, 60);
        g.drawString("Section: 03", 20, 80);
    }
}
