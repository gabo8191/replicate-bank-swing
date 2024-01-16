package co.edu.uptc.view.resources;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;

public class SimpleButtonHeaderUi extends BasicButtonUI {

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton button = (AbstractButton) c;
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setFont(button.getFont().deriveFont(Font.BOLD));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setFont(button.getFont().deriveFont(Font.PLAIN));
            }
        });
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g;
        int width = c.getWidth();
        int height = c.getHeight();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        super.paint(g2d, c);
    }

    @Override
    protected void installDefaults(AbstractButton button) {
        super.installDefaults(button);
        Font font = new Font("Segoe UI", Font.BOLD, 11);
        button.setFont(font);
        button.setForeground(Color.BLACK);
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
