package rjr.studio.login202403.business.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rjr.studio.login202403.business.BaseCrudBusiness;
import rjr.studio.login202403.business.AccountBusiness;
import rjr.studio.login202403.dao.entity.AccountEntity;
import rjr.studio.login202403.dao.service.BaseCrudService;
import rjr.studio.login202403.dao.service.AccountService;

@Component
public class AccountBusinessImpl extends BaseCrudBusiness<AccountEntity, Integer> implements AccountBusiness {

	private AccountService accountService;

	@Autowired
	public AccountBusinessImpl(BaseCrudService<AccountEntity, Integer> service, AccountService accountService) {
		super(service);
		this.accountService = accountService;
	}

	@Override
	public AccountEntity findByUsername(String username) {
		return accountService.findByUsername(username).orElseThrow(() -> new NoSuchElementException(AccountEntity._TYPE+" USERNAME "+username+" not found"));
	}

}
