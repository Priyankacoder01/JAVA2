//1. Write an applet program to display a greeting message.
import java.applet.*;
import java.awt.*;

public class GreetingApplet extends Applet {
   public void paint(Graphics g) {
      g.drawString("Hello, welcome to my applet!", 20, 20);
   }
}