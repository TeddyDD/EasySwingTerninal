package com.github.teddydd.EasySwingTerminal;

import java.awt.Color;
import java.awt.Font;

public class HigLevelConsole extends Console{
	
	private ConsoleCursor cursor;
	
	private Color cursorColor;
	
	public HigLevelConsole(int columns, int rows, Font font, Color defalutTextColor,
			Color defalutBackgroundColor) {
		super(columns, rows, font, defalutTextColor, defalutBackgroundColor);
		cursor = new ConsoleCursor(this);
	}
	
	public void setPostion(int column, int row) {
		cursor.setPostion(column, row);
 	}
	
	

}
