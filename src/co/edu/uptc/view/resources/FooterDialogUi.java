package co.edu.uptc.view.resources;

import javax.swing.JLabel;
import javax.swing.plaf.LabelUI;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;

public class FooterDialogUi extends BasicLabelUI {
    private boolean hovering = false;

    public static LabelUI createUI(JLabel c) {
        c.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        return new FooterDialogUi();
    }

    @Override
    protected void installListeners(JLabel c) {
        super.installListeners(c);
        c.addMouseListener(new MouseHoverListener());
    }

    private class MouseHoverListener extends java.awt.event.MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            hovering = true;
            if (e.getSource() instanceof JLabel) {
                JLabel label = (JLabel) e.getSource();
                label.setForeground(Color.decode("#ec7000"));
                label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            hovering = false;
            if (e.getSource() instanceof JLabel) {
                JLabel label = (JLabel) e.getSource();
                label.setForeground(Color.decode("#4d4d4d"));
                label.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        }
    }
}
