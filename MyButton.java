import java.awt.*;
import java.awt.event.*;

public class MyButton extends Frame{
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button = new Button("Click Me!");
        button.setFont(new Font("Arial", Font.BOLD,14));
        button.setForeground(Color.RED);

        button.setBounds(100, 60, 100, 30);
        
        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setTitle("My AWT Button Example");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
