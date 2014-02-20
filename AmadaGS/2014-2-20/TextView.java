package com.eoe.se2.day13.view;

public class TextView extends View {

	private String text;
	private String textSize;
	private String textColor;
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTextSize() {
		return textSize;
	}
	public void setTextSize(String textSize) {
		this.textSize = textSize;
	}
	public String getTextColor() {
		return textColor;
	}
	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}
	@Override
	public String toString() {
		return "TextView [text=" + text + ", textSize=" + textSize
				+ ", textColor=" + textColor + "]";
	}
	
	

}
