import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class MyText {
    public static void main(String[] args) {
        Frame frame = new Frame("Text Field Example");
        TextField text = new TextField(40);
        frame.add(text);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        text.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String input = text.getText();
                JOptionPane.showMessageDialog(frame, "You entered " + input);
            }
        });

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
