import java.awt.*;
import java.awt.event.*;

public class MyPanels1 extends Frame{
    public static void main(String[] args) {
        MyPanels1 panel = new MyPanels1();
    }

    public MyPanels1(){
        super("Panels");

        Panel mainPanel = new Panel();
        Panel subPanelA = new Panel();
        Panel subPanelB = new Panel();

        //TextField textField = new TextField(20);

        mainPanel.setName("mainPanel");
        subPanelA.setName("subPanelA");
        subPanelB.setName("subPanelB");
        
        subPanelA.setPreferredSize(new Dimension(100, 100));
        subPanelB.setPreferredSize(new Dimension(100, 100));

        mainPanel.setBackground(Color.WHITE);

        subPanelA.setBackground(Color.BLUE);
        subPanelA.setForeground(Color.BLUE);


        subPanelB.setBackground(Color.RED);
        subPanelB.setForeground(Color.RED);

        mainPanel.add(subPanelA);
        mainPanel.add(subPanelB);

        mainPanel.setLayout(new FlowLayout());
        add(mainPanel);

        setSize(400,500);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }


}
