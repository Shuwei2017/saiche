package saiche;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class dimian {
	int x;
	int y;
	BufferedImage image;
	
	public dimian() throws IOException {
		x = 0;
		y = -485;
		image = ImageIO.read(getClass().getResource("lumian.png"));
	}
	
	public void run() {
		y++;
		if (y == 0) {
			y =-485;
		}
	}

}
