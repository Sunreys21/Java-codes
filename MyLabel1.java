import java.awt.*;
import java.awt.event.*;

public class MyLabel1 extends Frame{
    public static void main(String[] args) {
        Frame frame = new Frame();

        Label label = new Label("Hello World! I love Java!");
        label.setName("helloWorldLabel");

        frame.setSize(400,500);
        frame.setVisible(true);
        frame.add(label);

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
    });
    }
}
