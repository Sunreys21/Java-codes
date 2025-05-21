import java.awt.*;
import java.awt.event.*;

public class MyWindow extends Frame{
    public static void main(String[] args) {
        MyWindow window = new MyWindow();
        
        window.setBackground(Color.BLUE);
        window.setLayout(new FlowLayout());

        Button button1 = new Button("YES");
        Button button2 = new Button("NO");

        window.add(button1);
        window.add(button2);

        window.setTitle("My AWT Window");
        window.setSize(400, 300);
        window.setVisible(true);

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

}
