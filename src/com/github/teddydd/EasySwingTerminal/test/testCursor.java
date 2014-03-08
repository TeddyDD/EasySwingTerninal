package com.github.teddydd.EasySwingTerminal.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.github.teddydd.EasySwingTerminal.ConsoleCursor;

public class testCursor {
	
	private static ConsoleCursor cr;
	
	@Test
	public void test() {
		
		cr = new ConsoleCursor(10,19);
		
		for (int x = 0; x < 20; x++) {
			cr.setColumn(x);
			assertFalse("now column > columns /out of bounds for " + x,cr.currentColumn > 10);
			cr.setRow(x);
			assertFalse("now row > rows /out of bounds for" + x ,cr.currentRow > 19);
			
			cr.setPostion(-5, -5); //don't try this at home :P
			assertTrue("-5;-5 cursor postion", cr.currentColumn == 1 && cr.currentRow == 1);
		}
	}

}
