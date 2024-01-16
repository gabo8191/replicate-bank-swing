package co.edu.uptc.view.resources;

import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicTextFieldUI;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class TextFieldUi extends BasicTextFieldUI {

    private static final Color GRAY_BORDER_COLOR = new Color(128, 128, 128);

    @Override
    protected void installDefaults() {
        super.installDefaults();
        JTextField textField = (JTextField) getComponent();
        textField.setBorder(new LineBorder(GRAY_BORDER_COLOR));
    }
}
