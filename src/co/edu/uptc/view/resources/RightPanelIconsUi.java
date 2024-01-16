package co.edu.uptc.view.resources;

import javax.swing.*;
import javax.swing.plaf.LabelUI;
import java.awt.*;

public class RightPanelIconsUi extends LabelUI {

    @Override
    public void paint(Graphics g, JComponent c) {
        Icon icon = ((JLabel) c).getIcon();
        if (icon instanceof ImageIcon) {
            ImageIcon imageIcon = (ImageIcon) icon;
            Image originalImage = imageIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            int x = 0;
            int y = (c.getHeight() - resizedIcon.getIconHeight()) / 2;
            resizedIcon.paintIcon(c, g, x, y);
        }
    }
}