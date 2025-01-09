package study.springkts.global

import org.springframework.http.HttpStatus

data class ErrorResponse(
    val code: HttpStatus,
    val message: String?
)
