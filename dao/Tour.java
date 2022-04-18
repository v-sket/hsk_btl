package entity;

import java.time.LocalDateTime;

public class Tour {
	// -----------------thuộc tính-------------------
	private String tourID;
	private String tourName;
	private int numberOfCustomers;
	private float tourPrice;
	private Point startPointID;
	private Point endPointID;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private Employee employeeID;

	// -----------------phương thức-------------------
	// <<constructor>> không tham số
	public Tour() {
		this("", "", 0, (float) 0.0, new Point(), new Point(), LocalDateTime.now(), LocalDateTime.now(),
				new Employee());
	}

	// <<constructor>> có tham số tourID
	public Tour(String tourID) {
		this.tourID = tourID;
	}

	// <<constructor>> đầy đủ tham số
	public Tour(String tourID, String tourName, int numberOfCustomers, float tourPrice, Point startPointID,
			Point endPointID, LocalDateTime startTime, LocalDateTime endTime, Employee employeeID) {
		this.tourID = tourID;
		this.tourName = tourName;
		this.numberOfCustomers = numberOfCustomers;
		this.tourPrice = tourPrice;
		this.startPointID = startPointID;
		this.endPointID = endPointID;
		this.startTime = startTime;
		this.endTime = endTime;
		this.employeeID = employeeID;
	}

	// <<getter/setter>>
	public String getTourID() {
		return tourID;
	}

	public void setTourID(String tourID) {
		this.tourID = tourID;
	}

	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}

	public float getTourPrice() {
		return tourPrice;
	}

	public void setTourPrice(float tourPrice) {
		this.tourPrice = tourPrice;
	}

	public Point getStartPointID() {
		return startPointID;
	}

	public void setStartPointID(Point startPointID) {
		this.startPointID = startPointID;
	}

	public Point getEndPointID() {
		return endPointID;
	}

	public void setEndPointID(Point endPointID) {
		this.endPointID = endPointID;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public Employee getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Employee employeeID) {
		this.employeeID = employeeID;
	}

	// <<hashCode>>
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tourID == null) ? 0 : tourID.hashCode());
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
		Tour other = (Tour) obj;
		if (tourID == null) {
			if (other.tourID != null)
				return false;
		} else if (!tourID.equals(other.tourID))
			return false;
		return true;
	}
	
}
