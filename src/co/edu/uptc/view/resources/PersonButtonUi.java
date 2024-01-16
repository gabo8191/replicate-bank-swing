package co.edu.uptc.view.resources;

import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

public class PersonButtonUi extends BasicButtonUI {

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g;
        int width = c.getWidth();
        int height = c.getHeight();
        g2d.setColor(Color.decode("#ec7000"));
        g2d.fillRect(0, 0, width, height);
        g2d.setColor(Color.WHITE);
        int lineHeight = 2;
        int lineY = height - lineHeight;
        int lineWidth = width - 20;
        int lineX = (width - lineWidth) / 2;
        g2d.fillRect(lineX, lineY, lineWidth, lineHeight);
        super.paint(g2d, c);
    }

    @Override
    protected void installDefaults(AbstractButton button) {
        super.installDefaults(button);
        Font font = new Font("Segoe UI", Font.BOLD, 13);
        button.setFont(font);
        button.setForeground(Color.WHITE);
        button.setBorderPainted(false);
        button.setMargin(new Insets(0, 0, 0, 0));
        ImageIcon originalIcon = new ImageIcon("src/co/edu/uptc/view/assets/user.png");
        int iconSize = 30;
        Image scaledImage = originalIcon.getImage().getScaledInstance(iconSize, iconSize, Image.SCALE_SMOOTH);
        Icon scaledIcon = new ImageIcon(scaledImage);
        button.setIcon(scaledIcon);
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
