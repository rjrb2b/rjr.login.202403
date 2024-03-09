package rjr.studio.login202403.dao.service.type.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rjr.studio.login202403.dao.entity.type.TypeRoleEntity;
import rjr.studio.login202403.dao.repository.type.TypesBaseRepository;
import rjr.studio.login202403.dao.service.type.TypesBaseCrudService;

@Service
public class TypesRoleServiceImpl extends TypesBaseCrudService<TypeRoleEntity, String> {

	@Autowired
	public TypesRoleServiceImpl(TypesBaseRepository<TypeRoleEntity, String> repo) {
		super(repo);
	}

}
