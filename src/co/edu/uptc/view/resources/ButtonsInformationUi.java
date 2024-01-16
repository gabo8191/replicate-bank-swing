package co.edu.uptc.view.resources;

import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonsInformationUi extends BasicButtonUI {
    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton button = (AbstractButton) c;
        button.setOpaque(false);
        button.setBorderPainted(false);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setForeground(Color.decode("#ec7000"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setForeground(Color.decode("#0C5384"));
            }
        });
    }
}
