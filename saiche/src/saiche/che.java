package saiche;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

class che  extends JPanel implements KeyListener{
	int width;
	int height;
	BufferedImage image;	
	int x = 400;
	int y = 865;
	public che() throws IOException {
		image = ImageIO.read(getClass().getResource("che.PNG"));
		width = image.getWidth(); //74
		height = image.getHeight(); //92	
	}
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP){
            y-=10; 
        }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y+=10;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){             
            x-=10;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){             
            x+=10;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
      
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
