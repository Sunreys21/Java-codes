import java.awt.*;
import java.awt.event.*;

public class MyCheckBox2 extends Frame{
    public static void main(String[] args) {
        MyCheckBox2 frame = new MyCheckBox2();
    }
    public MyCheckBox2(){
        setName("Questionnaire");
        setSize(500, 700);

        CheckboxGroup group = new CheckboxGroup();
        Checkbox group1 = new Checkbox("char", group, false);
        group1.setName("charCheckBox");
        add(group1);

        Checkbox group2 = new Checkbox("boolean", group, false);
        group2.setName("booleanCheckBox");
        add(group2);

        Checkbox group3 = new Checkbox("int", group, false);
        group3.setName("intCheckBox");
        add(group3);

        Checkbox group4 = new Checkbox("String", group, false);
        group4.setName("stringCheckBox");
        add(group4);

        Label label = new Label();
        label.setName("resultLabel");
        add(label); 

        Button button = new Button("Check Answer");
        button.setName("checkButton");
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(group4.getState()){
                    label.setText("Correct!");
                }else{
                    label.setText("Incorrect!");
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setLayout(new GridLayout(5,1));
        setVisible(true);

    }
}
