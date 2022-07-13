package com.zwayamLite.ZwayamLite.Models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@NoArgsConstructor

@Entity
@Table(name="application")
public class Application{
	
	
	// composite key from ApplicatinId
	@EmbeddedId
	private ApplicationId appl_id;
	private boolean status;
	

	public ApplicationId getAppl_id() {
		return appl_id;
	}
	public void setAppl_id(ApplicationId appl_id) {
		this.appl_id = appl_id;
	}

	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

	public Application(ApplicationId appl_id, boolean status) {
		this.appl_id = appl_id;
		this.status = status;
	}
	
}
