package edu.sru.cpsc.webshopping.domain.products;

import java.util.List;

public class PurchaseRequest {
		private long amount; 
	    private String currency;
	    
		public long getAmount() {
			return amount;
		}
		public void setAmount(long amount) {
			this.amount = amount;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
}
