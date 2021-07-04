package Com.ccl.model;

public class Trainer {
private int tId;
private String name;
private String skill;
private String number;
private String email;

public Trainer( String name, String skill, String number, String email) {
	super();
	
	this.name = name;
	this.skill = skill;
	this.number = number;
	this.email = email;
}
public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
