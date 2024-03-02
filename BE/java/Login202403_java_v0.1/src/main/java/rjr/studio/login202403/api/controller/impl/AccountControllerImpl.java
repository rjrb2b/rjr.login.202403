package rjr.studio.login202403.api.controller.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.login202403.api.controller.AccountController;
import rjr.studio.login202403.api.view.ApiViewUtility;
import rjr.studio.login202403.api.view.ResponseBody;
import rjr.studio.login202403.business.impl.AccountBusinessImpl;
import rjr.studio.login202403.dao.entity.AccountEntity;

@RestController
public class AccountControllerImpl implements AccountController {

	private AccountBusinessImpl accountBusiness;

	@Autowired
	public AccountControllerImpl(AccountBusinessImpl accountBusiness) {
		this.accountBusiness = accountBusiness;
	}

	@Override
	public ResponseEntity<ResponseBody<AccountEntity>> findAll() {

		List<AccountEntity> rtn = accountBusiness.findAll();

		return ApiViewUtility.responseSuccessBuilder(rtn, AccountEntity._TYPE);

	}

	@Override
	public ResponseEntity<ResponseBody<AccountEntity>> findById(Integer accountId) {

		AccountEntity rtn = accountBusiness.findById(AccountEntity.class, accountId);

		return ApiViewUtility.responseSuccessBuilder(Arrays.asList(rtn), AccountEntity._TYPE);
	}

	@Override
	public ResponseEntity<ResponseBody<Integer>> save(AccountEntity accountEntity) {

		Integer rtn = accountBusiness.save(accountEntity).getId();
		
		return ApiViewUtility.responseSuccessBuilder(Arrays.asList(rtn), AccountEntity._TYPE);
		
	}

	@Override
	public ResponseEntity<ResponseBody<Integer>> deleteById(Integer accountId) {
		
		accountBusiness.deleteById(AccountEntity.class, accountId);
		
		return ApiViewUtility.responseSuccessBuilder(Arrays.asList(accountId), AccountEntity._TYPE);
	}

}
