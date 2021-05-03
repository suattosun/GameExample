import java.sql.Date;

public class Gamer implements IPerson {

	private int id;
	private String name;
	private String surName;
	private String tcNo;
	private String dateTime;
	
	public Gamer() {
	 
	}
	public Gamer(int id, String name, String surName, String tcNo, String dateTime) {
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.tcNo = tcNo;
		this.dateTime = dateTime;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
}
