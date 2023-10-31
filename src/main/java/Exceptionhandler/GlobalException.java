package Exceptionhandler;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


import com.example.demo.Entity.Custom;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(Exceptionmsg.class)
	public ResponseEntity<ErrorDetails> handleCustomException(Exceptionmsg e,WebRequest webRequest) {
			
		 return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
