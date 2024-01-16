package co.edu.uptc.view.resources;

import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.ButtonModel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class CompaniesButtonUi extends BasicButtonUI {

    private static final Color NORMAL_COLOR = new Color(128, 128, 128);

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        AbstractButton button = (AbstractButton) c;
        setButtonProperties(button);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
        AbstractButton button = (AbstractButton) c;
        drawButtonBorder(g, button);
    }

    @Override
    protected void paintText(Graphics g, JComponent c, Rectangle textRect, String text) {
        super.paintText(g, c, textRect, text);
        AbstractButton button = (AbstractButton) c;
        updateButtonStyleOnRollover(button);
    }

    private void setButtonProperties(AbstractButton button) {
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.setFont(button.getFont().deriveFont(Font.PLAIN));
        button.setForeground(NORMAL_COLOR);
        button.setOpaque(false);
    }

    private void drawButtonBorder(Graphics g, AbstractButton button) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(NORMAL_COLOR);
        g2.fillRect(0, 0, 2, button.getHeight());
        g2.fillRect(0, button.getHeight() - 2, button.getWidth(), 2);
    }

    private void updateButtonStyleOnRollover(AbstractButton button) {
        ButtonModel model = button.getModel();
        Color color = model.isRollover() ? NORMAL_COLOR : NORMAL_COLOR;
        if (model.isRollover()) {
            button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            button.setFont(button.getFont().deriveFont(Font.BOLD));
        } else {
            button.setCursor(Cursor.getDefaultCursor());
            button.setFont(button.getFont().deriveFont(Font.PLAIN));
        }
        Graphics g = button.getGraphics();
        g.setColor(color);
        g.setFont(button.getFont());
    }
}
