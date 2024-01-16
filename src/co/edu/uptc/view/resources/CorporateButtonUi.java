package co.edu.uptc.view.resources;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;

public class CorporateButtonUi extends BasicButtonUI {

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
        Font font = new Font("Segoe UI", Font.BOLD, 13);
        button.setFont(font);
        button.setForeground(Color.BLACK);
        button.setBorderPainted(false);
        button.setMargin(new Insets(0, 0, 0, 0));
        ImageIcon originalIcon = new ImageIcon("src/co/edu/uptc/view/assets/building.png");
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
