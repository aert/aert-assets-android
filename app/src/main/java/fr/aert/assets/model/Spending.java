package fr.aert.assets.model;

import java.util.Date;

public class Spending {
	
	///////////////////////////////////////////////////////////////////
	/// Attributes
	///////////////////////////////////////////////////////////////////
	
	private Date paymentDate;
	private long spendingType;
	private double amount;
	private String label;
	private String description;
	private int paymentType;

	private boolean hasInvoice;
	private Date added;
	private Date updated;
	
	///////////////////////////////////////////////////////////////////
	/// Properties
	///////////////////////////////////////////////////////////////////
	
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public long getSpendingType() {
		return spendingType;
	}
	public void setSpendingType(long spendingType) {
		this.spendingType = spendingType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public boolean isHasInvoice() {
		return hasInvoice;
	}
	public void setHasInvoice(boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}
	public Date getAdded() {
		return added;
	}
	public void setAdded(Date added) {
		this.added = added;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

}
