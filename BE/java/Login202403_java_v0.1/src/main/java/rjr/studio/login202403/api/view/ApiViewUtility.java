package rjr.studio.login202403.api.view;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class ApiViewUtility {

	public static <T> ResponseEntity<ResponseBody<T>> responseSuccessBuilder(Collection<T> elements, String dataType) throws NoSuchElementException {

		ResponseBody<T> body = new ResponseBody<T>();
		body.set_dataType(dataType);
		
		if (null == elements) {
			throw new NoSuchElementException();
		}
		else if (1 == elements.size()) {
			Iterator<T> iterator = elements.iterator();
			T firstElement = iterator.next();
			body.setElement(firstElement);
		}
		else if (1 < elements.size()) {
			body.setElements(elements);
		}
		body.setTotalElements( elements.size());

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<>(body, headers, HttpStatus.OK);

	}

}
