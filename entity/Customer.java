package entity;

public class Customer {
	// ----------------thuộc tính-----------------
	private String customerID;
	private String customerName;
	private String customerAddress;
	private String customerEmail;
	private String customerPhone;
	private Tour tourID;

	// ----------------phương thức-----------------
	// <<constructor>> không tham số
	public Customer() {
		this("", "", "", "", "", new Tour());
	}

	// <<constructor>> có tham số customerID
	public Customer(String customerID) {
		super();
		this.customerID = customerID;
	}

	// <<constructor>> đầy đủ tham số
	public Customer(String customerID, String customerName, String customerAddress, String customerEmail,
			String customerPhone, Tour tourID) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.tourID = tourID;
	}

	// <<getter/seter>>
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Tour getTourID() {
		return tourID;
	}

	public void setTourID(Tour tourID) {
		this.tourID = tourID;
	}

	// <<hashCode>>
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
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
		Customer other = (Customer) obj;
		if (customerID == null) {
			if (other.customerID != null)
				return false;
		} else if (!customerID.equals(other.customerID))
			return false;
		return true;
	}

}
