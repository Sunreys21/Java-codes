import java.awt.*;
import java.awt.event.*;

public class MyButton2 extends Frame{
    public static void main(String[] args) {
        new MyButton2();
    }

    public MyButton2(){
        setSize(400,500);
        setName("Case Switch");
        setLayout(new FlowLayout());

        Label label = new Label("I love programming!");
        label.setName("textLabel");
        add(label);

        Button button = new Button("Vowel");
        button.setName("switchVowelCaseButton");
        add(button);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String text = label.getText();
                StringBuilder newText = new StringBuilder();

                for(int i = 0; i<text.length(); i++){
                    char c = text.charAt(i);
                    if("aeiou".indexOf(c) >= 0){
                        newText.append(Character.toUpperCase(c));
                    }else if("AEIOU".indexOf(c) >= 0){
                        newText.append(Character.toLowerCase(c));
                    }else{
                        newText.append(c);
                    }
                }

            label.setText(newText.toString());
            }
        });
        

        Button button2 = new Button("Consonant");
        button2.setName("switchConsonantCaseButton");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String text = label.getText();
                StringBuilder newText = new StringBuilder();

                for(int i = 0; i<text.length(); i++){
                    char c = text.charAt(i);
                    if("aeiouAEIOU".indexOf(c) == -1 && Character.isLetter(c)){
                        if(Character.isLowerCase(c)){
                            newText.append(Character.toUpperCase(c));
                        }else{
                            newText.append(Character.toLowerCase(c));
                        }
                    }else{
                        newText.append(c);
                    }
                }
            label.setText(newText.toString());
        }});
        add(button2);

        Button button3 = new Button("All");
        button3.setName("switchAllCaseButton");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String text = label.getText();
                StringBuilder newText = new StringBuilder();
                for(int i = 0; i<text.length(); i++){
                    char c = text.charAt(i);
                    if(Character.isLowerCase(c)){
                        newText.append(Character.toUpperCase(c));
                    }else if(Character.isUpperCase(c)){
                        newText.append(Character.toLowerCase(c));
                    }else{
                        newText.append(c);
                    }
                }
                label.setText(newText.toString());
            }
        });
        add(button3);

        setVisible(true);
        
        

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
