package com.github.teddydd.EasySwingTerminal;

public class ConsoleCursor {

	public int currentRow, currentColumn;
	private int rows, columns;

	public ConsoleCursor(HigLevelConsole console) {
		this.currentColumn = 1;
		this.currentRow = 1;
		this.rows = console.getRows();
		this.columns = console.getColumns();
	}

	public void setPostion(int column, int row) {
		setColumn(column);
		setRow(row);
	}

	public void setColumn(int column) {
		if (column > columns)
			this.currentColumn = columns;
		else if (column < 1)
			currentColumn = 1;
		else
			currentColumn = column;
	}
	
	public void setRow(int row) {
		if (row > rows)
			this.currentRow = row;
		else if (row < 1)
			currentRow = 1;
		else
			currentRow = row;
	}

}
