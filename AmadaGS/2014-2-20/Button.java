package com.eoe.se2.day13.view;

public class Button extends TextView {
	private String onclick;

	public String getOnclick() {
		return onclick;
	}

	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}

	@Override
	public String toString() {
		return "Button [onclick=" + onclick + "]";
	}
	
	
}
