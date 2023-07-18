package 彩色方塊;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class 迴圈方塊 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					迴圈方塊 frame = new 迴圈方塊();
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
	public 迴圈方塊() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel[]panel = new JPanel[7];
		for(int i=0;i<panel.length;i++) {
			panel[i] = new JPanel();
		}
		panel[0].setBounds(46, 52, 51, 67);
		panel[0].setBackground(new Color(0xF43545));
		panel[1].setBackground(new Color(0xFF8901));
		panel[2].setBackground(new Color(0xFAD717));
		panel[3].setBackground(new Color(0x00BA71));
		panel[4].setBackground(new Color(0x00C2DE));
		panel[5].setBackground(new Color(0x00418D));
		panel[6].setBackground(new Color(0x5F2879));
		int p_x=panel[0].getX();
		int p_y=panel[0].getY();
		int w=panel[0].getWidth();
		int h=panel[0].getHeight();
		for(int i=0;i<panel.length;i++) {
			panel[i].setBounds(p_x+(w*i), p_y, w, h);
			contentPane.add(panel[i]);			
		}
		
	}
}
