package study.springkts.global.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import study.springkts.global.ErrorResponse

@RestControllerAdvice
class GlobalExceptionHandler {

    // === 400 ===
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException::class)
    fun illegalArgumentException(exception: IllegalArgumentException): ErrorResponse {
        return ErrorResponse(HttpStatus.BAD_REQUEST, exception.message)
    }

}