package rjr.studio.login202403.api.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.login202403.api.controller.UtilsController;
import rjr.studio.login202403.api.view.ApiViewUtility;
import rjr.studio.login202403.api.view.ResponseBody;

@RestController
public class UtilsControllerImpl implements UtilsController {

	@Override
	public ResponseEntity<ResponseBody<String>> encodePassword(String password) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String hashedPassword = encoder.encode(password);
        
        return ApiViewUtility.responseSuccessBuilder(hashedPassword, "String");
	}

}
