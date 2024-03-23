package com.dhr.window;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainWindow extends JFrame {
    private static final String main_title = "个人网站";

    public MainWindow() {
        super(main_title);
        Container container = this.getContentPane();
        container.add(this.setPanel());
        this.setBounds(300, 200, 800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    /**
     * 设置 panel 面板
     *
     * @return
     */
    public JPanel setPanel() {
        UserWindow userWindow = new UserWindow();
        return userWindow.createUserPanel();
    }
}
