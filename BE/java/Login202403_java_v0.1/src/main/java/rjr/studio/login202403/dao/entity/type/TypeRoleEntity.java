package rjr.studio.login202403.dao.entity.type;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "TYPES_ROLE")
public class TypeRoleEntity extends TypeBaseEntity {

	public static final String _TYPE = TypeRoleEntity.class.getSimpleName();


}
