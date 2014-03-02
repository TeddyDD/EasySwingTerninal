package com.github.teddydd.EasySwingTerminal.test;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import com.github.teddydd.EasySwingTerminal.Console;
import com.github.teddydd.EasySwingTerminal.utils.*;

public class BackgroundDrawTest extends JFrame{
	
	private Console console;
	private Font font;
	
	public BackgroundDrawTest() {
		setTitle("Color test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		
		font = DefaultConsoleSettings.font;
		
		console = new Console(50, 19, font, Color.white, Color.black);
		
		getContentPane().add(console);

		pack();
		
	}

	public static void main(String[] args) {
		BackgroundDrawTest test = new BackgroundDrawTest();
		
		test.setVisible(true);
		
//		for (int y = 1; y < 19; y++) {
//			for(int x = 1; y < 50; x++){
//				test.console.buffer.setBackgrounColor(x, y, Utils.getRandomColor());
//			}
//		}
		
		test.console.repaint();

	}

}
