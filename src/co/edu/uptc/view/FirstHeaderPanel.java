package co.edu.uptc.view;

import javax.swing.*;

import co.edu.uptc.view.resources.CorporateButtonUi;
import co.edu.uptc.view.resources.HelpButtonUi;
import co.edu.uptc.view.resources.PersonButtonUi;
import co.edu.uptc.view.resources.SimpleButtonHeaderUi;

import java.awt.*;

public class FirstHeaderPanel extends JPanel {

    private JButton peopleButton, corporateButton, panamaButton, analysisButton, helpButton;
    private JLabel leftSpace, space, separator, rightSpace;

    public FirstHeaderPanel() {
        initComponents();
        this.setBackground(Color.WHITE);
    }

    private void initComponents() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        leftSpace = new JLabel(" ");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        add(leftSpace, gridBagConstraints);

        peopleButton = new JButton("Personas");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        peopleButton.setUI(new PersonButtonUi());
        add(peopleButton, gridBagConstraints);

        corporateButton = new JButton("Corporate");
        gridBagConstraints.gridx = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        corporateButton.setUI(new CorporateButtonUi());
        add(corporateButton, gridBagConstraints);

        space = new JLabel(" ");
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        add(space, gridBagConstraints);

        panamaButton = new JButton("Itaú Panamá");
        gridBagConstraints.gridx = 5;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        panamaButton.setUI(new SimpleButtonHeaderUi());
        add(panamaButton, gridBagConstraints);

        analysisButton = new JButton("Análisis económico y estrategia");
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        analysisButton.setUI(new SimpleButtonHeaderUi());
        add(analysisButton, gridBagConstraints);

        separator = new JLabel(" ");
        gridBagConstraints.gridx = 8;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(separator, gridBagConstraints);

        helpButton = new JButton("Te ayudamos");
        gridBagConstraints.gridx = 9;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        helpButton.setUI(new HelpButtonUi());
        add(helpButton, gridBagConstraints);

        rightSpace = new JLabel(" ");
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(rightSpace, gridBagConstraints);

    }
}
