import javax.swing.*;

public class TestJFrame extends JFrame {
    
    public JPanel panel;
    
    public TestJFrame() {
        super("TicTacToe Game");
        setContentPane(panel);
        setLocation(0, 900);
        setSize(500, 600);
        setVisible(true);

    }
}
