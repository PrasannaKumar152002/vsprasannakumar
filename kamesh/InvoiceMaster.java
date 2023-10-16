package Database;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class InvoiceMaster implements Serializable{
	private int InvoiceId;
	private int CustomerId;
	private String CustomerName;
	private List<InvoiceMaster> Item;
	//private int value;
	//private Date InvoiceDate;
	//private int Discount;
	
	public int getInvoiceId() {
		return InvoiceId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public void setInvoiceId(int invoiceId) {
		InvoiceId = invoiceId;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public List<InvoiceMaster> getItem() {
		return Item;
	}
	public void setItem(List<InvoiceMaster> itemName) {
		Item = itemName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CustomerId;
		result = prime * result + InvoiceId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceMaster other = (InvoiceMaster) obj;
		if (CustomerId != other.CustomerId)
			return false;
		if (InvoiceId != other.InvoiceId)
			return false;
		return true;
	}
	
	
}
