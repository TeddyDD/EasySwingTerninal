package com.github.teddydd.EasySwingTerminal.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Utils {

	/**Returns metrics of given font.
	 * @param font
	 * @return font metrics object
	 */
	public static FontMetrics getConsoleFontMetrics(Font font) {
		BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = image.getGraphics();

		Graphics2D g = (Graphics2D) graphics;

		g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,
				RenderingHints.VALUE_FRACTIONALMETRICS_ON);

		g.setFont(font);
		FontMetrics metrics = g.getFontMetrics();
		return metrics;
	}
	
	public static Color getRandomColor() {
		Random r = new Random();
		
		Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		return c;
	}
}
