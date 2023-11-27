import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyJPanel extends JPanel{
   
    
    JButton okButton = new JButton("ok");
    JButton cancelButton = new JButton("cancel");
    
    public MyJPanel() {
        super();
        setLayout(new BorderLayout());
        add(okButton, BorderLayout.CENTER);
        add(cancelButton, BorderLayout.SOUTH);
    }
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        g.drawString("Hello Worlds", ALLBITS, ABORT);
    }
}
