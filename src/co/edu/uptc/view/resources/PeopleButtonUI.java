package co.edu.uptc.view.resources;

import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.Graphics;
import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class PeopleButtonUI extends BasicButtonUI {

    @Override
    public void paint(Graphics g, JComponent c) {
        AbstractButton button = (AbstractButton) c;
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        super.paint(g, c);
    }
}
