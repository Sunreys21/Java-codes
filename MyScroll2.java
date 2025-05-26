import java.awt.*;
import java.awt.event.*;

public class MyScroll2 extends Frame{
    private Panel panel;
    private Scrollbar Rscroll, Gscroll, Bscroll;
    public static void main(String[] args) {
        MyScroll2 frame = new MyScroll2();
    }    

    public MyScroll2(){
        setName("Color Picker");
        setSize(400, 500);

        panel = new Panel();
        panel.setName("colorPanel");
        panel.setBackground(new Color(0,0,0));
        add(panel);

        Rscroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        Rscroll.setName("redScrollBar");
        Rscroll.addAdjustmentListener(new ColorAdjuster());
        add(Rscroll);

        Gscroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        Gscroll.setName("greenScrollBar");
        Gscroll.addAdjustmentListener(new ColorAdjuster());
        add(Gscroll);

        Bscroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        Bscroll.setName("blueScrollBar");
        Bscroll.addAdjustmentListener(new ColorAdjuster());
        add(Bscroll);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setLayout(new GridLayout(4,1));
        setVisible(true);
    }

    class ColorAdjuster implements AdjustmentListener{
        public void adjustmentValueChanged(AdjustmentEvent e){
            int red = Rscroll.getValue();
            int green = Gscroll.getValue();
            int blue = Bscroll.getValue();

            panel.setBackground(new Color(red, green, blue));

        }
            
    }
}
