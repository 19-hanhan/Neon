package PageOperate;
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JPanel;

import GamePage.IntroductionFrame;
import GamePage.ShoppingFrame;
import GamePage.StartFrame;
 
public class IndexPanel extends JPanel implements KeyListener{

	private int width, height; // 屏幕的宽和高
	
	public IndexPanel(int width, int height) {
		this.width = width;
		this.height = height;
		this.setSize(width, height);

		this.setFocusable(true); // 设置当前画布可以获得焦点
		this.addKeyListener(this); //设置自己为自己的按键事件监听器
	}

	private String[] menus = new String[]{"开始游戏", "游戏商店", "帮助关于", "退出游戏"}; // 要显示的菜单项
	private int focusIndex; // 当前焦点在哪个菜单项
	private int menu_x = 260; // 菜单项位置的横坐标
	private int[] menu_ys = new int[]{80, 110, 140, 170}; // 菜单项位置的纵坐标

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//画绿色背景
		g.setColor(new Color(0x90ee90));
		g.fillRect(0, 0, width, height);
		
		//绘制菜单项。焦点所在的菜单用红色，其它为黑色。
		for (int i = 0; i < menus.length; i++) {
			int x = menu_x;
			int y = menu_ys[i];
			
			//如果是焦点按钮，用红色突出
			if(i == focusIndex){
				g.setColor(Color.red);
			}else{
				g.setColor(Color.black);
			}
			g.drawString(menus[i], x, y);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();  //根据keyCode获得按下的是哪个键
		switch(keyCode) {
			case KeyEvent.VK_UP://往上的方向键
				focusIndex = (focusIndex - 1 + menus.length) % menus.length;   //考虑%取余的意义。
				this.repaint(); //刷新画布
				break;
			case KeyEvent.VK_DOWN://往下的方向键
				focusIndex = (focusIndex + 1) % menus.length;
				this.repaint();
				break;
			case KeyEvent.VK_ENTER: //如果是Enter键，进行对应操作
				System.out.println("用户点击：<" + focusIndex + ">——" + menus[focusIndex]);

				if (focusIndex == 0) {
					StartFrame frame = new StartFrame();
				}
				else if (focusIndex == 1) {
					ShoppingFrame frame = new ShoppingFrame();
				}
				else if (focusIndex == 2) {
					IntroductionFrame frame = new IntroductionFrame();
				}
				else {
					System.exit(0);
				}

				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) { }
 
	@Override
	public void keyTyped(KeyEvent e) { }

}