package com.eoe.se2.day07.download1__;

import java.io.Serializable;

public class RecordInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String requestType; //請求的類型分兩種：filename和download
	private long fileSize; //文件長度
	private Record record;  //記錄當前塊兒的信息
	
	public RecordInfo() {
		record=new Record();
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
}
