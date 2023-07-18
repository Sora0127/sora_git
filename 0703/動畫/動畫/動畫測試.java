package 動畫;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.Color;
import java.awt.Canvas;

public class 動畫測試 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					動畫測試 frame = new 動畫測試();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public 動畫測試() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 71, 58, 53);
		panel.setBackground(new Color(235,168,125));
		contentPane.add(panel);
		
		圓圈 canvas = new 圓圈(this.getWidth(),this.getHeight(),0,50,20);
		canvas.setBounds(0, 0, 783, 580);
		contentPane.add(canvas);
		
		
		Thread thread2 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					int p_x=canvas.p_x-10;
	    			while(true) {
	    				for(;p_x+canvas.半徑*2<canvas.getWidth();p_x+=5) {
	    					canvas.setLocation(p_x,canvas.getY());
	    					Thread.sleep(20);
	    				}
	    				for(;p_x>=0;p_x-=5) {
	    					canvas.setLocation(p_x,canvas.getY());
	    					Thread.sleep(20);
	    				}	
	    			}
				}catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		});
		thread2.start();
		
		Thread thread = new Thread(new Runnable(){
	      @Override
	      public void run() {
	    		try {
	    			while(true) {
	    				for (int x=panel.getX();panel.getX()<500;x+=panel.getWidth()) {
	    					panel.setBackground(new Color(235,168,125));
	    					panel.setBounds(x,panel.getY(), 58, 53);
	    					if(panel.getX()+panel.getWidth()>=500) {
	    						break;
	    					}
	    					Thread.sleep(250);
	    				}
	    				for (int y=panel.getY();panel.getY()<300;y+=panel.getHeight()) {
	    					panel.setBounds(panel.getX(), y, 58, 53);
	    					panel.setBackground(new Color(156,220,125));
	    					if(panel.getY()+panel.getHeight()>=300) {
	    						break;
	    					}
	    					Thread.sleep(200);
	    				}
	    				for (int x=panel.getX();panel.getX()>42;x-=panel.getWidth()) {
	    					panel.setBackground(new Color(235,100,125));
	    					panel.setBounds(x,panel.getY(), 58, 53);			
	    					if(panel.getX()-panel.getWidth()<=42) {
	    						break;
	    					}
	    					Thread.sleep(150);
	    				}
	    				for (int y=panel.getY();panel.getY()>71;y-=panel.getHeight()) {
	    					panel.setBackground(new Color(120,168,220));
	    					panel.setBounds(panel.getX(), y, 58, 53);			
	    					if(panel.getY()-panel.getHeight()<=71) {
	    						break;
	    					}
	    					Thread.sleep(100);
	    				}
	    			}
	    			
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	      }
	    });
	    thread.start();
	 }
}


class 圓圈 extends Canvas {

	int p_x=0;
	int p_y=0;
	int 半徑=0;
    public 圓圈(int x,int y,int p_x,int p_y,int 半徑){
        setSize(x, y);
        setVisible(true);
        this.p_x=p_x;
        this.p_y=p_y;
        this.半徑=半徑;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(0xF43545));
        g2d.fillOval(p_x, p_y, 半徑*2, 半徑*2);
    }
}