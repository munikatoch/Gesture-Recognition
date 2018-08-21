package gesture;

import java.awt.Color;

import javax.swing.JFrame;

public class MainClass{
	public static void main(String []args){
		CreateFrame cf=new CreateFrame();
		cf.f.setSize(600, 600);
		cf.f.setBackground(Color.WHITE);
		cf.f.setLayout(null);
		cf.f.setVisible(true);
		cf.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
