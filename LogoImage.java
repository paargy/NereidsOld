package nereids;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Dimension;
public class LogoImage {
	public static void main(String[] arguments) throws IOException {
 
    JPanel panel = new JPanel();
    BufferedImage defaultimage = ImageIO.read(new File("C:\\Users\\User\\Downloads\\1637414937543.jpg"));
    Image image = defaultimage.getScaledInstance(560, 700, Image.SCALE_DEFAULT);

    
    JLabel label = new JLabel(new ImageIcon(image));
    label.setPreferredSize(new Dimension(560, 700));
    panel.add(label);	
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("LogoImage");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel); 
    frame.pack();
    frame.setVisible(true);
    
	}
}
  

