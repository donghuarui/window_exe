package com.dhr.window;

import com.dhr.component.HttpAPIService;
import com.dhr.entity.HttpResult;
import com.dhr.service.UserService;
import com.dhr.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.accessibility.AccessibleContext;
import javax.annotation.Resource;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserWindow {

    public JPanel createUserPanel() {
        JPanel p1 = new JPanel();    //面板1
        JPanel p2 = new JPanel();    //面板2
        JPanel p3 = new JPanel();    //面板24
        JPanel p4 = new JPanel();    //面板2
        JPanel cards = new JPanel(new CardLayout());    //卡片式布局的面板

        cards.add(p1, "card1");    //向卡片式布局面板中添加面板1
        cards.add(p2, "card2");    //向卡片式布局面板中添加面板2
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, "card1");    //调用show()方法显示面板1

        this.setLoginAndRegisterPanel(p1, cl, cards);
        this.setTextfieldPanel(p2, p3, p4, cl, cards);


        return cards;
    }

    public void setLoginAndRegisterPanel(JPanel p1, CardLayout cl, JPanel cards) {
        JButton login_btn = new JButton("登录");
        JButton regist_btn = new JButton("注册");
        p1.add(login_btn);
        p1.add(regist_btn);
        login_btn.addActionListener(e -> {
            cl.show(cards, "card2");    //调用show()方法显示面板2
        });
    }

    public void setTextfieldPanel(JPanel p2, JPanel p3, JPanel p4, CardLayout cl, JPanel cards) {
        p2.setLayout(new BorderLayout());
        JTextField jf1 = new JTextField("用户名文本框", 20);
        JTextField jf2 = new JTextField("密码文本框", 20);
        p3.add(jf1);
        p3.add(jf2);
        JButton ok_btn = new JButton("确认");
        JButton back_btn = new JButton("返回");
        p4.setLayout(new FlowLayout());
        p4.add(ok_btn);
        p4.add(back_btn);
        p2.add(p3, BorderLayout.CENTER);
        p2.add(p4, BorderLayout.SOUTH);

        back_btn.addActionListener(e -> {
            cl.show(cards, "card1");    //调用show()方法显示面板2
        });

        ok_btn.addActionListener(e -> {
            String username = jf1.getText();
            String password = jf2.getText();
            int confir_status = JOptionPane.showConfirmDialog(p2, "确定要登录吗？", "登录提示", 2);
            System.err.println(confir_status);
            if (confir_status == 0) {
                Map<String, Object> params = new HashMap<>();
                params.put("username", username);
                params.put("password", password);
                try {
                    this.login(params);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public void login(Map<String, Object> map) throws Exception {

        UserService userService = new UserServiceImpl();

        HttpResult httpResult = userService.doPost("http://localhost:9091/user/login", map, null);

        System.err.println(httpResult);

    }

}
