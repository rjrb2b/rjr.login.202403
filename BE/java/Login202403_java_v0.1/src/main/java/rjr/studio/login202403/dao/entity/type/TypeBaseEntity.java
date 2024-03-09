package rjr.studio.login202403.dao.entity.type;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class TypeBaseEntity {

	@Id
	@Column(name = "CODE", nullable = false, length = 5)
	private String code;
	@Column(name = "NAME", nullable = false, length = 25)
	private String name;
	@Column(name = "DESCRIPTION", nullable = false, length = 255)
	private String description;

}
