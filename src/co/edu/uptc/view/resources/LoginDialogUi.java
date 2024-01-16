package co.edu.uptc.view.resources;

import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginDialogUi extends BasicButtonUI {

    private static final Color BACKGROUND_COLOR = Color.decode("#ec7000");
    private static final Color TEXT_COLOR = Color.WHITE;

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton button = (AbstractButton) c;
        button.setBackground(BACKGROUND_COLOR);
        button.setForeground(TEXT_COLOR);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setCursor(Cursor.getDefaultCursor());
            }
        });
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        AbstractButton button = (AbstractButton) c;
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(BACKGROUND_COLOR);
        int arcWidth = 10;
        int arcHeight = 10;
        int x = 0;
        int y = 0;
        int width = c.getWidth();
        int height = c.getHeight();
        g2.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
        super.paint(g, c);
    }
}
