package flyweight.legoBox;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class LegoType {
    private String name;
    private Colors color;
    private String otherLegoBrickData;
    private ImageObserver observer;

    public LegoType(String name, Colors color, String otherLegoBrickData) {
        this.name = name;
        this.color = color;
        this.otherLegoBrickData = otherLegoBrickData;
    }

    public void draw(Graphics g, int x, int y) {
        Image image;
        try {
            if (color.equals(Colors.GREEN)) {
                image = ImageIO.read(new File("src/flyweight/legoBox/images/lego_green.png"));
            } else if (color.equals(Colors.RED)) {
                image = ImageIO.read(new File("src/flyweight/legoBox/images/Lego_Red.png"));
            } else {
                image = ImageIO.read(new File("src/flyweight/legoBox/images/lego_blue.png"));
            }
            g.drawImage(image, x, y, observer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
