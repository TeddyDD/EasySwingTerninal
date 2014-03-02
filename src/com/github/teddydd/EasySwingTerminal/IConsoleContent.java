package com.github.teddydd.EasySwingTerminal;

import java.awt.Color;

/**Basic interface for console 'buffer' or screen.
 * @author TeddyDD
 *
 */
public interface IConsoleContent {
	
	void setChar(int x, int y, char c);
	char getChar(int x, int y);
	
	void setTextColor(int x, int y, Color color);
	Color getTextColor(int x, int y);
	
	void setBackgrounColor(int x, int y, Color color);
	Color getBackgrounColor(int x, int y);

}
