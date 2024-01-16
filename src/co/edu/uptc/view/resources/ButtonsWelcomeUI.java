package co.edu.uptc.view.resources;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

public class ButtonsWelcomeUI extends BasicButtonUI {
    private ImageIcon originalIcon;
    private ImageIcon whiteLineIcon;
    private static final String ARROW = " > ";
    private static final Color ARROW_COLOR = Color.decode("#ec7000");

    public ButtonsWelcomeUI(String pathIcon, String pathWhiteLineIcon) {
        originalIcon = new ImageIcon(pathIcon);
        whiteLineIcon = new ImageIcon(pathWhiteLineIcon);
        int iconSize = 40;
        scaledOriginalIcon = scaleIcon(originalIcon, iconSize);
        whiteLineIcon = scaleIcon(whiteLineIcon, iconSize);
    }

    private void setArrowColor(AbstractButton button, Color arrowColor) {
        String text = button.getText();
        String coloredText = "<html><font color='" + colorToHex(Color.BLACK) + "'>" + text.replace(ARROW, "") +
                "</font><font color='" + colorToHex(arrowColor) + "'>" + ARROW + "</font></html>";
        button.setText(coloredText);
    }

    private String colorToHex(Color color) {
        return String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
    }

    @Override
    protected void installDefaults(AbstractButton button) {
        super.installDefaults(button);
        Font font = new Font("Segoe UI", Font.PLAIN, 12);
        button.setFont(font);
        button.setForeground(Color.black);
        button.setBorderPainted(false);
        button.setText(button.getText() + ARROW);
        setArrowColor(button, ARROW_COLOR);
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setIcon(scaledOriginalIcon);
        button.setVerticalTextPosition(AbstractButton.BOTTOM);
        button.setHorizontalTextPosition(AbstractButton.CENTER);
        button.setLayout(new BoxLayout(button, BoxLayout.Y_AXIS));
        button.setBorder(BorderFactory.createEmptyBorder(50, 5, 50, 60));
        button.setIconTextGap(30);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setIcon(whiteLineIcon);
                button.setFont(new Font("Segoe UI", Font.BOLD, 12));
                button.setBorderPainted(true);
                button.setBorder(BorderFactory.createEmptyBorder(10, 5, 50, 60));
                button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setIcon(scaledOriginalIcon);
                button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                button.setBorderPainted(false);
                button.setBorder(BorderFactory.createEmptyBorder(50, 5, 50, 60));
                button.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }

    public void paint(Graphics g, JComponent c) {
        AbstractButton button = (AbstractButton) c;
        Graphics2D g2d = (Graphics2D) g;
        int width = c.getWidth();
        int height = c.getHeight();
        int arc = 10;
        button.setOpaque(false);
        g2d.setColor(Color.decode("#f7f4f2"));
        g2d.fillRoundRect(0, 0, width, height, arc, arc);
        super.paint(g2d, c);
        if (button.getModel().isRollover()) {
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, height - 30, width, 30);
        }
    }

    @Override
    protected void paintIcon(Graphics g, JComponent c, Rectangle iconRect) {
        if (c instanceof AbstractButton && ((AbstractButton) c).getModel().isRollover()) {
            g.setColor(Color.decode("#ec7000"));
            int circleSize = Math.min(iconRect.width, iconRect.height) + 15;
            int x = iconRect.x + (iconRect.width - circleSize) / 2;
            int y = iconRect.y + (iconRect.height - circleSize) / 2;
            g.fillOval(x, y, circleSize, circleSize);
        }
        super.paintIcon(g, c, iconRect);
    }

    private ImageIcon scaleIcon(ImageIcon icon, int size) {
        Image scaledImage = icon.getImage().getScaledInstance(size, size, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    private ImageIcon scaledOriginalIcon;
}