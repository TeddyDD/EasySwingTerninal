package com.github.teddydd.EasySwingTerminal;

import java.awt.Color;
import java.awt.Font;

import sun.java2d.loops.CustomComponent;

public class HigLevelConsole extends Console{
	
	private ConsoleCursor cursor;
	
	private Color cursorColor, cursorTextColor;
	private Color currentTextColor, currentBackgroundColor;
	
	public HigLevelConsole(int columns, int rows, Font font, Color defalutTextColor,
			Color defalutBackgroundColor,Color cursorColor,Color cursorTextColor) {
		super(columns, rows, font, defalutTextColor, defalutBackgroundColor);
		cursor = new ConsoleCursor(this);
		this.cursorColor = cursorColor;
		this.cursorTextColor = cursorTextColor;
		this.currentTextColor = defalutTextColor;
		this.currentBackgroundColor = defalutBackgroundColor;
	}
	
	/** positions the cursor at the desired location - safe way */
	public void setPostion(int column, int row) {
		cursor.setPostion(column, row);
 	}
	
	public void nextCursorPostion() {
		if (cursor.currentColumn == columns) {
			cursor.currentRow = cursor.currentRow+1;
			cursor.currentColumn = 1;
		}
		else {
			cursor.currentColumn++;
		}
	}
	
	/**prints the character at the specified position using the currently selected color
	 * @param column
	 * @param row
	 * @param c character to write
	 */
	public void writeChar(int column, int row, char c) {
		setPostion(column, row);
		buffer.setChar(cursor.currentColumn,cursor.currentRow,c);
		buffer.setTextColor(cursor.currentColumn,cursor.currentRow, currentTextColor);
		buffer.setBackgrounColor(cursor.currentColumn,cursor.currentRow, currentBackgroundColor);
	}
	
	/**prints the character at the current position and moves the cursor on
	 * @param c character to write
	 */
	public void writeChar(char c) {
		writeChar(cursor.currentColumn, cursor.currentRow, c);
		nextCursorPostion();
	}
	
	/**Sets the colors used for writing characters
	 * @param text Text color
	 * @param background Background Color
	 */
	public void setColors(Color text, Color background) {
		this.currentTextColor = text;
		this.currentBackgroundColor = background;
	}
	
	public void writeString(int column, int row, String s) {
		char[] c = s.toCharArray();
		setPostion(column, row);
		for (int i = 0; i < c.length; i++){
			writeChar(c[i]);
		}
	}
	
	public void writeString(String s) {
		writeString(cursor.currentColumn, cursor.currentRow, s);
	}
	
	
	
	

}
