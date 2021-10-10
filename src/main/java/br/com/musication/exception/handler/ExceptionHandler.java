package br.com.musication.exception.handler;

import br.com.musication.domain.response.ErrorResponse;
import br.com.musication.exception.SoundNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author macrusal on 10/10/21
 * @project musication
 */


@Slf4j
@AllArgsConstructor
@RestControllerAdvice
class ExceptionHandlerController {

    @ExceptionHandler( SoundNotFoundException.class )
    public ResponseEntity< ErrorResponse > categoriaNotFound( SoundNotFoundException e, HttpServletRequest request) {

        var error = new ErrorResponse().builder()
                .mensagem( e.getMessage() )
                .status( HttpStatus.NOT_FOUND.value() )
                .timeStamp( System.currentTimeMillis() )
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
