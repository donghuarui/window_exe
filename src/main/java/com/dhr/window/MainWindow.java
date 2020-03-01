package com.dhr.window;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainWindow extends JFrame {
    private String main_title = "个人网站";

    public MainWindow() {
        this.setFrame();
    }

    /**
     * 设置frame容器
     */
    public void setFrame() throws HeadlessException {
        super.setTitle(main_title);
//        super.add(this.setPanel());
        super.setContentPane(this.setPanel());


        super.setBounds(300, 200, 400, 200);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
