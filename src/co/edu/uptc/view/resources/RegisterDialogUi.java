package co.edu.uptc.view.resources;

import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class RegisterDialogUi extends BasicButtonUI {

    private static final Color BACKGROUND_COLOR = Color.WHITE;
    private static final Color BORDER_COLOR = Color.decode("#ec7000");
    private static final Color TEXT_COLOR = Color.decode("#ec7000");
    private static final Color HOVER_COLOR = Color.DARK_GRAY;
    private static final Font BUTTON_FONT = new Font("Segoe UI", Font.PLAIN, 12);
    private static final int BORDER_ARC = 10;

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton button = (AbstractButton) c;
        button.setBackground(BACKGROUND_COLOR);
        button.setForeground(TEXT_COLOR);
        button.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 2));
        button.setBorder(new LineBorder(BORDER_COLOR, 2, true));
        button.setFont(BUTTON_FONT);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button.setForeground(HOVER_COLOR);
                button.setText("<html><u>Registrarse</u></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setCursor(Cursor.getDefaultCursor());
                button.setForeground(TEXT_COLOR);
                button.setText("<html>Registrarse</html>");
            }
        });
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        AbstractButton button = (AbstractButton) c;
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(BACKGROUND_COLOR);
        int x = 0;
        int y = 0;
        int width = c.getWidth();
        int height = c.getHeight();
        g2.fillRoundRect(x, y, width, height, BORDER_ARC, BORDER_ARC);
        super.paint(g, c);
    }
}
