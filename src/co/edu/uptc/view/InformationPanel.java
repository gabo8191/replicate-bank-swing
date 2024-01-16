package co.edu.uptc.view;

import javax.swing.*;

import co.edu.uptc.view.resources.ButtonsInformationUi;
import co.edu.uptc.view.resources.ImageInformationUI;
import co.edu.uptc.view.resources.RightPanelIconsUi;
import co.edu.uptc.view.resources.RoundedPanelUi;

import java.awt.*;

public class InformationPanel extends JPanel {

        private JLabel titleLabel, descriptionLabel, informationImage, AmericaLabel, valueLabel, imageLabel1,
                        titleRight, descriptionRight;
        private RoundedPanelUi leftPanel, rightPanel;
        private JButton buttonKnowMore, buttonRight;

        public InformationPanel() {
                initComponents();
                setPreferredSize(new Dimension(getPreferredSize().width, 700));
                setBackground(Color.WHITE);
        }

        private void initComponents() {
                setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();

                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.weightx = 0.5;
                gbc.weighty = 0.5;
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.insets = new Insets(10, 10, 0, 0);
                add(new JLabel(" "), gbc);

                titleLabel = new JLabel(
                                "<html><font color='gray'>Creemos en el poder transformador de las</font> <font color='orange'>personas</font></html>");
                titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.gridwidth = 2;
                gbc.gridheight = 1;
                gbc.weightx = 1;
                gbc.weighty = 0.1;
                gbc.fill = GridBagConstraints.BOTH;
                add(titleLabel, gbc);

                descriptionLabel = new JLabel(
                                "<html><body><p style='width: 500px;'>A través del arte, la educación financiera y nuevas opciones de movilidad.</p></body></html>");
                descriptionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.gridwidth = 2;
                gbc.gridheight = 1;
                gbc.weightx = 1;
                gbc.weighty = 0.1;
                gbc.fill = GridBagConstraints.BOTH;
                add(descriptionLabel, gbc);

                componentsLeftPanel(gbc);

                gbc.insets = new Insets(10, 10, 10, 10);
                gbc.gridx = 3;
                gbc.gridy = 2;
                gbc.gridheight = 3;
                gbc.weightx = 2;
                gbc.fill = GridBagConstraints.BOTH;
                gbc.weighty = 0.6;

                componentsRightPanels(gbc);

                gbc.gridx = 3;
                gbc.gridy = 5;
                gbc.weightx = 1.0;
                gbc.weighty = 2.0;
                gbc.anchor = GridBagConstraints.SOUTH;
                add(new JLabel(" "), gbc);
        }

        private void componentsLeftPanel(GridBagConstraints gbc) {
                leftPanel = new RoundedPanelUi();
                leftPanel.setLayout(new GridBagLayout());
                leftPanel.setBackground(new Color(247, 244, 242));
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.gridwidth = 1;
                gbc.gridheight = 3;
                gbc.weightx = 0.0;
                gbc.weighty = 0.6;
                gbc.fill = GridBagConstraints.BOTH;
                add(leftPanel, gbc);

                ImageIcon imageIcon = new ImageIcon("src/co/edu/uptc/view/assets/information.png");
                informationImage = new JLabel(imageIcon);
                informationImage.setPreferredSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.gridheight = 1;
                gbc.insets = new Insets(0, 0, 0, 0);
                gbc.fill = GridBagConstraints.CENTER;
                informationImage.setUI(new ImageInformationUI());
                leftPanel.add(informationImage, gbc);

                AmericaLabel = new JLabel("#1 de América Latina");
                AmericaLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
                gbc.gridy = 1;
                gbc.gridwidth = GridBagConstraints.REMAINDER;
                gbc.fill = GridBagConstraints.BOTH;
                gbc.insets = new Insets(10, 10, 10, 10);
                leftPanel.add(AmericaLabel, gbc);

                valueLabel = new JLabel(
                                "<html><body><p style='width: 350px;'>El valor de nuestra marca creció un 32% respecto a 2022, alcanzando una valoración actual de US 8,7 Bi. Ranking Global 500 Brand Finance 2023.</p></body></html>");
                valueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                gbc.gridy = 2;
                gbc.gridwidth = GridBagConstraints.REMAINDER;
                gbc.gridheight = 2;
                leftPanel.add(valueLabel, gbc);
                gbc.gridy = 5;
                gbc.fill = GridBagConstraints.NONE;
                gbc.insets = new Insets(10, 10, 10, 10);

                buttonKnowMore = new JButton("Quiero saber más >");
                buttonKnowMore.setForeground(new Color(12, 83, 132));
                buttonKnowMore.setUI(new ButtonsInformationUi());
                leftPanel.add(buttonKnowMore, gbc);
        }

        private void createRightPanel(String title, String description, String pathImage, int gridY,
                        String buttonText) {
                GridBagConstraints gbc = new GridBagConstraints();

                rightPanel = new RoundedPanelUi();
                rightPanel.setBackground(new Color(247, 244, 242));
                rightPanel.setPreferredSize(new Dimension(400, 100));
                rightPanel.setLayout(new GridBagLayout());

                ImageIcon imageIcon = new ImageIcon(pathImage);
                imageLabel1 = new JLabel(imageIcon);
                imageLabel1.setPreferredSize(new Dimension(50, 50));

                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.weightx = 0.5;
                gbc.weighty = 0.5;
                gbc.gridwidth = 1;
                gbc.gridheight = 3;
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.insets = new Insets(10, 20, 10, 0);
                gbc.fill = GridBagConstraints.NONE;
                imageLabel1.setUI(new RightPanelIconsUi());
                rightPanel.add(imageLabel1, gbc);

                titleRight = new JLabel(title);
                titleRight.setFont(new Font("Segoe UI", Font.BOLD, 18));
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.weightx = 10;
                gbc.weighty = 0.5;

                gbc.gridwidth = 2;
                gbc.gridheight = 1;
                gbc.fill = GridBagConstraints.WEST;
                rightPanel.add(titleRight, gbc);

                descriptionRight = new JLabel(description);
                descriptionRight.setFont(new Font("Segoe UI", Font.PLAIN, 13));
                gbc.gridy = 1;
                gbc.gridwidth = 2;
                rightPanel.add(descriptionRight, gbc);

                buttonRight = new JButton(buttonText);
                buttonRight.setForeground(new Color(12, 83, 132));
                buttonRight.setUI(new ButtonsInformationUi());
                gbc.gridy = 2;
                gbc.gridx = 1;
                gbc.gridwidth = 1;
                rightPanel.add(buttonRight, gbc);

                gbc.gridx = 2;
                gbc.gridy = gridY;
                gbc.gridwidth = 1;
                gbc.gridheight = 1;
                gbc.weightx = 1.0;
                gbc.weighty = 0.2;
                gbc.fill = GridBagConstraints.BOTH;
                gbc.insets = new Insets(10, 10, 10, 10);
                add(rightPanel, gbc);
        }

        private void componentsRightPanels(GridBagConstraints gbc) {
                createRightPanel("Distrito Naranja",
                                "<html><body><p style='width: 350px;'>Un espacio de Itaú para el arte donde apoyamos e impulsamos obras y artistas nacionales</p></body></html>",
                                "src/co/edu/uptc/view/assets/happy.png", 2, "Quiero saber más >");
                createRightPanel("Bike Itaú",
                                "<html><body><p style='width: 350px;'>Programa de movilidad de Itaú en Latinoamérica que patrocina el sistema de bicicletas compartidas de Bogotá.</p></body></html>",
                                "src/co/edu/uptc/view/assets/bike.png", 3, "Me interesa >");
                createRightPanel("Ahora lo sabes con Itaú",
                                "<html><body><p style='width: 350px;'>Nuestra plataforma de educación financiera con contenidos cortos y fáciles de entender sobre la banca.</p></body></html>",
                                "src/co/edu/uptc/view/assets/microphone.png", 4, "Conéctate >");
        }

}
