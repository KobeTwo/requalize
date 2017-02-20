package de.requalize.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "testPermission")
public class Permission extends Item {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
