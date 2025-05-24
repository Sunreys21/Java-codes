import java.awt.*;
import java.awt.event.*;

public class MyText1 extends Frame{
    public static void main(String[] args) {
        MyText1 frame = new MyText1();
    }

    public MyText1(){
        setName("Text Display");
        setSize(400, 500);

        Label label = new Label("");
        label.setName("nameLabel");
        add(label);

        TextField text = new TextField(20);
        text.setName("nameTextField");
        add(text);


        Button button = new Button("Display");
        button.setName("displayButton");
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String input = text.getText();
                label.setText(input.toString());
            }
        });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setLayout(new GridLayout(2, 1));
        setVisible(true);

    }
}
