package com.app.metier.entities;

public class PositionPost {
   private String date;
   private int idU;
   private boolean status;
   
   
public PositionPost() {
	super();
}

public PositionPost(String date, int idU, boolean status) {
	super();
	this.date = date;
	this.idU = idU;
	this.status = status;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public int getIdU() {
	return idU;
}

public void setId(int idU) {
	this.idU = idU;
}

public boolean getStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}
  

}
