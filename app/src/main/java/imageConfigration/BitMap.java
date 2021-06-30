package imageConfigration;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BitMap {
    public static void invert(BufferedImage image) throws IOException {
        int imageHeight = image.getHeight();
        int imageWidth = image.getWidth();
        int[][] array2D = new int[imageWidth][imageHeight];
        for (int xPixel = 0; xPixel < array2D.length; xPixel++) {
            for (int yPixel = 0; yPixel < array2D[xPixel].length; yPixel++) {
                int color = image.getRGB(xPixel, yPixel);
                if (color == Color.BLACK.getRGB()) {
                    array2D[xPixel][yPixel] = 1;
                    image.setRGB(xPixel, yPixel, -2171170);
//                    System.out.println("Black");
                } else {
                    array2D[xPixel][yPixel] = 0; //
//                    System.out.println("White");
                    image.setRGB(xPixel, yPixel, -16777216);
                }

            }
            boolean test = ImageIO.write(image, "png", new File("/home/ashqur/401/bitmap-transformer/app/src/main/resources/invertedDone.bmp"));

        }
    }
    public static void borader(BufferedImage image) throws IOException {
        int imageHeight = image.getHeight();
        int imageWidth = image.getWidth();
        int[][] array2D = new int[imageWidth][imageHeight];
        int   xlength=image.getHeight()-1;//272
        int  ylength=image.getWidth()-1;//299
        for (int xPixel = 0; xPixel < array2D.length; xPixel++) {
            for (int yPixel = 0; yPixel < array2D[xPixel].length; yPixel++) {
                int color = image.getRGB(xPixel, yPixel);
                if (color == Color.BLACK.getRGB()) {
                    array2D[xPixel][yPixel] = 1;
                    image.setRGB(xPixel, yPixel, -16777216);
//                    System.out.println("Black");
                } else {
                    array2D[xPixel][yPixel] = 0; //
//                    System.out.println("White");
                    image.setRGB(xPixel, yPixel, -2171170);
                }

if(xPixel<=10||xPixel>=(ylength-11) || yPixel<=10||yPixel>=(xlength-11)){
    System.out.println("inter");
    image.setRGB(xPixel, yPixel, -16777216);
}

            }
            boolean test = ImageIO.write(image, "png", new File("/home/ashqur/401/bitmap-transformer/app/src/main/resources/BoardeerDone1.bmp"));

        }
    }


}