package de.requalize.repository;

import org.springframework.data.repository.CrudRepository;

import de.requalize.model.Permission;

public interface PermissionRepository extends CrudRepository<Permission, Long> {

}
