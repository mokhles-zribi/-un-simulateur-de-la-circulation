package tn.iit.map;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author mo5
 *
 */
public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setSize(520, 550);
		getContentPane().setLayout(null);
		JButton bt = new JButton();
		bt.setBounds(450, 100, 50, 50);
		bt.setBackground(Color.red);
		getContentPane().add(bt);
		JLabel jl = new JLabel();
		jl.setBounds(0, 0, 504, 511);
		getContentPane().add(jl);
		jl.setIcon(new ImageIcon("C:\\Users\\mo5\\Desktop\\map.png"));
		Voiture av = new Voiture(bt);
		av.start();
		validate();
	}
}
