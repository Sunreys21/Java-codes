import java.awt.*;
import java.awt.event.*;

public class MyChoice {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Choice choice = new Choice();

        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.add("Option 4");

        choice.setBackground(Color.YELLOW);
        choice.setForeground(Color.BLUE);
        choice.setFont(new Font("Arial", Font.BOLD, 16));

        frame.add(choice);

        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                String selectedOption = choice.getSelectedItem();
                System.out.printf(String.format("Selected option " + selectedOption));
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
