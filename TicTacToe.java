import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;

public class TicTacToe extends TestJFrame{
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    String currentPlayer;

    public TicTacToe() {
        super();
        panel.setLayout(new GridLayout(3, 3));

        for(int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.addActionListener(e -> ButtonClicked(e));
            panel.add(button);
            buttons.add(button);
            
        }
        setContentPane(panel);
    }

    private void ButtonClicked(ActionEvent e) {
        SwitchPlayer();
        JButton button = (JButton) e.getSource();
        button.setText(currentPlayer);
        button.setEnabled(false);
    }

    private void SwitchPlayer() {
        if(currentPlayer == "X") {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }
    }
}
