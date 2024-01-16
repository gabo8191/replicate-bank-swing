package co.edu.uptc.view.resources;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;

public class RegisterButtonUi extends BasicButtonUI {

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g;
        int width = c.getWidth();
        int height = c.getHeight();
        g2d.setColor(c.getParent().getBackground());
        g2d.fillRect(0, 0, width, height);
        super.paint(g2d, c);
        g2d.setColor(Color.WHITE);
        int lineWidth = 1;
        int lineHeight = height - 20;
        int lineY = (height - lineHeight) / 2;
        int lineX = 10;
        g2d.fillRect(lineX, lineY, lineWidth, lineHeight);
    }

    @Override
    protected void installDefaults(AbstractButton button) {
        super.installDefaults(button);
        Font font = new Font("Segoe UI", Font.BOLD, 13);
        button.setFont(font);
        button.setForeground(Color.WHITE);
        button.setBorderPainted(false);
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setIcon(null);
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                button.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent evt) {
                button.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }
        });
    }

}
