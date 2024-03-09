package rjr.studio.login202403.api.controller.type.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.login202403.api.controller.type.TypeRoleController;
import rjr.studio.login202403.api.view.ApiViewUtility;
import rjr.studio.login202403.api.view.ResponseBody;
import rjr.studio.login202403.dao.entity.type.TypeRoleEntity;
import rjr.studio.login202403.dao.service.type.TypeBaseCrudService;

@RestController
public class TypeRoleControllerImpl implements TypeRoleController {

	private TypeBaseCrudService<TypeRoleEntity, String> service;

	@Autowired
	public TypeRoleControllerImpl(TypeBaseCrudService<TypeRoleEntity, String> service) {
		this.service = service;
	}

	@Override
	public ResponseEntity<ResponseBody<TypeRoleEntity>> findAll() {
		
		List<TypeRoleEntity> rtn = service.findAll();
		
		return ApiViewUtility.responseSuccessBuilder(rtn, TypeRoleEntity._TYPE);
	}

	@Override
	public ResponseEntity<ResponseBody<TypeRoleEntity>> findById(String code) {

		TypeRoleEntity rtn = service.findById(TypeRoleEntity.class, code);

		return ApiViewUtility.responseSuccessBuilder(rtn, TypeRoleEntity._TYPE);
		
	}

}
