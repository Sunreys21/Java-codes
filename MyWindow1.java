import java.awt.*;
import java.awt.event.*;

public class MyWindow1 {
    public static void main(String[] args) {
        Frame mainFrame = new Frame();
        mainFrame.setName("mainFrame");

        mainFrame.setUndecorated(true); // <-- oa test case 2
        mainFrame.setBackground(Color.WHITE);
        mainFrame.setSize(600, 500);
        mainFrame.setLocation(200, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);

        Window mainWindow = new Window(mainFrame);
        mainWindow.setName("mainWindow");
        mainWindow.setLocation(300, 150);
        mainWindow.setSize(400, 400);
        mainWindow.setBackground(Color.RED);
        mainWindow.setVisible(true);
    }
}

