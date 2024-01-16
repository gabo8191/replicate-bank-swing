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

public class ButtonsHeader2UI extends BasicButtonUI {

    private boolean isMouseOver = false;

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton button = (AbstractButton) c;
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setFont(button.getFont().deriveFont(Font.BOLD));
                button.setForeground(Color.WHITE);
                isMouseOver = true;
                button.repaint();
                button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setFont(button.getFont().deriveFont(Font.PLAIN));
                button.setForeground(Color.white);
                isMouseOver = false;
                button.repaint();
                button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g;
        int width = c.getWidth();
        int height = c.getHeight();

        g2d.setColor(c.getParent().getBackground());
        g2d.fillRect(0, 0, width, height);
        super.paint(g2d, c);

        if (isMouseOver) {
            g2d.setColor(Color.WHITE);
            int lineHeight = 2;
            int lineY = height - lineHeight;
            int lineWidth = width - 20;
            int lineX = (width - lineWidth) / 2;
            g2d.fillRect(lineX, lineY, lineWidth, lineHeight);
        }
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
    }

}
