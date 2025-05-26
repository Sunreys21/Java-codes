import java.awt.*;
import java.awt.event.*;

public class MyList1 extends Frame{
    public static void main(String[] args) {
        MyList1 frame = new MyList1();
    }

    public MyList1(){
        setName("Music Player");
        setSize(500,700);

        List list = new List();
        list.setName("musicList");
        list.add("Music Main 1");
        list.add("Music Main 2");
        add(list);

        TextField text = new TextField(20);
        text.setName("musicTextField");
        add(text);

        Button Abutton = new Button("Add");
        Abutton.setName("addButton");
        Abutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String input = text.getText();
                list.add(input);
            }
        });
        add(Abutton);

        Button Rbutton = new Button("Remove");
        Rbutton.setName("removeButton");
        Rbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int[] selected = list.getSelectedIndexes();
                for(int index: selected){
                    list.remove(index);
                }
            }
        });
        add(Rbutton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);

    }
}
