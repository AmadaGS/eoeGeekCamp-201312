package com.eoe.se2.day07.upload00;

import java.io.Serializable;

public class FileInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String fileName;
	private long position;
	public FileInfo() {
		// TODO Auto-generated constructor stub
	}
	public FileInfo(String fileName, long position) {
		super();
		this.fileName = fileName;
		this.position = position;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getPosition() {
		return position;
	}
	public void setPosition(long position) {
		this.position = position;
	}
}
