package rjr.studio.login202403.api.controller.type;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import rjr.studio.login202403.api.view.ResponseBody;
import rjr.studio.login202403.dao.entity.type.TypeRoleEntity;

@RequestMapping(value = "/types/role")
public interface TypeRoleController {
	
	@GetMapping(value = "", produces =  MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Find all types role", description = "Retrieves all types role")
	ResponseEntity<ResponseBody<TypeRoleEntity>> findAll();
	
	@GetMapping(value = "/{code}", produces =  MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Finds type role by code", description = "Retrieves an type role by its code")
	ResponseEntity<ResponseBody<TypeRoleEntity>> findById(
			@Parameter(in = ParameterIn.PATH, description = "Code of the type role to be retrieved", required=true) 
			@PathVariable String code);

}
