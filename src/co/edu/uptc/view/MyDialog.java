package co.edu.uptc.view;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.uptc.view.resources.CompaniesButtonUi;
import co.edu.uptc.view.resources.CopyrightFooterUi;
import co.edu.uptc.view.resources.FooterDialogUi;
import co.edu.uptc.view.resources.LoginDialogUi;
import co.edu.uptc.view.resources.PeopleButtonUI;
import co.edu.uptc.view.resources.RegisterDialogUi;
import co.edu.uptc.view.resources.TextFieldUi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;

public class MyDialog extends JDialog {

    private JLabel logoLabel, headerLabel, vigilateLabel, loginLabel, politicsLabel, unlockUser, imageFooter1,
            imageFooter2, imageFooter3, imageFooter4, globalImage, copyrightLabel, consumerLabel, termsLabel,
            sarlafLabel;
    private JButton loginButton, registerButton, buttonLoginNormal, buttonRegisterNormal;
    private JPanel loginPanel, internPanel, contentPane, panel1, panel2, panel3;
    private JTextField loginTextField;
    private JCheckBox checkBox;

    public MyDialog() {
        this.setTitle("Login");
        this.setSize(1920, 1080);
        this.setLocationRelativeTo(null);
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        setContentPane(contentPane);

        panel1 = new JPanel();
        panel1.setBackground(Color.decode("#E6E6E6"));
        panel1.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, 150));
        contentPane.add(panel1);

        panel2 = new JPanel();
        panel2.setBackground(Color.decode("#E6E6E6"));
        panel2.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, 400));
        contentPane.add(panel2);

        panel3 = new JPanel();
        panel3.setBackground(Color.decode("#E6E6E6"));
        panel3.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, 400));
        contentPane.add(panel3);

        componentsPanel1(panel1);
        componentsPanel2(panel2);
        componentsPanel3(panel3);
    }

    private void componentsPanel1(JPanel panel) {
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        panel.setLayout(gridBagLayout);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.weightx = 15;
        constraints.weighty = 0.5;
        constraints.anchor = GridBagConstraints.NORTHWEST;
        panel.add(new JLabel(""), constraints);

        logoLabel = new JLabel("");
        logoLabel.setOpaque(true);
        logoLabel.setBackground(Color.decode("#ec7000"));
        ImageIcon icon = new ImageIcon("src/co/edu/uptc/view/assets/logo.png");
        Image image = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        logoLabel.setIcon(new ImageIcon(image));

        logoLabel.setHorizontalAlignment(JLabel.CENTER);
        logoLabel.setVerticalAlignment(JLabel.CENTER);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 120;
        constraints.ipady = 120;
        constraints.insets = new Insets(0, 5, 0, 2);

        panel.add(logoLabel, constraints);

        constraints.gridx = 4;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.weightx = 0.1;
        constraints.weighty = 0.5;
        panel.add(new JLabel(""), constraints);

        headerLabel = new JLabel("");
        ImageIcon icon2 = new ImageIcon("src/co/edu/uptc/view/assets/header.png");
        Image image2 = icon2.getImage().getScaledInstance(1000, 250, Image.SCALE_SMOOTH);
        headerLabel.setIcon(new ImageIcon(image2));
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 5;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.insets = new Insets(0, 2, 0, 5);
        panel.add(headerLabel, constraints);

        constraints.gridx = 6;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.insets = new Insets(10, 0, 0, 10);
        panel.add(new JLabel(""), constraints);
    }

    private void componentsPanel2(JPanel panel) {
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        panel.setLayout(gridBagLayout);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.weightx = 0.067;
        constraints.weighty = 0.5;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(new JLabel(""), constraints);

        vigilateLabel = new JLabel("");
        ImageIcon icon = new ImageIcon("src/co/edu/uptc/view/assets/vigilate.png");
        vigilateLabel.setIcon(icon);
        constraints.anchor = GridBagConstraints.NORTHWEST;
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.0;
        constraints.weighty = 0.5;
        constraints.insets = new Insets(0, 0, 0, 0);
        panel.add(vigilateLabel, constraints);

        loginPanel = new JPanel();
        loginPanel.setBackground(Color.WHITE);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.067;
        constraints.weighty = 0.05;
        loginPanel.setPreferredSize(new Dimension(10, 400));
        constraints.insets = new Insets(0, 0, 0, 10);
        panel.add(loginPanel, constraints);

        GridBagLayout gridBagLayout2 = new GridBagLayout();
        GridBagConstraints constraints2 = new GridBagConstraints();
        internPanel = new JPanel();
        internPanel.setBackground(Color.WHITE);
        internPanel.setLayout(gridBagLayout2);

        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 1;
        constraints2.gridheight = 1;
        constraints2.weightx = 0.0;
        constraints2.weighty = 0.1;
        constraints2.anchor = GridBagConstraints.WEST;
        constraints2.insets = new Insets(5, 2, 2, 5);
        constraints2.fill = GridBagConstraints.BOTH;

        loginButton = new JButton("Personas");
        loginButton.setUI(new PeopleButtonUI());
        loginButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        loginButton.setForeground(Color.decode("#ec7000"));
        loginButton.setUI(new PeopleButtonUI());
        internPanel.add(loginButton, constraints2);

        registerButton = new JButton("Empresas");
        constraints2.gridy = 0;
        constraints2.gridx = 1;
        constraints2.weightx = 0.0;
        registerButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        registerButton.setForeground(Color.decode("#4d4d4d"));
        registerButton.setUI(new CompaniesButtonUi());
        internPanel.add(registerButton, constraints2);

        loginLabel = new JLabel("Usuario");
        constraints2.gridy = 2;
        constraints2.gridx = 0;
        constraints2.gridwidth = 2;
        constraints2.insets = new Insets(0, 5, 5, 0);
        loginLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        loginLabel.setForeground(Color.decode("#4d4d4d"));
        internPanel.add(loginLabel, constraints2);

        loginTextField = new JTextField();
        constraints2.gridy = 3;
        constraints2.weightx = 0.1;
        constraints2.insets = new Insets(5, 2, 2, 5);
        loginTextField.setUI(new TextFieldUi());
        internPanel.add(loginTextField, constraints2);

        checkBox = new JCheckBox("For English");
        checkBox.setBackground(Color.WHITE);
        checkBox.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        checkBox.setForeground(Color.decode("#4d4d4d"));
        constraints2.gridy = 4;
        internPanel.add(checkBox, constraints2);

        politicsLabel = new JLabel(
                "<html><body><p>Hemos cambiado nuestra política de datos, <br> para mayor información haz clic <a href=\"\" style=\"color: #106EB0\">aquí</a></p></body></html>");
        politicsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        politicsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                politicsLabel.setText(
                        "<html><body><p>Hemos cambiado nuestra política de datos, <br> para mayor información haz clic <a href=\"\" style=\"color: #0D4A7C; \">aquí</a></p></body></html>");
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                politicsLabel.setText(
                        "<html><body><p>Hemos cambiado nuestra política de datos, <br> para mayor información haz clic <a href=\"\" style=\"color: #106EB0\">aquí</a></p></body></html>");
            }
        });
        constraints2.gridy = 5;
        internPanel.add(politicsLabel, constraints2);

        buttonLoginNormal = new JButton("Ingresar");
        constraints2.gridy = 6;
        buttonLoginNormal.setUI(new LoginDialogUi());
        internPanel.add(buttonLoginNormal, constraints2);

        buttonRegisterNormal = new JButton("<html>Registrarse</html>");
        constraints2.gridy = 7;
        buttonRegisterNormal.setUI(new RegisterDialogUi());
        internPanel.add(buttonRegisterNormal, constraints2);

        unlockUser = new JLabel(
                "<html><body><p style=\"color: #106EB0\"><b><u>Desbloquea tu usuario aquí</u></b></p></body></html>");
        constraints2.gridy = 8;
        unlockUser.setHorizontalAlignment(JLabel.CENTER);
        unlockUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unlockUser.setText(
                        "<html><body><p style=\"color: #0D4A7C\"><b><u>Desbloquea tu usuario aquí</u></b></p></body></html>");
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                unlockUser.setText(
                        "<html><body><p style=\"color: #106EB0\"><b><u>Desbloquea tu usuario aquí</u></b></p></body></html>");
            }
        });
        unlockUser.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        internPanel.add(unlockUser, constraints2);

        constraints2.gridy = 9;
        constraints.gridheight = 4;
        internPanel.add(new JLabel(""), constraints2);

        loginPanel.add(internPanel, constraints2);

        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.07;
        constraints.weighty = 0.05;
        constraints.insets = new Insets(0, 0, 0, 10);
        panel.add(new JLabel(""), constraints);

        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridwidth = 7;
        constraints.gridheight = 3;
        constraints.weightx = 0.4;
        panel.add(new JLabel(""), constraints);
    }

    private void componentsPanel3(JPanel panel) {
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 0.3;
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.NORTHWEST;
        constraints.insets = new Insets(0, 10, 0, 0);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(new JLabel(""), constraints);

        imageFooter1 = new JLabel("");
        ImageIcon icon = new ImageIcon("src/co/edu/uptc/view/assets/ms_001.jpg");
        imageFooter1.setIcon(icon);
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.009;
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(imageFooter1, constraints);

        imageFooter2 = new JLabel("");
        ImageIcon icon2 = new ImageIcon("src/co/edu/uptc/view/assets/ms_002.jpg");
        imageFooter2.setIcon(icon2);
        constraints.gridx = 3;
        constraints.gridy = 0;
        panel.add(imageFooter2, constraints);

        imageFooter3 = new JLabel("");
        ImageIcon icon3 = new ImageIcon("src/co/edu/uptc/view/assets/ms_003.jpg");
        imageFooter3.setIcon(icon3);
        constraints.gridx = 4;
        constraints.gridy = 0;
        panel.add(imageFooter3, constraints);

        imageFooter4 = new JLabel("");
        ImageIcon icon4 = new ImageIcon("src/co/edu/uptc/view/assets/ms_004.jpg");
        imageFooter4.setIcon(icon4);
        constraints.gridx = 5;
        constraints.gridy = 0;
        panel.add(imageFooter4, constraints);

        consumerLabel = new JLabel("Defensor del Consumidor Financiero");
        consumerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        consumerLabel.setForeground(Color.decode("#4d4d4d"));
        constraints.gridx = 6;
        constraints.gridy = 0;
        consumerLabel.setUI(new FooterDialogUi());
        panel.add(consumerLabel, constraints);

        termsLabel = new JLabel("Términos y condiciones");
        termsLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        termsLabel.setForeground(Color.decode("#4d4d4d"));
        constraints.gridx = 7;
        constraints.gridy = 0;
        termsLabel.setUI(new FooterDialogUi());
        panel.add(termsLabel, constraints);

        sarlafLabel = new JLabel("Sarlaf");
        sarlafLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        sarlafLabel.setForeground(Color.decode("#4d4d4d"));
        constraints.gridx = 8;
        constraints.gridy = 0;
        sarlafLabel.setUI(new FooterDialogUi());
        panel.add(sarlafLabel, constraints);

        constraints.gridx = 9;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.weightx = 0.01;
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(0, 10, 0, 10);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(new JLabel(""), constraints);

        globalImage = new JLabel("");
        ImageIcon icon8 = new ImageIcon("src/co/edu/uptc/view/assets/global.png");
        globalImage.setIcon(icon8);
        constraints.gridx = 12;
        constraints.gridy = 0;
        constraints.insets = new Insets(0, 15, 0, 0);
        panel.add(globalImage, constraints);

        constraints.gridx = 13;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 0.1;
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.NORTHEAST;
        constraints.insets = new Insets(0, 0, 0, 10);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(new JLabel(""), constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 7;
        constraints.gridheight = 1;
        constraints.weightx = 0.1;
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(0, 10, 0, 0);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(new JLabel(""), constraints);

        copyrightLabel = new JLabel("COPYRIGHT© 2023 Itaú Colombia S. A.");
        copyrightLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        copyrightLabel.setForeground(Color.decode("#4d4d4d"));
        constraints.gridx = 7;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(0, 0, 20, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        copyrightLabel.setUI(new CopyrightFooterUi());
        panel.add(copyrightLabel, constraints);

        constraints.gridx = 8;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 0.1;
        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(0, 0, 20, 0);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(new JLabel(""), constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 13;
        constraints.gridheight = 1;
        constraints.weightx = 0.1;
        constraints.weighty = 1.1;
        constraints.anchor = GridBagConstraints.SOUTH;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(new JLabel(""), constraints);
    }

}
