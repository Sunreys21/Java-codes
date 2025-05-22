import java.awt.*;
import java.awt.event.*;

public class MyButton1 extends Frame{
    private int a = 0;
    private Label label;
    public static void main(String[] args) {
        new MyButton1();
    }

    public MyButton1(){

        Label label = new Label("" + a);
        label.setName("counterLabel");

        Button button = new Button("Click");
        button.setName("incrementButton");
        button.setBounds(100, 60, 100, 30);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a++;
                label.setText("" + a);
            }
        });

        setSize(400,500);

        add(label);
        add(button);

        setLayout(new GridLayout(2,0));
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setVisible(true);

    }
}
