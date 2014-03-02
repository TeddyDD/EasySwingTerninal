package com.github.teddydd.EasySwingTerminal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Color;

import org.junit.Test;

import com.github.teddydd.EasySwingTerminal.ConsoleContent;

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

}
