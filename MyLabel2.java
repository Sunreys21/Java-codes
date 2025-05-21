import java.awt.*;
import java.awt.event.*;

public class MyLabel2 extends Frame{
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setName("My First App");

        Label label1 = new Label("Hello World!");
        label1.setName("label1");

        Label label2 = new Label("I love programming");
        label2.setName("label2");

        Label label3 = new Label("I love CodeChum");
        label3.setName("label3");

        Label label4 = new Label("I love Java");
        label4.setName("label4");

        frame.setLayout(new GridLayout(4,1));

        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
