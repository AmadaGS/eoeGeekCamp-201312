package com.eoe.se2.day13.view;

public class EditText extends TextView {
	private  boolean cursorVisible;
	private boolean editable;
	private int lines;
	
	public boolean isCursorVisible() {
		return cursorVisible;
	}
	public void setCursorVisible(boolean cursorVisible) {
		this.cursorVisible = cursorVisible;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public int getLines() {
		return lines;
	}
	public void setLines(int lines) {
		this.lines = lines;
	}
	@Override
	public String toString() {
		return "EditText [cursorVisible=" + cursorVisible + ", editable="
				+ editable + ", lines=" + lines + "]";
	}
	
	
	
}
