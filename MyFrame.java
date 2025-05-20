import java.awt.*;
import java.awt.event.*;
public class MyFrame extends Frame{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

        frame.setTitle("My AWT FRAME");
        frame.setSize(400, 500);
        frame.setVisible(true);
        //frame.setResizable(false);;

        //setTitle(String title): Sets the title of the frame displayed in the title bar.
        //setSize(int width, int height): Sets the width and height of the frame.
        //setLocation(int x, int y): Sets the position of the frame on the screen.
        //setResizable(boolean resizable): Specifies whether the frame can be resized by the user.
        //setVisible(boolean visible): Makes the frame visible or invisible.
        //setDefaultCloseOperation(int operation): Sets the default close operation when the user clicks the close button.
        frame.setBackground(Color.BLUE);
        frame.setForeground(Color.YELLOW);
        frame.setFont(new Font("Arial", Font.BOLD, 20));
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
        System.exit(0);
            }   
        });
    
    }
}

/* import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

    public MyFrame() {
        // Call the superclass constructor with the title
        super("My AWT Frame");

        // Create and add a Label to the Frame
        Label label = new Label("Hello, AWT!");
        add(label);

        // Add a WindowListener to handle closing the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Set the size of the frame
        setSize(400, 300);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of MyFrame
        MyFrame frame = new MyFrame();
    }
}*/
