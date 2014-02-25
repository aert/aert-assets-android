package fr.aert.assets.model;


public class SpendingType {
	
	///////////////////////////////////////////////////////////////////
	/// Attributes
	///////////////////////////////////////////////////////////////////
	
	private String label;
	private boolean isRecurrent;
	
	///////////////////////////////////////////////////////////////////
	/// Properties
	///////////////////////////////////////////////////////////////////
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public boolean isRecurrent() {
		return isRecurrent;
	}
	public void setRecurrent(boolean isRecurrent) {
		this.isRecurrent = isRecurrent;
	}
}
