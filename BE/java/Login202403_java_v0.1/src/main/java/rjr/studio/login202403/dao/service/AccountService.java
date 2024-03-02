package rjr.studio.login202403.dao.service;

import java.util.Optional;

import rjr.studio.login202403.dao.entity.AccountEntity;

public interface AccountService {
	
	Optional<AccountEntity> findByUsername(String username);
	
}
