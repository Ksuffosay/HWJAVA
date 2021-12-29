package Lesson7.GUIApp.windowParts.infoPanelParts;

import javax.swing.*;
import java.awt.*;


public class PlayerInfoArea extends JPanel {

    public PlayerInfoArea(){
        setLayout(new GridLayout(5, 1));
        add(new JLabel("=Player=", SwingConstants.CENTER));
        add(new JLabel("HP:", SwingConstants.LEFT));
        add(new JLabel("MANA:", SwingConstants.LEFT));
        add(new JLabel("ST:", SwingConstants.LEFT));
        add(new JLabel("EXP:", SwingConstants.LEFT));

    }
}
