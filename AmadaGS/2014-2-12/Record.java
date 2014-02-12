package com.eoe.se2.day07.download1__;

import java.io.Serializable;

public class Record implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long startPos;
	private long endPos;
	private String fileName;
	public long getStartPos() {
		return startPos;
	}
	public void setStartPos(long startPos) {
		this.startPos = startPos;
	}
	public long getEndPos() {
		return endPos;
	}
	public void setEndPos(long endPos) {
		this.endPos = endPos;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
