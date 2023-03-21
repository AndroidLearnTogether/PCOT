import javax.swing.*;
import java.awt.*;

public class PCOT {
    private JPanel panel1;
    private JTextArea textArea1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PCOT");
        frame.setSize(new Dimension(1920,1080));
        frame.setContentPane(new PCOT().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setVisible(true);
    }
}
