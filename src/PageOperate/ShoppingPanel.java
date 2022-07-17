package PageOperate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ShoppingPanel extends JPanel implements KeyListener{

    private int width, height; // 屏幕的宽和高

    public ShoppingPanel(int width, int height) {
        this.width = width;
        this.height = height;
        this.setSize(width, height);

        this.setFocusable(true); // 设置当前画布可以获得焦点
        this.addKeyListener(this); //设置自己为自己的按键事件监听器
    }

    @Override
    public void paintComponent(Graphics g) { }

    @Override
    public void keyPressed(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) { }

    @Override
    public void keyTyped(KeyEvent e) { }

}
