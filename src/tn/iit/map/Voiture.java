package tn.iit.map;

import java.util.Random;
import javax.swing.JButton;

/**
 * 
 * @author mo5
 *
 */
// rouler une voiture

public class Voiture extends Thread {
	private JButton jb;

	public Voiture(JButton jb) {
		this.jb = jb;
	}

	public void run() {
		avancerY();
		double a = -500 + (Math.random() * (500 - (-500)));

	}

	public void avancerX() {// avancer une voiture suivant l'axe x

		for (int i = 0; i < 500; i++) {
			try {
				jb.setBounds(jb.getX() + i, jb.getY(), jb.getWidth(), jb.getHeight());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void avancerY() {// avancer une voiture suivant l'axe y

		for (int i = 0; i < 500; i++) {
			try {
				jb.setBounds(jb.getX(), jb.getY() - i, jb.getWidth(), jb.getHeight());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void tournerD() {
		jb.setBounds(jb.getX() + 50, jb.getY(), jb.getWidth(), jb.getHeight());
		System.out.println(jb.getX());
		for (int i = 0; i < 500; i++) {
			try {
				jb.setBounds(jb.getX(), jb.getY() + i, jb.getWidth(), jb.getHeight());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("a>250");
	}

	public void tournerG() {
		jb.setBounds(jb.getX() + 50, jb.getY(), jb.getWidth(), jb.getHeight());
		System.out.println(jb.getX());
		for (int i = 0; i < 500; i++) {
			try {
				jb.setBounds(jb.getX(), jb.getY() - i, jb.getWidth(), jb.getHeight());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("a<-250");
	}
}
