package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.view.resources.ButtonsHeader2UI;
import co.edu.uptc.view.resources.LoginButtonUi;
import co.edu.uptc.view.resources.RegisterButtonUi;

import java.awt.Color;

public class SecondHeaderPanel extends JPanel {

    private JButton benefitsButton, productsButton, internationalButton, registerButton, loginButton;
    private JLabel logo, leftSpace, space, rightSpace;

    public SecondHeaderPanel(ActionListener listener) {
        initComponents(listener);
        this.setBackground(Color.decode("#ec7000"));
    }

    private void initComponents(ActionListener listener) {
        GridBagLayout gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        leftSpace = new JLabel(" ");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        add(leftSpace, gridBagConstraints);

        logo = new JLabel("");
        ImageIcon icon = new ImageIcon("src/co/edu/uptc/view/assets/logo.png");
        Image image = icon.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(image));
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        add(logo, gridBagConstraints);

        benefitsButton = new JButton("Beneficios Itaú ▼");
        gridBagConstraints.gridx = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        benefitsButton.setUI(new ButtonsHeader2UI());
        add(benefitsButton, gridBagConstraints);

        productsButton = new JButton("Productos ▼");
        gridBagConstraints.gridx = 3;
        productsButton.setUI(new ButtonsHeader2UI());
        add(productsButton, gridBagConstraints);

        internationalButton = new JButton("Negocios internacionales ▼");
        gridBagConstraints.gridx = 4;
        internationalButton.setUI(new ButtonsHeader2UI());
        add(internationalButton, gridBagConstraints);

        space = new JLabel(" ");
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        add(space, gridBagConstraints);

        registerButton = new JButton("Regístrate");
        gridBagConstraints.gridx = 7;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        registerButton.setUI(new RegisterButtonUi());
        add(registerButton, gridBagConstraints);

        loginButton = new JButton("Ingresa");
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        loginButton.setUI(new LoginButtonUi());
        loginButton.addActionListener(listener);
        loginButton.setActionCommand("login");
        add(loginButton, gridBagConstraints);

        rightSpace = new JLabel(" ");
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(rightSpace, gridBagConstraints);

    }
}
