package personal_notes.frames;
import java.awt.*;
import javax.swing.*;

public class frameExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Panel Example");
        
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        
        panel.add(button1);
        panel.add(button2);
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

