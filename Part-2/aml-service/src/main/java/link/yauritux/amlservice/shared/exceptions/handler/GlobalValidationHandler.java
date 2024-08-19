package link.yauritux.amlservice.shared.exceptions.handler;

import link.yauritux.amlservice.adapter.dto.ResponseMessage;
import link.yauritux.amlservice.shared.exceptions.type.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Yauri Attamimi (yaurigneel@gmail.com)
 * @version 1.0
 */
@ControllerAdvice
public class GlobalValidationHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseMessage> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(400, e.getMessage()));
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ResponseMessage> handleNotFoundException(NotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseMessage(402, e.getMessage()));
    }
}
