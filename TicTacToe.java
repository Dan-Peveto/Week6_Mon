import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;

public class TicTacToe extends TestJFrame{
    ArrayList<JButton> buttons = new ArrayList<JButton>();

    public TicTacToe() {
        super();
        panel.setLayout(new GridLayout(3, 3));

        for(int i = 0; i < 9; i++) {
            JButton button = new JButton();
            panel.add(button);
            buttons.add(button);
        }
        setContentPane(panel);
    }
}
