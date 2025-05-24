import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class MyTextArea {
    public static void main(String[] args) {
        Frame frame = new Frame("Text Area Example: ");

        TextArea textArea = new TextArea();
        textArea.setBackground(Color.YELLOW);
        textArea.setForeground(Color.BLUE);
        textArea.setFont(new Font("Arial", Font.BOLD, 16));
        
        Button submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String inputText = textArea.getText();
                JOptionPane.showMessageDialog(frame, "You entered:\n" + inputText);
            }
        });

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame.add(submitButton);
        frame.add(textArea);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
