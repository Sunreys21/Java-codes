import java.awt.*;
import java.awt.event.*;

public class MyText2 extends Frame{
    public static void main(String[] args) {
        MyText2 frame = new MyText2();
    }

    public MyText2(){
        setName("Text Field Enable/Disable");
        setSize(400,200);

        TextField textField = new TextField(20);
        textField.setName("textField");
        add(textField);

        Button button = new Button("Enable");
        button.setName("enableButton");
        add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //boolean isEnabled = textField.isEnabled();
                textField.setEnabled(true);
            }
        });

        Button button2 = new Button("Disable");
        button2.setName("disableButton");
        add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                textField.setEnabled(false);
            }
        });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setVisible(true);
    }
}
