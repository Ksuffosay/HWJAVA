package Lesson7.GUIApp.windowParts.infoPanelParts;

import javax.swing.*;
import java.awt.*;



public class GameInfoArea extends JPanel {

    public GameInfoArea(){
        setLayout(new GridLayout(4, 1));
        add(new JLabel("=Game Info=", SwingConstants.CENTER));
        add(new JLabel("MAP:", SwingConstants.LEFT));
        add(new JLabel("LEVEL:", SwingConstants.LEFT));
        add(new JLabel("COUNT TRAP:", SwingConstants.LEFT));
    }


}
