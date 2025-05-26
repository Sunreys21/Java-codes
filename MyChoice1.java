import java.awt.*;
import java.awt.event.*;

public class MyChoice1 extends Frame{
    public static void main(String[] args) {
        MyChoice1 frame = new MyChoice1();
    }
    
    public MyChoice1(){
        setName("My Pet");
        setSize(500, 800);

        TextField text = new TextField(20);
        text.setName("petNameTextField");
        add(text);

        Label label = new Label();
        label.setName("displayLabel");
        add(label);

        Choice choice = new Choice();
        choice.setName("petTypeChoice");

        choice.add("Dog");
        choice.add("Cat");
        choice.add("Rabbit");
        choice.add("Parrot");
        add(choice);

        Button button = new Button("Generate");
        button.setName("generateTextButton");
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String selected = choice.getSelectedItem().toLowerCase();
                String name = text.getText();
                label.setText(String.format("The pet is a " + selected + " named " + name));
            }
        });



        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setLayout(new GridLayout(4, 1));
        setVisible(true);
    }
}
