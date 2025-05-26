import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class MyList{
    public static void main(String[] args) {
        Frame frame = new Frame("List Example");
        List list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");

        list.setBackground(Color.YELLOW);
        list.setForeground(Color.BLUE);
        list.setFont(new Font("Arial", Font.BOLD, 16));

        Button addButton = new Button("Add item");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                list.add("New Item");
            }
        });

        Button removeButton = new Button("Remove Selected");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int[] selectedIndices = list.getSelectedIndexes();
                for(int index : selectedIndices){
                    list.remove(index);
                }
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        frame.add(list);
        frame.add(addButton);
        frame.add(removeButton);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setVisible(true);

    }

}
