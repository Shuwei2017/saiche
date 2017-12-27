package saiche;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class che {
	int width;
	int height;
	BufferedImage image;
	
	double v; 
	double v2; 
	double s;
	double s2;
	double t;
	int x;
	int y;
	
	

	public che() throws IOException {
		image = ImageIO.read(getClass().getResource("che.PNG"));
		width = image.getWidth(); //74
		height = image.getHeight(); //92
//		x = 400;
//		y = 865;
		x=400;
		y=100;
		v = 20;
		v2 = 20;
		t = 0.1;
		//System.out.println(height);
	}
	
	//Æû³µÔË¶¯¹ì¼£
	public void run() {
		s = v * t ;
		x = (int) (x + s) ;	
		s2 = v2 * t ;
		y = (int) (y + s) ;	
	}
	
	

}
