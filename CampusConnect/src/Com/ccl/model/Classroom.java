package Com.ccl.model;

public class Classroom {
private int cId;
private String available;

public Classroom(int cId, String available) {
	super();
	this.cId = cId;
	this.available = available;
}
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String isAvailable() {
	return available;
}
public void setAvailable(String available) {
	this.available = available;
}

}
