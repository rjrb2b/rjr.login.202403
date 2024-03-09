package rjr.studio.login202403.dao.repository.type;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import rjr.studio.login202403.dao.entity.type.TypeBaseEntity;

//@NoRepositoryBean
@Repository
public interface TypesBaseRepository<E extends TypeBaseEntity, CODE extends Serializable> extends JpaRepository<E, CODE>  {

}
