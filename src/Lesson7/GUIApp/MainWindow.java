package Lesson7.GUIApp;

import Lesson7.GUIApp.windowParts.GamePanel;
import Lesson7.GUIApp.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 23.12.2021
 */

public class MainWindow extends JFrame {

    private int widthW = 1024;
    private int heightW = 768;
    private int posXW = 300;
    private int posYW = 200;
    private String titleW  = "Game Alive Player";

    private InfoPanel infoPanel;
    private GamePanel map;

    MainWindow() {
        setupWindow();

        map = new GamePanel();
        infoPanel = new InfoPanel(this);

        add(map);
        add(infoPanel, BorderLayout.EAST);

        setVisible(true);

    }

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(widthW,heightW);
        setLocation(posXW, posYW);
        setTitle(titleW);
        setResizable(false);
    }

}
