package com.bankmanagement.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Account {
	
	
	@Id
	private int aId;
	private String aName;
	private String aType;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaType() {
		return aType;
	}
	public void setaType(String aType) {
		this.aType = aType;
	}
	
	

}
