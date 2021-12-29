package Lesson7.GUIApp.windowParts.infoPanelParts;

import javax.swing.*;
import java.awt.*;


public class PlayerControlArea extends JPanel {

    private JButton playerUp;
    private JButton playerLeft;
    private JButton playerRight;
    private JButton playerDown;

    public PlayerControlArea(){
        setLayout(new GridLayout(6, 6));

        playerUp = new JButton("UP");
        playerLeft = new JButton("LEFT");
        playerRight = new JButton("RIGHT");
        playerDown = new JButton("DOWN");

        add(playerUp);
        add(playerLeft);
        add(playerRight);
        add(playerDown);


    }


}
