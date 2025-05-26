import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialog extends Frame{
    public static void main(String[] args) {
        MyDialog frame = new MyDialog();
        frame.setName("Main Window");

        Dialog dialog = new Dialog(frame, "Dialog Example", true);
        dialog.setResizable(false);
        dialog.setBackground(Color.BLUE);

        Label label = new Label("This is a dialog");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(Color.RED);

        Button close = new Button("Close");
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dialog.dispose();
            }
        });
        dialog.add(close);
        dialog.add(label);
        dialog.setSize(200, 100);
        dialog.setLayout(new FlowLayout());
        dialog.setVisible(true);
    }
}
