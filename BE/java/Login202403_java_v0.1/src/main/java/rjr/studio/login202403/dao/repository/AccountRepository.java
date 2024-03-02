package rjr.studio.login202403.dao.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import rjr.studio.login202403.dao.entity.AccountEntity;

@Repository
public interface AccountRepository extends BaseRepository<AccountEntity, Integer> {
	
	Optional<AccountEntity> findByUsername(String username);

}
