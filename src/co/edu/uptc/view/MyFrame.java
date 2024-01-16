package co.edu.uptc.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame {
    private FirstHeaderPanel firstHeaderPanel;
    private SecondHeaderPanel secondHeaderPanel;
    private WelcomePanel welcomePanel;
    private InformationPanel informationPanel;
    private MyDialog loginDialog;

    public MyFrame(ActionListener listener) {
        super("Banco Itau");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents(listener);
        this.setSize(1920, 1080);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void initComponents(ActionListener actionListener) {
        JPanel container = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(container);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.add(scrollPane);

        JPanel headerContainer = new JPanel(new BorderLayout());
        firstHeaderPanel = new FirstHeaderPanel();
        firstHeaderPanel.setPreferredSize(new Dimension(container.getWidth(), 35));
        headerContainer.add(firstHeaderPanel, BorderLayout.NORTH);
        secondHeaderPanel = new SecondHeaderPanel(actionListener);
        secondHeaderPanel.setPreferredSize(new Dimension(container.getWidth(), 70));
        headerContainer.add(secondHeaderPanel, BorderLayout.SOUTH);
        container.add(headerContainer, BorderLayout.NORTH);

        JPanel principalContainer = new JPanel(new BorderLayout());
        welcomePanel = new WelcomePanel();
        welcomePanel.setPreferredSize(new Dimension(container.getWidth(), 700));
        principalContainer.add(welcomePanel, BorderLayout.NORTH);

        container.add(principalContainer, BorderLayout.CENTER);

        informationPanel = new InformationPanel();
        informationPanel.setPreferredSize(new Dimension(container.getWidth(), 700));
        container.add(informationPanel, BorderLayout.SOUTH);
    }

    public void showLoginDialog() {
        loginDialog = new MyDialog();
    }

    public void closeLoginDialog() {
        loginDialog.dispose();
    }

}
