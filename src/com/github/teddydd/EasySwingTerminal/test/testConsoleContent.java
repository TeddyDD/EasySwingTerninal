package com.github.teddydd.EasySwingTerminal.test;

import static org.junit.Assert.*;

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
	}

}
