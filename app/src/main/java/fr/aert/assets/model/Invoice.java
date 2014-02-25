package fr.aert.assets.model;

import java.util.Date;

public class Invoice {
	public static final int UNKNOWN = 0;
	public static final int EARNING = 1;
	public static final int SPENDING = 2;
	
	///////////////////////////////////////////////////////////////////
	/// Attributes
	///////////////////////////////////////////////////////////////////
	
	// Payment Info
	private Date invoiceDate;

	private double amount;
	private String label;
	private int paymentType;

	// Invoice Info
	private int invoiceType;
	private Earning earning;
	private Spending spending;

	private String buyer;
	private String seller;

	private String documentUrl;

	// Generic date Info
	private Date added;
	private Date updated;
	
	///////////////////////////////////////////////////////////////////
	/// Properties
	///////////////////////////////////////////////////////////////////

	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
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
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public int getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(int invoiceType) {
		this.invoiceType = invoiceType;
	}
	public Earning getEarning() {
		return earning;
	}
	public void setEarning(Earning earning) {
		this.earning = earning;
	}
	public Spending getSpending() {
		return spending;
	}
	public void setSpending(Spending spending) {
		this.spending = spending;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getDocumentUrl() {
		return documentUrl;
	}
	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
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
