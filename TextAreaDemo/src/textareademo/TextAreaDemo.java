package textareademo;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {

    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyFrame() {
        super("Text Area Demo");
        l = new Label("NO Text Entered");
        ta = new TextArea(10, 30);
        tf = new TextField(20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(ta);
        add(tf);
        add(l);
        add(b);
        b.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        ta.insert(tf.getText(),ta.getCaretPosition());
    }
}

public class TextAreaDemo {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);

    }

}
