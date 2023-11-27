
import javax.swing.*;

public class TestJFrame extends JFrame {
    
    JPanel panel;
    
    public TestJFrame() {
        super("TicTacToe Game");
        panel = new JPanel();
        setContentPane(panel);
        setLocation(0, 900);
        setSize(500, 600);
        setVisible(true);

    }
}
