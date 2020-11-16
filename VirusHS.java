package com.xworkz.sets;

public class VirusHS {

	private String type;
	private boolean isCommunicable;
	
	public VirusHS(String type, boolean isCommunicable) {
		super();
		this.type = type;
		this.isCommunicable = isCommunicable;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isCommunicable() {
		return isCommunicable;
	}
	public void setCommunicable(boolean isCommunicable) {
		this.isCommunicable = isCommunicable;
	}
	
	@Override
	public String toString() {
		return "VirusHS [type=" + type + ", isCommunicable=" + isCommunicable + "]";
	}
	
	
	
}
