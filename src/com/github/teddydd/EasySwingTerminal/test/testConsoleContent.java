package com.github.teddydd.EasySwingTerminal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Color;

import org.junit.Test;

import com.github.teddydd.EasySwingTerminal.ConsoleContent;
import com.github.teddydd.EasySwingTerminal.utils.Utils;

public class testConsoleContent {

	/**Checks the correctness of the formula that 
	 * selects the desired item from the array
	 */
	@Test
	public void testIndexFormula() {
		ConsoleContent cc = new ConsoleContent(5, 10);
		assertEquals("Formula for 1:1", 0, cc.getCellIndex(1, 1));
		assertEquals("Formula for 6:2", 15, cc.getCellIndex(6, 2));
		assertEquals("Formula for 10:5", 49, cc.getCellIndex(10, 5));
	}
	
	@Test
	public void testArrays() {
		ConsoleContent cc = new ConsoleContent(5, 10);
		assertNotNull("Letters == null", cc.getLettersArray());
		assertNotNull("FG colors == null", cc.getTextColorsArray());
		assertNotNull("BG colors == null", cc.getBackgroundColorsArray());
		
		assertEquals("Problem with a size of the array",50,cc.getTextColorsArray().length);
		                          
		assertEquals("filling the default value error / letters" ,' ', cc.getChar(1, 1));
		assertEquals("filling the default value error / colorfg" ,Color.black, cc.getTextColor(1, 1));
	}
	
	@Test
	public void testGeneral() {
		ConsoleContent cc = new ConsoleContent(5, 10);
		
		for (int y = 1; y < 5; y++) {
			for (int x = 1; x < 10; x++) {
				cc.setChar(x,y,(char)y);
				assertEquals("char error set,get",(char)y, cc.getChar(x,y));
				
				Color randomColor = Utils.getRandomColor();
				cc.setTextColor(x, y, randomColor);
				cc.setBackgrounColor(x, y, randomColor);
				
				assertEquals("text color error",randomColor, cc.getTextColor(x, y));
				assertEquals("bg color error",randomColor, cc.getBackgrounColor(x, y));
			}
		}
		
	}

}
