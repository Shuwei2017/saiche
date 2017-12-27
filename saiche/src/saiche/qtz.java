package saiche;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class qtz  extends JPanel  {
	dimian d;
	zhangai z;
	zhangai z2;
	che c = new che();
	boolean gameover;
	boolean start;
	BufferedImage startImages;
	BufferedImage gameOverImages;
	
	public static void main(String[] args) throws Exception  {
		JFrame frame = new JFrame("疯狂的赛车");
		
		frame.setSize(872, 1000);
		
		qtz panel = new qtz();
		frame.add(panel);// 把面板添加到窗体中
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);// 设置窗体居中
		frame.setVisible(true);// 让窗体可见
		
		while (true) {
			panel.action();// 让游戏动起来
		}
						
	}
	
	public qtz() throws IOException {
		 startImages =ImageIO.read(getClass().getResource("start.png"));
		 d = new dimian();
		 z =new zhangai(1);
		 z2 =new zhangai(2);
		 gameover = false;
		 start = false;
	}
	
	public void paint(Graphics g) {
		
		g.drawImage(d.image, d.x, d.y, null);
		g.drawImage(c.image, c.x, c.y, null);
			
		g.drawImage(z.image, z.x, z.y, null);
		g.drawImage(z2.image, z2.x, z2.y, null);
		if (gameover) {
			g.drawImage(gameOverImages, 0, 0, null);
		}
		if (!start) {
			g.drawImage(startImages, 0, 0, null);
		}
		
	}
	
	private void action() throws InterruptedException {
		MouseListener L = new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!start) {
					start = true;
				}	
			}
			
		};
		addMouseListener(L);
		
		KeyListener k = new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			
			}
		};
		
		if(start) 
		{//游戏开始后开始运动，没有开始静止。
			d.run();
			c.run();
			z.run();
			z2.run();
		}
			repaint();// 调用重绘方法，重复画面
			Thread.sleep(1000 / 60);// 线程的休眠方法	
		}
	}
