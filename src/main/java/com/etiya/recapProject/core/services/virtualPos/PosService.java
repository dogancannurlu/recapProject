package com.etiya.recapProject.core.services.virtualPos;

public class PosService {
	
	public boolean checkCreditCard(double amount, String cardNumber, String cvc, String expiryDate) {
		if(checkLimit(amount) && checkCardNumber(cardNumber)) {
			return true;
		}
		return false;
	}
	
	private boolean checkLimit(double amount) {
		if (amount > 2000) {
			return false;
		}
		return true;
	}

	private boolean checkCardNumber(String cardNumber) {
		if (!cardNumber.equals("4111111111111111")) {
			return false;
		}
		return true;
	}
}
