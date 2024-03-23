package com.dhr.window;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainWindow extends JFrame {
    private static final String main_title = "个人网站";

    private UserWindow userWindow;

    public MainWindow(UserWindow userWindow) {
        super(main_title);
        this.userWindow = userWindow;
        Container container = this.getContentPane();
        container.add(this.getUserPanel());
        this.setBounds(300, 200, 800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    /**
     * 设置 panel 面板
     *
     * @return
     */
    public JPanel getUserPanel() {
        return userWindow.createUserPanel();
    }
}
