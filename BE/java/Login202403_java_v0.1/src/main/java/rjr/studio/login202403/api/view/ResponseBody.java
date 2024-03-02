package rjr.studio.login202403.api.view;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseBody<T> {
	
	@NotNull
	@Schema(example ="Author", description = "data type")
	private String _dataType;

	private T element;
	
	private Collection<T> elements;

	@Schema(description = "total data object elements")
	private Integer totalElements;

}
