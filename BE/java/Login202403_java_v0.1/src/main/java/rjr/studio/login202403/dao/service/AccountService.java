package rjr.studio.login202403.dao.service;

import rjr.studio.login202403.dao.entity.AccountEntity;

public interface AccountService {
	
	AccountEntity findByUsername(String username);
	
}
