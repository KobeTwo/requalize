package de.requalize.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.requalize.model.Permission;
import de.requalize.repository.PermissionRepository;

@Service
public class DefaultPermissionService{

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PermissionRepository permissionRepository;
	
	public void savePermission() {
		log.info("Creating permission");
		permissionRepository.save(new Permission()); 
	}
}