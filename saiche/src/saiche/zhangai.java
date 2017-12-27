package saiche;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class zhangai {
	int width;
	int height;
	BufferedImage image;
	
	int distance;
	int x;
	int y;
	
	
	public  zhangai(int n) throws IOException {
		
		image = ImageIO.read(getClass().getResource("zhanai2.PNG"));
		
		width = image.getWidth();     //134
		
		height = image.getHeight();    //143
		
		distance = 800;
		
		x = (int)(Math.random()*100);
		
		//x = 75;x = 649;
		while(x < 75 || x > 649) {
			x = (int)(Math.random()*1000);
		}
		
		//y = (int)(Math.random()*100);	
		
		y = -200 - (n-1)*distance;
		
		//System.out.println(x);
		//System.out.println(y);
		
	}
	
	public void run() {
		y++;
	}
}
