import java.awt.*;
import java.awt.event.*;

public class MyPanels extends Frame{
    public static void main(String[] args) {
            MyPanels frame = new MyPanels();
    }

    public MyPanels(){
        super("My AWT Panel with Controls");

        Panel panel = new Panel();
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Label label = new Label("Enter your name: ");
        TextField textField = new TextField(20);

        panel.add(label);
        panel.add(textField);
        panel.add(button1);
        panel.add(button2);
        panel.setBackground(Color.BLUE);
        //panel.setLayout(new FlowLayout());

        setLayout(new FlowLayout());

        add(panel);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setLocationRelativeTo(null);
        setSize(400, 300);
        setVisible(true);
    }

}
