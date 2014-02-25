package fr.aert.assets.model;

public class PaymentType {
	public static final int CASH =  1;
	public static final int CREDIT_CARD =  2;
	public static final int BANK_TRANSFER =  3;
	public static final int BANK_TRANSFER_AUTO =  4;
	public static final int CHEQUE =  5;

	private static final String[] LABELS = new String[] {"Cash", "Credit Card", "Bank Transfer", "Bank Transfer - Auto", "Cheque"};
	
	public String getLabel(int labelId)
	{
		if(labelId < 1 || labelId > 5)
			return "";
		return LABELS[labelId - 1];
	}
}
