package rjr.studio.login202403.api.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import rjr.studio.login202403.api.view.ResponseBody;
import rjr.studio.login202403.dao.entity.AccountEntity;

@RequestMapping(value = "")
public interface AccountController {
	
	@GetMapping(value = "/accounts", produces =  MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Finds all accounts", description = "description ...")
	ResponseEntity<ResponseBody<AccountEntity>> findAll();
	
	@GetMapping(value = "/account/{accountId}", produces =  MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Finds account by id", description = "description ...")
	ResponseEntity<ResponseBody<AccountEntity>> findById(
			@Parameter(in = ParameterIn.PATH, description = "ID of account to return", required=true) 
			@PathVariable Integer accountId);
	
	@PostMapping(value = "/account", produces =  MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Create new account", description = "description ...")
	ResponseEntity<ResponseBody<Integer>> save(
			@io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Entity of account to create", required=true)
			@RequestBody AccountEntity accountEntity);
	
//	@PutMapping(value = "/account/{accountId}", produces =  MediaType.APPLICATION_JSON_VALUE)
//	@Operation(summary = "Update account by id", description = "description ...")
//	ResponseEntity<ResponseBody<Integer>> updateById(
//			@Parameter(in = ParameterIn.PATH, description = "ID of account to update", required=true) 
//			@PathVariable Integer accountId,
//			@io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Entity of account to update", required=true)
//			@RequestBody AccountEntity accountEntity
//			) throws Exception;
	
	@DeleteMapping(value = "/account/{accountId}", produces =  MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Delete account by id", description = "description ...")
	ResponseEntity<ResponseBody<Integer>> deleteById(
			@Parameter(in = ParameterIn.PATH, description = "ID of account to delete", required=true) 
			@PathVariable Integer accountId);

}
