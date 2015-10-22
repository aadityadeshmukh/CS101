//Typical java application for drawing a sine wave using multiple lines
import javax.swing.JApplet;
import java.awt.*;
class SineDraw
{
    public void paint(Graphics gr)
    {
        double inc = 1.0/32.0;
        double startX, startY;
        double endX, endY;
        
        for(double x = 0.0 ; x<= 2*Math.PI; x+= inc)
        {
            startX = x;
            startY = Math.sin(startX);
            endX = startX + inc;
            endY = Math.sin(endX);
            
            int startXint = (int) (startX * 599.0 / (2*Math.PI));
            int startYint = (int) (-startY * 399.0 / (2*Math.PI));
            
            int endXint = (int) (endX * 599.0 / (2*Math.PI));
            int endYint = (int) (-endY * 399.0 / (2*Math.PI));
            
            gr.drawLine(startXint, startYint, endXint, endYint);
        }
    }
}