package First;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

class asd extends JFrame{
    Scanner sc = new Scanner(System.in);
    BufferedImage image = loadImage("D:\\123123.jpg.");  

    int x = image.getWidth(null);  
    int y = image.getHeight(null);  
	int price=0;
	int count=0;
	
    JPanel contentPane = new JPanel();
    JLabel la2 = new JLabel("");
    JLabel la = new JLabel("No Mouse Event");
    asd(){
        this.setTitle("���콺 �̺�Ʈ ����");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(contentPane);
        contentPane.addMouseListener(new MyMouseListener());
        contentPane.addMouseMotionListener(new MyMouseListener());
        la2.setIcon(new ImageIcon("D:\\123123.jpg"));
        contentPane.add(la2, BorderLayout.CENTER);
        contentPane.add(la, BorderLayout.AFTER_LAST_LINE);
        
        this.setSize(x,y+100);
        this.setVisible(true);
        contentPane.requestFocus();
    }
    private BufferedImage loadImage(String url) {
        // TODO Auto-generated method stub


              BufferedImage image = null;  

              try {  

                  image = ImageIO.read(new File(url));  

              } catch (IOException e) {  

                  e.printStackTrace();  

              }  

              return image;  
     }
	class MyMouseListener implements MouseListener,MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {

           Color color = new Color(image.getRGB(e.getX(), e.getY()));   //��ǥ

          int red = color.getRed();

          int blue = color.getBlue();

          int green = color.getGreen();
          if(red!=255&&green!=255&&blue!=255) {
            la.setText("X = "+e.getX()+", Y = "+e.getY()+", R = ("+red+", G = "+green+ ", B = "+blue+")");
          }
            
        }

  

      @Override
        public void mousePressed(MouseEvent e) {
    //        la.setText("MousePressed("+e.getX()+","+e.getY()+")");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
  //          la.setText("MouseReleased("+e.getX()+","+e.getY()+")");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {
  //          la.setText("MouseDragged("+e.getX()+","+e.getY()+")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
  //          la.setText("MouseMoved("+e.getX()+","+e.getY()+")");
        }
        
    }
	public void count() {
		
	}
}

public class test {
   
    public static void main(String[] args) {
        First.asd asd_ = new asd();
        
    }
}
    

