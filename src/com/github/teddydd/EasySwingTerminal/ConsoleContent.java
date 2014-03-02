package com.github.teddydd.EasySwingTerminal;

import java.awt.Color;

/**This class represents the characters you see in the console 
 * along with the background colors and text.
 * @author Daniel Lewan
 */
public class ConsoleContent implements IConsoleContent {

	private char[] letters;
	private Color[] textColor;
	private Color[] BackgroundColor;

	private int width;

	public ConsoleContent(int rows, int columns, Color defaultTextColor,
			Color defaultBackgroundColor) {
		this.width = columns;
		
	}
	
	public ConsoleContent(int rows, int columns) {
		this(rows, columns, Color.black, Color.white);
	}

	@Override
	public void setChar(int x, int y, char c) {
		// TODO Auto-generated method stub

	}

	@Override
	public char getChar(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTextColor(int x, int y, Color color) {
		// TODO Auto-generated method stub

	}

	@Override
	public Color getTextColor(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBackgrounColor(int x, int y, Color color) {
		// TODO Auto-generated method stub

	}

	@Override
	public Color getBackgrounColor(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**Returns the index of cell with given coordinates. For testing.
	 * @param column int from 1 to width
	 * @param row 1 to height
	 * @return index useful for extracting one element of the array
	 */
	public int getCellIndex(int column, int row) {
		return ((row - 1) * width) + (column - 1);
	}

}
