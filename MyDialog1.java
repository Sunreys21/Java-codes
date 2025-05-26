import java.awt.*;
import java.awt.event.*;

public class MyDialog1 extends Frame{
    private MyDialog1 frame;
    public static void main(String[] args) {
        MyDialog1 frame = new MyDialog1();
    }

    public MyDialog1(){
        setName("February 29");
        setSize(500, 700);

        TextField text = new TextField(20);
        text.setName("yearTextField");
        add(text);

        Dialog dialog = new Dialog(frame, "Message", true);
        dialog.setName("leapYearDialog");
        dialog.setSize(200, 100);
        dialog.setLayout(new FlowLayout());

        Label label = new Label("Leap year");
        label.setName("leapYearLabel");
        dialog.add(label);

        Dialog Ndialog = new Dialog(frame, "Message", true);
        Ndialog.setSize(200, 100);
        Ndialog.setLayout(new FlowLayout());
        Ndialog.setName("notLeapYearDialog");


        Label Nlabel = new Label("Not a leap year");
        Nlabel.setName("notLeapYearLabel");
        Ndialog.add(Nlabel);

        Button button = new Button("Check");
        button.setName("checkYearButton");
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String input = text.getText();
                int year = Integer.parseInt(input);

                if((year % 400 == 0) || ((year % 100 !=0 )&& (year % 4 == 0))){
                    dialog.setVisible(true);
                }else{
                    Ndialog.setVisible(true);
                }
            }
        });

        dialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        Ndialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
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
