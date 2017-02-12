package de.requalize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import de.requalize.model.Permission;
import de.requalize.repository.PermissionRepository;

@Controller
@EnableAutoConfiguration
public class HomeController {
	
	@Autowired
	PermissionRepository permissionRepository;
	
	@RequestMapping("/")
	String index() {
		
		permissionRepository.save(new Permission());
		
	    return "index";
	}
	
}
