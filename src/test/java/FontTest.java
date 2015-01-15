import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by liuzhengyang on 2015/1/13.
 */
public class FontTest {

    private static final int WIDTH = 200;
    private static final int HEIGHT = 70;
    private static final String IMAGE_FORMAT = "png";

    public static void drawImage(Font font){
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        String word = "hello1234";
        Graphics g = image.getGraphics();
        g.setColor(new Color(254,254,254));
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(new Color(0,0,0));
        g.setFont(font);
        g.drawString(word, 20, 20);
        try {
            ImageIO.write(image, IMAGE_FORMAT, new File(font.getFontName() + "." + IMAGE_FORMAT));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void listFonts(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        for(String name : ge.getAvailableFontFamilyNames()){
//            Font font = new Font(name, Font.PLAIN, 20);
//            drawImage(font);
//        }
        Font font = new Font("Segoe Print", Font.PLAIN, 30);
        drawImage(font);
//
    }
}
