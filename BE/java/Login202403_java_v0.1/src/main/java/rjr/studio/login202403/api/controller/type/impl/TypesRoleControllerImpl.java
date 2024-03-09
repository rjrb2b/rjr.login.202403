package rjr.studio.login202403.api.controller.type.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.login202403.api.controller.type.TypesRoleController;
import rjr.studio.login202403.api.view.ApiViewUtility;
import rjr.studio.login202403.api.view.ResponseBody;
import rjr.studio.login202403.dao.entity.type.TypeRoleEntity;
import rjr.studio.login202403.dao.service.type.impl.TypesRoleServiceImpl;

@RestController
public class TypesRoleControllerImpl implements TypesRoleController {

	private TypesRoleServiceImpl typesRoleServiceImpl;

	@Autowired
	public TypesRoleControllerImpl(TypesRoleServiceImpl typesRoleServiceImpl) {
		this.typesRoleServiceImpl = typesRoleServiceImpl;
	}

	@Override
	public ResponseEntity<ResponseBody<TypeRoleEntity>> findAll() {
		
		List<TypeRoleEntity> rtn = typesRoleServiceImpl.findAll();
		
		return ApiViewUtility.responseSuccessBuilder(rtn, TypeRoleEntity._TYPE);
	}

	@Override
	public ResponseEntity<ResponseBody<TypeRoleEntity>> findById(String code) {

		TypeRoleEntity rtn = typesRoleServiceImpl.findById(TypeRoleEntity.class, code);

		return ApiViewUtility.responseSuccessBuilder(Arrays.asList(rtn), TypeRoleEntity._TYPE);
		
	}

}
