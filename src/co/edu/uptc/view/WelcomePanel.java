package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.view.resources.ButtonsWelcomeUI;
import java.awt.Insets;
import java.awt.Font;

public class WelcomePanel extends JPanel {
    private JLabel welcomeLabel, welcomeLabel2, descriptionLabel;
    private Image backgroundImage;
    private JButton payButton, accountsButton, attentionButton, daysButton, creditCardButton, appButton;

    public WelcomePanel() {
        initComponents();
        initButtonsComponents();
        loadBackgroundImage();
        this.setBackground(Color.WHITE);
    }

    private void initComponents() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 10, 0, 0);
        add(new JLabel(" "), gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 10, 0, 0);
        add(new JLabel(" "), gridBagConstraints);

        welcomeLabel = new JLabel("Te damos la bienvenida al nuevo");
        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 45));
        welcomeLabel.setForeground(Color.WHITE);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(5, 10, 0, 0);
        add(welcomeLabel, gridBagConstraints);

        welcomeLabel2 = new JLabel("portal Itaú");
        welcomeLabel2.setFont(new Font("Segoe UI", Font.BOLD, 45));
        welcomeLabel2.setForeground(Color.WHITE);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(5, 10, 0, 0);
        add(welcomeLabel2, gridBagConstraints);

        descriptionLabel = new JLabel("Más fácil de navegar y encontrar lo que necesitas");
        descriptionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        descriptionLabel.setForeground(Color.WHITE);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(10, 10, 0, 0);
        add(descriptionLabel, gridBagConstraints);

        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        add(new JLabel(" "), gridBagConstraints);

    }

    private void initButtonsComponents() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(new JLabel(), gridBagConstraints);

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setOpaque(false);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        gridBagConstraints.fill = GridBagConstraints.BOTH;

        payButton = new JButton("Itaú Pagos PSE");
        gridBagConstraints.gridx = 1;
        setButtonSize(payButton, 100, 150);
        String payIconPath = "src/co/edu/uptc/view/assets/dollar_orange.png";
        String payIconPathWhite = "src/co/edu/uptc/view/assets/dollar.png";
        payButton.setUI(new ButtonsWelcomeUI(payIconPath, payIconPathWhite));
        buttonPanel.add(payButton, gridBagConstraints);

        accountsButton = new JButton("Cuentas Itaú");
        setButtonSize(accountsButton, 100, 150);
        gridBagConstraints.gridx = 2;
        String accountsIconPath = "src/co/edu/uptc/view/assets/saving_orange.png";
        String accountsIconPathWhite = "src/co/edu/uptc/view/assets/saving.png";
        accountsButton.setUI(new ButtonsWelcomeUI(accountsIconPath, accountsIconPathWhite));
        buttonPanel.add(accountsButton, gridBagConstraints);

        attentionButton = new JButton("Puntos de atención");
        setButtonSize(attentionButton, 100, 150);
        gridBagConstraints.gridx = 3;
        String attentionIconPath = "src/co/edu/uptc/view/assets/location_orange.png";
        String attentionIconPathWhite = "src/co/edu/uptc/view/assets/location.png";
        attentionButton.setUI(new ButtonsWelcomeUI(attentionIconPath, attentionIconPathWhite));
        buttonPanel.add(attentionButton, gridBagConstraints);

        daysButton = new JButton("Días Itaú");
        setButtonSize(daysButton, 100, 150);
        gridBagConstraints.gridx = 4;
        String daysIconPath = "src/co/edu/uptc/view/assets/calendar_orange.png";
        String daysIconPathWhite = "src/co/edu/uptc/view/assets/calendar.png";
        daysButton.setUI(new ButtonsWelcomeUI(daysIconPath, daysIconPathWhite));
        buttonPanel.add(daysButton, gridBagConstraints);

        creditCardButton = new JButton("Tarjeta de crédito");
        setButtonSize(creditCardButton, 100, 150);
        gridBagConstraints.gridx = 5;
        String creditCardIconPath = "src/co/edu/uptc/view/assets/credit_card_orange.png";
        String creditCardIconPathWhite = "src/co/edu/uptc/view/assets/credit_card.png";
        creditCardButton.setUI(new ButtonsWelcomeUI(creditCardIconPath, creditCardIconPathWhite));
        buttonPanel.add(creditCardButton, gridBagConstraints);

        appButton = new JButton("App y portal Itaú");
        setButtonSize(appButton, 100, 150);
        gridBagConstraints.gridx = 6;
        String appIconPath = "src/co/edu/uptc/view/assets/mobile_orange.png";
        String appIconPathWhite = "src/co/edu/uptc/view/assets/mobile.png";
        appButton.setUI(new ButtonsWelcomeUI(appIconPath, appIconPathWhite));
        buttonPanel.add(appButton, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        add(buttonPanel, gridBagConstraints);

        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        add(new JLabel(), gridBagConstraints);
    }

    private void setButtonSize(JButton button, int width, int height) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.ipadx = 0;
        gridBagConstraints.ipady = 0;
        button.setPreferredSize(new Dimension(width, height));
        button.setMaximumSize(new Dimension(width, height));
        button.setMinimumSize(new Dimension(width, height));
    }

    private void loadBackgroundImage() {
        ImageIcon backgroundImageIcon = new ImageIcon("src/co/edu/uptc/view/assets/hero.png");
        backgroundImage = backgroundImageIcon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            int halfHeight = backgroundImage.getHeight(this);
            g.drawImage(backgroundImage, 0, 0, getWidth(), halfHeight, 0, 0, backgroundImage.getWidth(this),
                    backgroundImage.getHeight(this) / 4 * 3, this);
        }
    }
}
