import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

public class MyScroll1 extends Frame{
    public static void main(String[] args) {
        MyScroll1 frame = new MyScroll1();
    }    

    public MyScroll1(){
        setName("Font Resizer");
        setSize(400,700);

        Label label = new Label("Sample");
        label.setName("textLabel");
        label.setFont(new Font("Arial", Font.BOLD, 10));
        add(label);

        Scrollbar scroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 150);
        scroll.setName("resizeScrollBar");
        add(scroll);

        scroll.addAdjustmentListener(new AdjustmentListener(){
            public void adjustmentValueChanged(AdjustmentEvent e){
                int scrollval = scroll.getValue();
                Font currentFont = label.getFont();
                label.setFont(new Font(currentFont.getName(), currentFont.getStyle(),
                scrollval));

            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowAdapter e){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
    }
}
