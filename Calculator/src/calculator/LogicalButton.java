package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class LogicalButton extends JButton {
   
    public LogicalButton(final JTextArea display, final String title) {
        super(title);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + title);
            }
        });
    }

}
