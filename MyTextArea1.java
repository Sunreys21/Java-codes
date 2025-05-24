import java.awt.*;
import java.awt.event.*;

public class MyTextArea1 extends Frame{
    public static void main(String[]args){
        MyTextArea1 frame = new MyTextArea1();
    }

    public MyTextArea1(){
        setName("Text Repeater");
        setSize(500, 800);

        TextField text = new TextField(20);
        text.setName("stringTextField");
        add(text);

        TextField text2 = new TextField(20);
        text2.setName("numberTextField");
        add(text2);

        TextArea textA = new TextArea("");
        textA.setName("resultTextArea");
        add(textA);

        Button button = new Button("Display Text");
        button.setName("displayTextButton");
        add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String inputText = text.getText();
                String inputN = text2.getText();
                int n = Integer.parseInt(inputN);
                for (int i = 0; i < n; i++){
                    textA.append(inputText);
                    if(i < n-1){
                        textA.append(" ");
                    }
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
    }
    
}
