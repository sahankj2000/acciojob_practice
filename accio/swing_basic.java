import javax.swing.*;

public class swing_basic {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click Here");
        button.setBounds(250,100,100,40);
        frame.add(button);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
