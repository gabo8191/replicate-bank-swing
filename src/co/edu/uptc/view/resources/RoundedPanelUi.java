package co.edu.uptc.view.resources;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedPanelUi extends JPanel {
    private int cornerRadius = 20;

    public RoundedPanelUi() {
        super();
        setOpaque(false);
    }

    public RoundedPanelUi(LayoutManager layout) {
        super(layout);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(getBackground());
        graphics.fill(new RoundRectangle2D.Float(0, 0, width, height, cornerRadius, cornerRadius));
        graphics.dispose();
    }
}
