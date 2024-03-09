package rjr.studio.login202403.api.view;

import java.util.Collection;
import java.util.NoSuchElementException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class ApiViewUtility {

	public static <T> ResponseEntity<ResponseBody<T>> responseSuccessBuilder(Collection<T> elements, String dataType)
			throws NoSuchElementException {

		ResponseBody<T> body = new ResponseBody<T>();
		body.set_dataType(dataType);

		if (null == elements || elements.isEmpty()) {
			throw new NoSuchElementException();
		} else {
			body.setElements(elements);
			body.setTotalElements(elements.size());
		}

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<>(body, headers, HttpStatus.OK);

	}

	public static <T> ResponseEntity<ResponseBody<T>> responseSuccessBuilder(T element, String dataType)
			throws NoSuchElementException {

		ResponseBody<T> body = new ResponseBody<T>();
		body.set_dataType(dataType);

		if (null == element) {
			throw new NoSuchElementException();
		} else {
			body.setTotalElements(1);
			body.setElement(element);
		}

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<>(body, headers, HttpStatus.OK);

	}

}
