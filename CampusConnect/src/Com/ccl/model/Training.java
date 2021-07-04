package Com.ccl.model;

public class Training {
private int trId;
private int trainer;
private int classroom;
private String date;
private String FTime;
private String TTime;
public Training(int trainer, int classroom, String date, String fTime, String tTime) {
	super();
	this.trainer = trainer;
	this.classroom = classroom;
	this.date = date;
	FTime = fTime;
	TTime = tTime;
}
public int getTrId() {
	return trId;
}
public void setTrId(int trId) {
	this.trId = trId;
}
public int getTrainer() {
	return trainer;
}
public void setTrainer(int trainer) {
	this.trainer = trainer;
}
public int getClassroom() {
	return classroom;
}
public void setClassroom(int classroom) {
	this.classroom = classroom;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getFTime() {
	return FTime;
}
public void setFTime(String fTime) {
	FTime = fTime;
}
public String getTTime() {
	return TTime;
}
public void setTTime(String tTime) {
	TTime = tTime;
}
}
