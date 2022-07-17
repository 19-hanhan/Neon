package PageOperate;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class IntroductionPanel extends JPanel implements KeyListener{

    private int width, height; // 屏幕的宽和高

    public IntroductionPanel(int width, int height) {
        this.width = width;
        this.height = height;
        this.setSize(width, height);

        this.addKeyListener(this); //设置自己为自己的按键事件监听器
    }

    private String[] menus = new String[]{
            "开发团队介绍：",
            "刘晟：代码编写，程序开发",
            "吴文龙：界面设计，游戏调试",
            "周佳俊：游戏剧情策划",
            "张泓滔：游戏美工设计",
            "",
            "游戏介绍",
            "《小霓的星辰大海》为一款横板跑酷闯关游戏","玩家通过键盘输入方向键控制游戏主角进行移动躲避障碍物",
            "通过捡取金币购买游戏道具",
            "闯关解锁更多关卡及成就",
            "",
            "玩法介绍",
            "space：跳跃",
            "←：向左移动",
            "→：向右移动"
    }; // 要显示的菜单项
    private int menu_x = 160; // 菜单项位置的横坐标

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        //画绿色背景
        g.setColor(new Color(0x90ee90));
        g.fillRect(0, 0, width, height);

        //绘制菜单项。焦点所在的菜单用红色，其它为黑色。
        for (int i = 0; i < menus.length; i++) {

            int x = menu_x;
            int y = (i + 1) * 20;

            g.setColor(Color.black);

            g.drawString(menus[i], x, y);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) { }

    @Override
    public void keyTyped(KeyEvent e) { }

}
