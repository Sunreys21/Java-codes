import java.awt.*;
import java.awt.event.*;

public class MyChoice2 extends Frame{
    public static void main(String[] args) {
        MyChoice2 frame = new MyChoice2();
    }

    public MyChoice2(){
        setName("Simple Calculator");
        setSize(500, 800);

        TextField text = new TextField(20);
        text.setName("num1TextField");
        add(text);

        TextField text2 = new TextField(20);
        text2.setName("num2TextField");
        add(text2);

        Choice choice = new Choice();
        choice.setName("operationsChoice");
        choice.add("+");
        choice.add("-");
        choice.add("*");
        choice.add("/");
        add(choice);

        Label label = new Label();
        label.setName("resultLabel");
        add(label);
            
        Button button = new Button("Compute Result");
        button.setName("computeButton");
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numA = text.getText();
                int num1 = Integer.parseInt(numA);

                String numB = text2.getText();
                int num2 = Integer.parseInt(numB);

                String selected = choice.getSelectedItem();
                int result = 0;

                if(selected == "+"){
                    result = num1 + num2;
                }else if(selected == "-"){
                    result = num1 - num2;
                }else if(selected == "*"){
                    result = num1*num2;
                }else if(selected == "/"){
                    result = num1/num2;
                }

                label.setText(String.format("%d", result));
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setLayout(new GridLayout(4,2));
        setVisible(true);
    }
}
