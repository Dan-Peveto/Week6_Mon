import java.awt.*;

import javax.swing.*;

public class MyJPanel extends JPanel{
   
    
    JButton okButton = new JButton("ok");
    JButton cancelButton = new JButton("cancel");
    
    public MyJPanel() {
        super();
        setLayout(new BorderLayout());
        okButton.addActionListener(new MyOkButtonHandler());
        cancelButton.addActionListener(e -> PrintOnClick());
        add(okButton, BorderLayout.CENTER);
        add(cancelButton, BorderLayout.SOUTH);
    }
    public void PrintOnClick() {
        System.out.println("I am on the console");
    }
    @Override
    protected void paintComponent(Graphics g) {
        g.drawString("Hello Worlds", ALLBITS, ABORT);
    }
}
