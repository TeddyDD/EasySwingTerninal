package com.github.teddydd.EasySwingTerminal.test;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import com.github.teddydd.EasySwingTerminal.Console;
import com.github.teddydd.EasySwingTerminal.HigLevelConsole;
import com.github.teddydd.EasySwingTerminal.utils.DefaultConsoleSettings;

public class AdvanceConsoleTest extends JFrame{
	
	private HigLevelConsole console;
	private Font font;
	
	public AdvanceConsoleTest() {
		setTitle("writing test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		
		font = DefaultConsoleSettings.font;
		
		console = new HigLevelConsole(55, 19, font, Color.black, Color.blue,null,null);
		
		getContentPane().add(console);

		pack();
		
	}

	public static void main(String[] args) {
		AdvanceConsoleTest test = new AdvanceConsoleTest();
		test.setVisible(true);
		test.console.writeChar(1,1,'H');
		test.console.writeChar(2,1,'#');
		test.console.nextCursorPostion();
		test.console.writeChar('3');
		test.console.setColors(Color.red, Color.black);
		test.console.writeChar('!');
		test.console.writeString(2, 3, "Hello Wordl!");
		test.console.setColors(Color.green, Color.DARK_GRAY);
		test.console.nextCursorPostion();
		test.console.writeString("W00T It's really Works!!!");
		
//		test.console.writeChar('e');
		
		
	}
}
