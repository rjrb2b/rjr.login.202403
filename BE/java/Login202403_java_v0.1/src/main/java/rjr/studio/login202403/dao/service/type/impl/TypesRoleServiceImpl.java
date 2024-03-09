package rjr.studio.login202403.dao.service.type.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rjr.studio.login202403.dao.entity.type.TypeRoleEntity;
import rjr.studio.login202403.dao.repository.type.TypeBaseRepository;
import rjr.studio.login202403.dao.service.type.TypeBaseCrudService;

@Service
public class TypesRoleServiceImpl extends TypeBaseCrudService<TypeRoleEntity, String> {

	@Autowired
	public TypesRoleServiceImpl(TypeBaseRepository<TypeRoleEntity, String> repo) {
		super(repo);
	}

}
