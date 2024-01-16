package co.edu.uptc.view.resources;

import javax.swing.JLabel;
import javax.swing.plaf.LabelUI;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CopyrightFooterUi extends BasicLabelUI {
    public static LabelUI createUI(JLabel c) {
        c.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return new CopyrightFooterUi();
    }

    @Override
    protected void installListeners(JLabel c) {
        super.installListeners(c);
        c.addMouseListener(new MouseHoverListener(c));
    }

    private class MouseHoverListener extends MouseAdapter {
        private final JLabel label;

        public MouseHoverListener(JLabel label) {
            this.label = label;
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            label.setCursor(Cursor.getDefaultCursor());
        }
    }
}
