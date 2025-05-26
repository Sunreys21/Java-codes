import java.awt.*;
import java.awt.event.*;

public class MyScroll extends Frame{
    public static void main(String[] args) {
        MyScroll frame = new MyScroll();
    }    

    public MyScroll(){
        setName("Scroll Bar Example");
        Scrollbar scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0,1,0,100);
        //scrollbar.setPreferredSize(new Dimension(20,150));
        scrollbar.setValue(50);           // Set the current value to 50
        scrollbar.setMinimum(0);          // Set the minimum value to 0
        scrollbar.setMaximum(200);        // Set the maximum value to 200
        scrollbar.setVisibleAmount(20);   // Set the visible amount to 20

       
        scrollbar.setBackground(Color.YELLOW);
        scrollbar.setForeground(Color.BLUE);
        scrollbar.setFont(new Font("Arial", Font.BOLD, 16));
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e){
                int currentValue = scrollbar.getValue();
                System.out.printf("Current value: " + currentValue);
            }
        });
        add(scrollbar);
        setSize(300,150);
        setLayout(new FlowLayout());
        setVisible(true);

    }
}
