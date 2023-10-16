// Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and 
// MOUSE_CLICK and display the position of the Mouse_Click in a TextField. (Use 
// Swings)

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Slip2A {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Demo");
        JTextField positionTextField = new JTextField(20);

        frame.setTitle("Mouse Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        positionTextField.setEditable(false);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(positionTextField);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();

                int y = e.getY();
                positionTextField.setText("Mouse Clicked at: (" + x + ", " + y + ")");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                positionTextField.setText("Mouse Moved to: (" + x + ", " + y + ")");
            }
        });

        frame.setContentPane(contentPane);
        frame.setVisible(true);
    }
}
