package de.requalize.zktest;

import java.io.Serializable;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import de.requalize.service.impl.DefaultPermissionService;

@VariableResolver(DelegatingVariableResolver.class)
public class TestVM implements Serializable{

	private static final long serialVersionUID = -5163060698294293907L;
	private String name = "pepe";

	@WireVariable(rewireOnActivate=true)
	private transient DefaultPermissionService defaultPermissionService;
	
	@Command
	@NotifyChange("name")
	public void ook() {
		defaultPermissionService.savePermission();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}