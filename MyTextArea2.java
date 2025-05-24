import java.awt.*;
import java.awt.event.*;

public class MyTextArea2 extends Frame{
    public static void main(String[] args) {
        MyTextArea2 frame = new MyTextArea2();
    }

    public MyTextArea2(){
        setSize(800, 500);
        setName("Word & Character Counter");

        TextArea text = new TextArea();
        text.setName("textArea");
        add(text);


        Label label = new Label();
        label.setName("wordCountLabel");
        add(label);

        Label label2 = new Label();
        label2.setName("charCountLabel");
        add(label2);

        Button button = new Button("Display Count");
        button.setName("countButton");
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String input = text.getText();
                int length = input.length();
                label2.setText(String.format("%d", length));

                if(input.trim().isEmpty()){
                    label.setText("0");
                }else{
                    String[] word = input.split("\\s+");
                    label.setText("" + word.length);
                }

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
