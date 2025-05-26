import java.awt.*;
import java.awt.event.*;

public class MyList2 extends Frame{
    public static void main(String[] args) {
        MyList2 frame = new MyList2();
    }

    public MyList2(){
        setName("Music Player");
        setSize(500, 700);

        List list = new List();
        list.setName("musicList");
        list.add("Music Main 1");
        list.add("Music Main 2");
        add(list);

        List favList = new List();
        favList.setName("favoritesList");
        add(favList);

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
            public void actionPerformed(ActionEvent e) {
                String[] selectedItems = list.getSelectedItems();
                int[] selectedIndices = list.getSelectedIndexes();
                for (int i = selectedIndices.length - 1; i >= 0; i--) {
                    list.remove(selectedIndices[i]);
                }

                
               
                for (String item : selectedItems) {
                    favList.remove(item);
                }
            }
        });
        add(Rbutton);

        Button favButton = new Button("Fav");
        favButton.setName("addToFavoritesButton");
        favButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String[] selected = list.getSelectedItems();
                for(String index: selected){
                    favList.add(index);
                }
            }
        });
        add(favButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        setLayout(new FlowLayout());
        setVisible(true);
    }
}
