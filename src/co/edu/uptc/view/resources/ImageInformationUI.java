package co.edu.uptc.view.resources;

import javax.swing.*;
import javax.swing.plaf.LabelUI;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageInformationUI extends LabelUI {
    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
        if (c instanceof JLabel) {
            JLabel label = (JLabel) c;
            Icon icon = label.getIcon();
            if (icon instanceof ImageIcon) {
                Image image = ((ImageIcon) icon).getImage();
                int x = 0;
                int y = 0;
                int labelWidth = 500;
                int labelHeight = 450;
                Image scaledImage = scaleImage(image, labelWidth, labelHeight);
                g.drawImage(scaledImage, x, y, label);
                drawWhiteCircle(g, label);
            }
        }
    }

    private Image scaleImage(Image image, int width, int height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bufferedImage;
    }

    private void drawWhiteCircle(Graphics g, JLabel label) {
        int circleSize = 50;
        int margin = 10;
        int x = margin;
        int y = label.getHeight() - circleSize - margin;
        g.setColor(Color.WHITE);
        g.fillOval(x, y, circleSize, circleSize);
        ImageIcon icon = new ImageIcon("src/co/edu/uptc/view/assets/medal.png");
        Image scaledIcon = scaleImage(icon.getImage(), circleSize, circleSize);
        g.drawImage(scaledIcon, x, y, label);
    }
}
