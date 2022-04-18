package entity;

public class Point {
	// ---------------thuộc tính---------------
	private String pointID;
	private String pointName;

	// -------------phương thức----------------
	// <<constructor>> không tham số
	public Point() {
		this("", "");
	}

	// <<constructor>> có tham số pointID
	public Point(String pointID) {
		setPointID(pointID);
	}
	
	// <<constructor>> đầy đủ tham số
	public Point(String pointID, String pointName) {
		setPointID(pointID);
		setPointName(pointName);
	}

	// <<getter/setter>>
	public String getPointID() {
		return pointID;
	}

	public void setPointID(String pointID) {
		this.pointID = pointID;
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	// <<hashCode>>
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pointID == null) ? 0 : pointID.hashCode());
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
		Point other = (Point) obj;
		if (pointID == null) {
			if (other.pointID != null)
				return false;
		} else if (!pointID.equals(other.pointID))
			return false;
		return true;
	}

}
