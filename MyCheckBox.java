import java.awt.*;
import java.awt.event.*;

public class MyCheckBox extends Frame{
    public static void main(String[] args) {
        MyCheckBox frame = new MyCheckBox();
    }

    public MyCheckBox(){
        setName("Check Box Group Exampel");

        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Option 1", checkboxGroup, false);
        Checkbox checkbox2 = new Checkbox("Option 2", checkboxGroup, false);
        Checkbox checkbox3 = new Checkbox("Option 3", checkboxGroup, false);

        checkbox1.setBackground(Color.YELLOW);
        checkbox2.setForeground(Color.BLUE);
        checkbox3.setFont(new Font("Arial", Font.BOLD, 16));
        
        add(checkbox1);
        add(checkbox2);
        add(checkbox3);

        ItemListener itemListener = new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                System.out.println("Selected option: " + ((Checkbox)e.getItem()).getLabel());
            }
        };

        checkbox1.addItemListener(itemListener);
        checkbox2.addItemListener(itemListener);
        checkbox3.addItemListener(itemListener);
    

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setSize(300, 150);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    
}
