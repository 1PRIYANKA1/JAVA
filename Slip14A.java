import java.awt.*;
import java.awt.event.*;

public class Slip14A extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b;
    Frame f;
    TextArea te;

    Slip14A() {
        Font fnt = new Font("Arial", Font.BOLD, 18);
        setFont(fnt);

        l1 = new Label("Number");
        l2 = new Label("Name");
        l3 = new Label("Salary");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        b = new Button("Display");
        f = new Frame();
        f.setFont(fnt);
        te = new TextArea(10, 40);

        setSize(500, 500);
        setLayout(new FlowLayout());

        b.addActionListener(this);

        // Use GridLayout to align labels and text fields in separate rows
        setLayout(new GridLayout(4, 2));

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);

        // Set preferred sizes for text fields
        t1.setPreferredSize(new Dimension(150, 25));
        t2.setPreferredSize(new Dimension(150, 25));
        t3.setPreferredSize(new Dimension(150, 25));

        f.add(te);
        f.setSize(500, 500);
        f.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        String eno = t1.getText();
        String ename = t2.getText();
        String salary = t3.getText();
        
        String res = "Number: " + eno + "\nName: " + ename + "\nSalary: " + salary + "\n\n";
        te.append(res);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        Slip14A obj = new Slip14A();
        obj.setVisible(true);
    }
}
