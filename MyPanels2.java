import java.awt.*;
import java.awt.event.*;

public class MyPanels2 extends Frame{
    public static void main(String[] args) {
        MyPanels2 frame = new MyPanels2();
    }

    public MyPanels2(){
        super("Panels with Position");

        Panel mainPanel = new Panel();
        mainPanel.setName("mainPanel");
        mainPanel.setLayout(null);

        Panel subPanelA = new Panel();
        subPanelA.setName("subPanelA");

        Panel subPanelB = new Panel();
        subPanelB.setName("subPanelB");

        mainPanel.add(subPanelA);
        mainPanel.add(subPanelB);
        add(mainPanel);

        subPanelA.setBounds(10, 10, 100, 100);
        subPanelA.setBackground(Color.BLUE);

        subPanelB.setBounds(200, 90, 100, 100);
        subPanelB.setBackground(Color.RED);

        setSize(500,400);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}
