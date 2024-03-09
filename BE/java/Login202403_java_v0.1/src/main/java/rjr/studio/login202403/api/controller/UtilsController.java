package rjr.studio.login202403.api.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import rjr.studio.login202403.api.view.ResponseBody;

@RequestMapping(value = "/utils")
public interface UtilsController {
	
	@GetMapping(value = "/encode/{password}", produces =  MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Encode password", description = "Retrieves a encode password by password")
	ResponseEntity<ResponseBody<String>> encodePassword(
			@Parameter(in = ParameterIn.PATH, description = "Password to be encoded", required=true) 
			@PathVariable String password);

}
