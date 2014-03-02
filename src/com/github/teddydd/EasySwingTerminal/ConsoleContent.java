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
		
		//creating arrays
		int size = rows * columns;
		letters = new char[size];
		textColor = new Color[size];
		BackgroundColor = new Color[size];
		
		//filling with default values
		
		for (int i = 0; i < size - 1; i++) {
			letters[i] = ' ';
			textColor[i] = defaultTextColor;
			BackgroundColor[i] = defaultBackgroundColor;
		}
		
	}
	
	public ConsoleContent(int rows, int columns) {
		this(rows, columns, Color.black, Color.white);
	}

	//getters & setters
	
	@Override
	public void setChar(int x, int y, char c) {
		letters[getCellIndex(x, y)] = c;
	}

	@Override
	public char getChar(int x, int y) {
		return letters[getCellIndex(x, y)];
	}

	@Override
	public void setTextColor(int x, int y, Color color) {
		textColor[getCellIndex(x, y)] = color;
	}

	@Override
	public Color getTextColor(int x, int y) {
		return textColor[getCellIndex(x, y)];
	}

	@Override
	public void setBackgrounColor(int x, int y, Color color) {
		BackgroundColor[getCellIndex(x, y)] = color;
	}

	@Override
	public Color getBackgrounColor(int x, int y) {
		return BackgroundColor[getCellIndex(x, y)];
	}
	
	/**returns the whole array of letters instead of a single element
	 * @return 1D array of chars
	 */
	public char[] getLettersArray() {
		return this.letters;
	}
	/**returns the whole array of foreground colors instead of a single element
	 * @return 1D array of colors
	 */
	public Color[] getTextColorsArray() {
		return this.textColor;
	}
	/**returns the whole array of foreground colors instead of a single element
	 * @return 1D array of colors
	 */
	public Color[] getBackgroundColorsArray() {
		return this.BackgroundColor;
	}
	
	/**Returns the index of cell with given coordinates. For testing.
	 * @param column from 1 to width
	 * @param row form 1 to height
	 * @return index useful for extracting one element of the array
	 */
	public int getCellIndex(int column, int row) {
		return ((row - 1) * width) + (column - 1);
	}

}
