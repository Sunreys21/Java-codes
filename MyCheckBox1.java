import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyCheckBox1 extends Frame{
    public static void main(String[] args) {
        MyCheckBox1 frame = new MyCheckBox1();
    }

    public MyCheckBox1(){
        setName("Receipt Generator");
        setSize(900, 800);

        CheckboxGroup group = new CheckboxGroup();
        Checkbox group1 = new Checkbox("Shoes");
        group1.setName("shoesCheckBox");
        add(group1);

        Checkbox group2 = new Checkbox("Pants");
        group2.setName("pantsCheckBox");
        add(group2);

        Checkbox group3 = new Checkbox("Shirt");
        group3.setName("shirtCheckBox");
        add(group3);

        Checkbox group4 = new Checkbox("Default", group, false);
        group4.setName("defaultCheckBox");
        add(group4);

        Checkbox group5 = new Checkbox("Special", group, false);
        group5.setName("specialCheckBox");
        add(group5);

        TextArea text = new TextArea();
        text.setName("receiptTextArea");
        add(text);

        TextField textF = new TextField(20);
        textF.setName("nameTextField");
        add(textF);

        Choice choice = new Choice();
        choice.setName("paymentMethodChoice");
        add(choice);

        choice.add("Cash");
        choice.add("Credit Card");
        choice.add("Debit Card");

        Button button = new Button("Generate Receipt");
        button.setName("generateButton");
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name = textF.getText();
                String pmethod = choice.getSelectedItem();

                double cost = 0.00;
                StringBuilder costOutput = new StringBuilder();

                if(group1.getState()){
                    cost+= 200.00;
                    costOutput.append("Shoes, ");
                }
                if(group2.getState()){
                    cost+= 150.00;
                    costOutput.append("Pants, ");
                }
                if(group3.getState()){
                    cost += 120.00;
                    costOutput.append("Shirt");
                }
                
                if(group4.getState() && cost>300.00){
                    cost *= 0.95;
                    costOutput.append("");
                }
                if(group5.getState()){
                    cost *= 0.85;
                    costOutput.append("");
                }
                String receipt = "Name: " + name + "\n" +
                                "Items: " + costOutput + "\n" +
                                "Payment Method: " + pmethod + "\n" +
                                "Total Cost: " + String.format("%.2f", cost);

                text.setText(receipt);
            }
        });





        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        setVisible(true);

    }
}
