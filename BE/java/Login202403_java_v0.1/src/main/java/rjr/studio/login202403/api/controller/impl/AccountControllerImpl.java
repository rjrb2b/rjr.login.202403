package rjr.studio.login202403.api.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import rjr.studio.login202403.api.controller.AccountController;
import rjr.studio.login202403.api.view.ApiViewUtility;
import rjr.studio.login202403.api.view.LoginCredentials;
import rjr.studio.login202403.api.view.ResponseBody;
import rjr.studio.login202403.business.AccountBusiness;
import rjr.studio.login202403.dao.entity.AccountEntity;

@RestController
public class AccountControllerImpl implements AccountController {

	private AccountBusiness accountBusiness;

	@Autowired
	public AccountControllerImpl(AccountBusiness accountBusiness) {
		this.accountBusiness = accountBusiness;
	}

	@Override
	public ResponseEntity<ResponseBody<AccountEntity>> findAll() {

		List<AccountEntity> elements = accountBusiness.findAll();

		return ApiViewUtility.responseSuccessBuilder(elements, AccountEntity._TYPE);

	}

	@Override
	public ResponseEntity<ResponseBody<AccountEntity>> findById(Integer accountId) {

		AccountEntity element = accountBusiness.findById(AccountEntity.class, accountId);

		return ApiViewUtility.responseSuccessBuilder(element, AccountEntity._TYPE);
	}

	@Override
	public ResponseEntity<ResponseBody<Integer>> save(AccountEntity accountEntity) {

		Integer id = accountBusiness.save(accountEntity).getId();

		return ApiViewUtility.responseSuccessBuilder(id, AccountEntity._TYPE);

	}

	@Override
	public ResponseEntity<ResponseBody<Integer>> deleteById(Integer accountId) {

		accountBusiness.deleteById(AccountEntity.class, accountId);

		return ApiViewUtility.responseSuccessBuilder(accountId, AccountEntity._TYPE);
	}

	@Override
	public ResponseEntity<ResponseBody<Boolean>> login(LoginCredentials loginCredentials) {

		Boolean login = accountBusiness.login(loginCredentials);

		return ApiViewUtility.responseSuccessBuilder(login, "Boolean");
	}

}
