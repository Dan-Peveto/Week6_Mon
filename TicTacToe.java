import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;

public class TicTacToe extends TestJFrame{
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    String currentPlayer;

    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;

    public TicTacToe() {
        super();

        menuBar = new JMenuBar();
        menu = new JMenu("Game Option");
        panel.setLayout(new GridLayout(3, 3));
        Font font = new Font("Sans Serif", Font.BOLD, 44);
        for(int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.addActionListener(e -> ButtonClicked(e));
            button.setFont(font);
            panel.add(button);
            buttons.add(button);
            JMenuBar menuBar = new JMenuBar();
            JMenu menu = new JMenu("Game Options");
            menuBar.add(menu);
            JMenuItem menuItem = new JMenuItem("Reset Game");
            menuItem.addActionListener(e -> ResetGame());
            menu.add(menuItem);
            setJMenuBar(menuBar);
        }
        setContentPane(panel);
    }

    private void ButtonClicked(ActionEvent e) {
        int count = 0;
        SwitchPlayer();
        JButton button = (JButton) e.getSource();
        button.setText(currentPlayer);
        button.setEnabled(false);

        if(currentPlayer == "X") {
            button.setBackground(Color.BLUE);
            count++;
        } else {
            button.setBackground(Color.GREEN);
            count++;
        }
        if(IsWinner()) {
            JOptionPane.showMessageDialog(null, currentPlayer + " has won!");
        } 
        if (!IsWinner() && count == 9) {
            JOptionPane.showMessageDialog(null, "You have tied which is okay in soccer and no where else");
        }
    }

    private void SwitchPlayer() {
        if(currentPlayer == "X") {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }
    }

    public void ResetGame() {
        currentPlayer = "";
        for(int i = 0; i < 8; i++) {
            JButton button = buttons.get(i);
            button.setEnabled(true);
            button.setText("");
            button.setBackground(null);
        }
    }
    private boolean IsWinner() {
        if(buttons.get(0).getText().equals(currentPlayer) && 
            buttons.get(1).getText().equals(currentPlayer) && 
            buttons.get(2).getText().equals(currentPlayer)) {
                return true;
            } else if (buttons.get(3).getText().equals(currentPlayer) && 
            buttons.get(4).getText().equals(currentPlayer) && 
            buttons.get(5).getText().equals(currentPlayer)) {
                return true;
            } else if (buttons.get(6).getText().equals(currentPlayer) && 
            buttons.get(7).getText().equals(currentPlayer) && 
            buttons.get(8).getText().equals(currentPlayer)) {
                return true;
            } else if (buttons.get(0).getText().equals(currentPlayer) && 
            buttons.get(3).getText().equals(currentPlayer) && 
            buttons.get(6).getText().equals(currentPlayer)) {
                return true;
            } else if (buttons.get(1).getText().equals(currentPlayer) && 
            buttons.get(4).getText().equals(currentPlayer) && 
            buttons.get(7).getText().equals(currentPlayer)) {
                return true;
            } else if (buttons.get(2).getText().equals(currentPlayer) && 
            buttons.get(5).getText().equals(currentPlayer) && 
            buttons.get(8).getText().equals(currentPlayer)) {
                return true;
            } else if (buttons.get(0).getText().equals(currentPlayer) && 
            buttons.get(4).getText().equals(currentPlayer) && 
            buttons.get(8).getText().equals(currentPlayer)) {
                return true;
            } else if (buttons.get(2).getText().equals(currentPlayer) && 
            buttons.get(4).getText().equals(currentPlayer) && 
            buttons.get(6).getText().equals(currentPlayer)) {
                return true;
            } else {
                return false;
            }
    }
}
