package com.github.teddydd.EasySwingTerminal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import com.github.teddydd.EasySwingTerminal.utils.Utils;

/**The component that displays the contents of the console
 * @author Daniel Lewan
 *
 */
public class Console extends JComponent{

	/** Size in pixels */
	private Dimension size;
	private int columns,rows;
	/** Size of one letter with background in pixels */
	private Dimension cellSize;
	
	private Font font;
	private FontMetrics fontMetrics;
	
	//default colors
	private Color defaultTextColor;
	private Color defaultBackgroundColor;
	
	public ConsoleContent buffer;
	
	/**Constructor calculating console size based on the font size.
	 * @param columns number of columns - a minimum of 1
	 * @param rows number of rows - a minimum of 1
	 * @param font any monospaced font
	 */
	public Console(int columns, int rows, Font font,
			Color defalutTextColor, Color defalutBackgroundColor) {
		
		this.columns = columns;
		this.rows = rows;
		this.font = font;
		
		buffer = new ConsoleContent(rows, columns, defalutTextColor, defalutBackgroundColor);
		
		this.defaultTextColor = defalutTextColor;
		this.defaultBackgroundColor = defalutBackgroundColor;
		
		fontMetrics = Utils.getConsoleFontMetrics(font);
		cellSize = new Dimension(fontMetrics.charWidth('W'), fontMetrics.getHeight());
		//calculating size of console
		size = new Dimension(cellSize.width * columns,cellSize.height * rows);
		
		//component size
		setMinimumSize(size);
		setPreferredSize(size);
		
		setBackground(Color.black);
	}
	
	@Override
	public void paint(Graphics g) {
		if (g == null)
			return;

		// background
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(defaultBackgroundColor);
		g2d.fillRect(0, 0, size.width, size.height);
		
		for (int row = 1; row <= rows; row++){
			for (int column = 1; column <= columns; column++) {
				//drawing letters background
				Color bg = buffer.getBackgrounColor(column, row);
				System.out.println("geting color from " + column + " " + row);
				g2d.setColor(bg);
				g2d.fillRect((column-1) * cellSize.width, (row-1) * cellSize.height, cellSize.width, cellSize.height);
			}
		}
	}
	
}
